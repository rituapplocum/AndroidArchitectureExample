package com.applocum.androidarchitectureexample.mvvm.signup.model

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class AuthViewModel:ViewModel(){

    var email:String?=null
    var password:String?=null
    var authListner:AuthListner?=null

//Button login fun as it is a view we need to pass view obj

    fun onLoginButtonClick(view:View) {
        if (email.isNullOrEmpty() || password.isNullOrEmpty())
        {
          //display error msg
            authListner?.onFailure("Invalid email or password")
            return
        }
        authListner?.onSucess()
        //success
    }


}