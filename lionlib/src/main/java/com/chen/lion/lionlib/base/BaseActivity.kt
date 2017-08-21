package com.chen.lion.lionlib.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 *
 * Created by chenxiu on 2017/8/21.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initView())
        initData()
    }

    fun getContext() = this


    protected abstract fun initView(): Int

    protected abstract fun initData()

    protected fun showToast(str : String){
        Toast.makeText(getContext(),str, Toast.LENGTH_SHORT).show()
    }

}
