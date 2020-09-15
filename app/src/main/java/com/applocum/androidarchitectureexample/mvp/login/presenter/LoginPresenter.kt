package com.applocum.mvploginform.presenter

import com.applocum.mvploginform.model.UserModel

 class LoginPresenter (var loginView: LoginView?, val loginInteractor: LoginInteractor) :
     LoginInteractor.OnLoginFinishedListener {

     fun validateCredentials(username: String, password: String) {
         loginView?.showProgress()
         loginInteractor.login(username, password, this)
     }

     fun onDestroy() {
         loginView = null
     }

     override fun onUsernameError() {
         loginView?.apply {
             setUsernameError()
             hideProgress()
         }
     }

     override fun onPasswordError() {
         loginView?.apply {
             setPasswordError()
             hideProgress()
         }
     }

     override fun onSuccess() {
         loginView?.apply {
             navigateToHome()
             hideProgress()

         }
     }
 }



interface LoginView
{
    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToHome()

}