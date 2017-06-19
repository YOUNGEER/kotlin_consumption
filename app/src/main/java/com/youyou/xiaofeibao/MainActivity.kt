package com.youyou.xiaofeibao

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.onClick
import org.jetbrains.anko.startActivity

//young   wangyangstudy@163.com

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv.setOnClickListener { view->
//
//        }
        tv.onClick {
            Toast.makeText(this@MainActivity, "hahha", Toast.LENGTH_SHORT).show()
        }
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        startActivity<LoginActivity>("key" to "from MainActivity")
    }
}


