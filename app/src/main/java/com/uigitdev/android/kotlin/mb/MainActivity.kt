package com.uigitdev.android.kotlin.mb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uigitdev.android.kotlin.mb.design.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMaterialButton()
    }

    private fun setMaterialButton(){
        val button = MaterialButton(findViewById(R.id.item_material_button))

        button.setButtonText("Buy now")
        button.setButtonTextColor("#FFFFFF")
        button.setBackgroundColor("#167CFC")
        button.setVectorIcon(R.drawable.ic_baseline_shopping_basket_24)
        button.setProgressVisibility(false)
        button.setProgressColor("#FFFFFF")
        button.setIconColor("#FFFFFF")
        button.setRadiusPixel(2)

        button.getButton().setOnClickListener(View.OnClickListener {
            button.setProgressVisibility(true)
        })
    }

}