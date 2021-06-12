package com.example.finishedproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finishedproject.base.BaseActivity
import com.example.finishedproject.base.BaseViewModel
import com.example.finishedproject.databinding.ActivitySplashBinding

class SplashViewModel : BaseViewModel() {

}

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>(
    SplashViewModel::class
) {
    override fun getViewBinding(): ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)

    override fun setupViews() {

    }

    override fun subscribeToLiveData() {

    }

}