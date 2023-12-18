// ImageDisplayActivity.kt
package com.bignerdranch.android.photogallery

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.bignerdranch.android.photogallery.databinding.ImageDisplayActivityBinding

class ImageDisplayActivity : AppCompatActivity() {

    private lateinit var displayedImage: ImageView
    private lateinit var imageTitle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_display_activity)

        displayedImage = findViewById(R.id.displayed_image)
        imageTitle = findViewById(R.id.image_title)

        val imageUrl = intent.getStringExtra("IMAGE_URL")
        val title = intent.getStringExtra("IMAGE_TITLE")

        // Load image from URL using your preferred image loading library (e.g., Coil, Picasso, Glide)
        imageUrl?.let {
            displayedImage.load(it) {

            }
        }

        // Display the title
        imageTitle.text = title ?: "No title available"
    }
}
