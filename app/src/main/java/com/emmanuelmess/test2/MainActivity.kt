package com.emmanuelmess.test2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = BitmapFactory.decodeResource(resources, R.drawable.image);

        val bmp32: Bitmap = image.copy(Bitmap.Config.ARGB_8888, true)

        background.setImageBitmap(process(bmp32))
    }

    private external fun process(b: Bitmap): Bitmap

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
