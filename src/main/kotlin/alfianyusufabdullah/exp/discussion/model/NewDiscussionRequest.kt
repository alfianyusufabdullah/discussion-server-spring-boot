package alfianyusufabdullah.exp.discussion.model

data class NewDiscussionRequest(
        val creatorUsername: String,
        val title: String,
        val question: String
)