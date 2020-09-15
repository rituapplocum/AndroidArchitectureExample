package com.applocum.androidarchitectureexample.mvvm.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.applocum.androidarchitectureexample.R
import com.applocum.androidarchitectureexample.databinding.ActivitySignupBinding
import com.applocum.androidarchitectureexample.mvvm.signup.model.AuthListner
import com.applocum.androidarchitectureexample.mvvm.signup.model.AuthViewModel

class SignupActivity : AppCompatActivity(),AuthListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //auto generate file ActivitySignupBinding according to the name of activity
val dataBinding:ActivitySignupBinding=DataBindingUtil.setContentView(this,R.layout.activity_signup)
        val viewModel=ViewModelProviders.of(this).get(AuthViewModel::class.java)
        dataBinding.viewmodel=viewModel
        viewModel.authListner=this
    }

    override fun onStarted() {
        Toast.makeText(this,"Login Started",Toast.LENGTH_LONG).show()
    }

    override fun onSucess() {
        Toast.makeText(this,"Login Sucess",Toast.LENGTH_LONG).show()

    }

    override fun onFailure(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()

    }
}