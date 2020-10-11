package alfianyusufabdullah.exp.discussion.model

import java.util.*

data class NewDiscussionResponse(
        val idDiscussion: String,
        val creatorUsername: String,
        val createdAt: Date,
        val title: String,
        val question: String
)