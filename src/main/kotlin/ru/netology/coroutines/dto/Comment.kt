package ru.netology.coroutines.dto

data class Comment(
    val id: Long,
    val postId: Long,
    val authorId: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
