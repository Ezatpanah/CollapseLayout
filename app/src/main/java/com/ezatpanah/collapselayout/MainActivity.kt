package com.ezatpanah.collapselayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.skydoves.expandablelayout.ExpandableAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //ExpandableAnimation.OVERSHOOT
      //ExpandableAnimation.ACCELERATE
      //ExpandableAnimation.BOUNCE
      //ExpandableAnimation.NORMAL


        expandable.setOnExpandListener {
            if (it) {
                toast("expanded")
            } else {
                toast("collapse")

            }
        }
        expandable.parentLayout.setOnClickListener {
            expandable.toggleLayout()
            expandable1.collapse()
            expandable2.collapse()
        }


        expandable1.setOnExpandListener {
            if (it) {
                toast("expanded")
            } else {
                toast("collapse")
            }
        }
        expandable1.parentLayout.setOnClickListener { expandable1.toggleLayout()
            expandable.collapse()
            expandable2.collapse()}

        expandable2.setOnExpandListener {
            if (it) {
                toast("expanded")

            } else {
                toast("collapse")
            }
        }
        expandable2.parentLayout.setOnClickListener { expandable2.toggleLayout()
            expandable1.collapse()
            expandable.collapse()}

    }

    private fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}