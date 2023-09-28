package com.example.drivewiseconnect2.models

class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var userId:String = ""

    constructor(name: String, email: String, password: String, userId: String) {
        this.name = name
        this.email = email
        this.password = password
        this.userId = userId
    }

    constructor()
}