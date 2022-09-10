package com.example.artbook.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.artbook.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Search işelemi yapılarak fotoğrafların listelendiği ekrandır.
 */
@AndroidEntryPoint
class ImageApiFragment @Inject constructor() : Fragment(R.layout.fragment_image_api) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}