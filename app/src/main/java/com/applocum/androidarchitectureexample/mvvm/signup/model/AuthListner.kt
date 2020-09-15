package com.applocum.androidarchitectureexample.mvvm.signup.model

interface AuthListner {

    //display progress
    fun onStarted()
    fun onSucess()
    fun onFailure(message:String)

}