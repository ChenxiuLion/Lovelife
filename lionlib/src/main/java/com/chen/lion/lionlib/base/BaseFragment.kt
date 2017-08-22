package com.chen.lion.lionlib.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout

/**
 * Created by chenxiu on 2017/8/22.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

abstract class  BaseFragment : Fragment() {

    protected var mView: View? = null!!


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (mView == null) {
            mView =  inflater?.inflate(initView(),null)
        } else {
            val group = mView!!.parent as ViewGroup
            group?.removeView(mView)
        }
        return mView
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        initData()
        super.onViewCreated(view, savedInstanceState)
    }

    protected abstract fun initView():Int

    protected abstract fun initData()


}

