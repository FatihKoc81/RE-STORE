
package com.restore.photorecovery

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(11, 16, 32)
        window.navigationBarColor = Color.rgb(11, 16, 32)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(11, 16, 32))
        }

        val logo = TextView(this).apply {
            text = "◈"
            textSize = 64f
            gravity = Gravity.CENTER
            setTextColor(Color.rgb(65, 220, 205))
        }

        val title = TextView(this).apply {
            text = "Re:Store"
            textSize = 36f
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
        }

        val subtitle = TextView(this).apply {
            text = "PHOTO RECOVERY"
            textSize = 14f
            gravity = Gravity.CENTER
            setTextColor(Color.rgb(65, 220, 205))
        }

        val description = TextView(this).apply {
            text = "Kaybolan anılarını yeniden keşfet."
            textSize = 16f
            gravity = Gravity.CENTER
            setTextColor(Color.LTGRAY)
        }

        root.addView(logo)
        root.addView(title)
        root.addView(subtitle)

        root.addView(description)

        setContentView(root)
    }
}
