package alfianyusufabdullah.exp.discussion.model

import java.util.*

data class DiscussionResponse(
        val idDiscussion: String,
        val creatorUsername: String,
        val createdAt: Date,
        val title: String,
        val question: String,
        val replyCount: Int = 0
)