package com.example.artbook.model

/**
 * Servisten gelen cevabın modellendiği yerdir.
 */
data class ImageResponse(
        val hits: List<ImageResult>,
        val total: Int,
        val totalHits: Int
)
