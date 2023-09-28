package com.example.drivewiseconnect2.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.drivewiseconnect2.models.Product
import com.example.drivewiseconnect2.navigation.ROUTE_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class ProductRepository(var navController: NavHostController, var context: Context) {
    var authRepository:AuthRepository
    var progress: ProgressDialog
    var products:ArrayList<Product>
    init {
        authRepository = AuthRepository(navController, context)
        if (!authRepository.isLoggedIn()){
            navController.navigate(ROUTE_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")

        products = mutableListOf<Product>() as ArrayList<Product>
    }

    fun saveProduct(productName:String, productQuantity:String, ProductPrice:String){
        var id = System.currentTimeMillis().toString()
        var productData = Product(productName,productQuantity,ProductPrice, id)
        var productRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        progress.show()
        productRef.setValue(productData).addOnCompleteListener {
            progress.dismiss()
            if(it.isSuccessful){
                Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
            }else(
                    Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT).show()
                    )
        }
    }
    fun viewProduct():ArrayList<Product>{
        var ref = FirebaseDatabase.getInstance().getReference().child("Products")
        progress.show()
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                progress.dismiss()
                products.clear()
                for (snap in snapshot.children) {
                    var product = snap.getValue(Product::class.java)
                    products.add(product!!)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                progress.dismiss()
                Toast.makeText(context, "DB Locked", Toast.LENGTH_SHORT).show()
            }
        })
        return products
    }
    fun deleteProduct(id:String){
        val delRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        progress.show()
        delRef.removeValue().addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun updateProduct(){

    }

}