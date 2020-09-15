package com.applocum.mvploginform.model

class UserModel(username:String,pass:String) {
    private var name:String =""
    private var password:String =""
    init {

        name=username
        password=pass
    }

    fun checkValidity(username: String,pass: String):Boolean
    {
        if (username==null || pass== null)
        {
            return false
        }
        else
            return true
    }


}