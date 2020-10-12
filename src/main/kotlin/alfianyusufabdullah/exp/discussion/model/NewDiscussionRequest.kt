package alfianyusufabdullah.exp.discussion.model

data class NewDiscussionRequest(
        val creator_username: String,
        val title: String,
        val question: String
)