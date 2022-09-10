package com.example.artbook.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.artbook.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Kayot altına alınacak fotoğrafın detaylarının girildiği ekrandır.
 */
@AndroidEntryPoint
class ArtDetailsFragment @Inject constructor() : Fragment(R.layout.fragment_art_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}