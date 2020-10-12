package alfianyusufabdullah.exp.discussion.model

import java.util.*

data class CommentResponse(
        val idComment: String,
        val idParent: String,
        val creatorUsername: String,
        val createdAt: Date,
        val comment: String
)