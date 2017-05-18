package com.nanofaroque.reboot
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    //static final string TAG="something";

    override fun onClick(v: View?) {
        try {
            Runtime.getRuntime().exec(arrayOf("su", "-c", "reboot"))
        } catch (ex: Exception) {
            Log.e("ERR", "Error ", ex)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        this.button.setOnClickListener(this);
        this.button.setText("Reboot the System");
    }
}
