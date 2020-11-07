package com.uigitdev.android.kotlin.mb.design

import android.content.res.Resources
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.uigitdev.android.kotlin.mb.R

class MaterialButton(private val view: View) {
    private lateinit var button_card_parent: CardView
    private lateinit var button_click_parent: RelativeLayout
    private lateinit var button_icon: ImageView
    private lateinit var button_progress: ProgressBar
    private lateinit var button_text: TextView

    init {
        setType()
    }

    private fun setType() {
        button_card_parent = view.findViewById(R.id.button_card_parent)
        button_click_parent = view.findViewById(R.id.button_click_parent)
        button_icon = view.findViewById(R.id.button_icon)
        button_progress = view.findViewById(R.id.button_progress)
        button_text = view.findViewById(R.id.button_text)
    }

    private fun dpToPixel(dp: Int): Float {
        return (dp * Resources.getSystem().displayMetrics.density)
    }

    fun getButton(): RelativeLayout {
        return button_click_parent
    }

    fun setButtonText(text: String) {
        button_text.text = text
    }

    fun setButtonTextColor(color: String) {
        button_text.setTextColor(Color.parseColor(color))
    }

    fun setBackgroundColor(color: String?) {
        button_card_parent.setCardBackgroundColor(Color.parseColor(color))
    }

    fun setVectorIcon(iconId: Int) {
        button_icon.setImageResource(iconId)
    }

    fun setRadiusPixel(radius: Int) {
        button_card_parent.radius = dpToPixel(radius)
    }

    fun setProgressVisibility(isVisible: Boolean) {
        if (isVisible) {
            button_progress.visibility = View.VISIBLE
        } else {
            button_progress.visibility = View.GONE
        }
    }

    fun setProgressColor(color: String) {
        button_progress.indeterminateDrawable.setColorFilter(
            Color.parseColor(color),
            PorterDuff.Mode.MULTIPLY
        )
    }

    fun setIconColor(color: String) {
        button_icon.setColorFilter(Color.parseColor(color), PorterDuff.Mode.SRC_IN)
    }
}