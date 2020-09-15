package com.applocum.mvploginform.view

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.applocum.androidarchitectureexample.R
import com.applocum.mvploginform.presenter.LoginInteractor
import com.applocum.mvploginform.presenter.LoginPresenter
import com.applocum.mvploginform.presenter.LoginView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),LoginView {
    private val presenter = LoginPresenter(this, LoginInteractor())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setListner
        btn_login_login.setOnClickListener(View.OnClickListener {             validateCredentials()

        })


    }




    private fun validateCredentials() {
        presenter.validateCredentials( et_login_username.text.toString(), et_login_password.text.toString())
    }
    override fun showProgress() {
progress_login.visibility= VISIBLE    }

    override fun hideProgress() {
        progress_login.visibility= GONE    }

    override fun setUsernameError() {
Toast.makeText(this,"Enter Username",Toast.LENGTH_SHORT).show()
    }

    override fun setPasswordError() {
Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show()    }

    override fun navigateToHome() {
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
    }


}