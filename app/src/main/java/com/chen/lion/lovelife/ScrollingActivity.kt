package com.chen.lion.lovelife

import com.chen.lion.lionlib.base.BaseActivity

class ScrollingActivity : BaseActivity() {

    override fun initView(): Int {
        return R.layout.activity_scrolling

    }

    override fun initData() {
        showToast("测试")
    }
}
