package com.example.artbook.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.artbook.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

/**
 * Kayıt altına alınan fatoğrafların listelendiği ekrandır.
 */
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class ArtFragment @Inject constructor() : Fragment(R.layout.fragment_arts) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}