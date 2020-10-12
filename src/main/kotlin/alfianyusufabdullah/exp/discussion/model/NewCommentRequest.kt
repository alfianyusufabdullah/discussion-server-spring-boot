package alfianyusufabdullah.exp.discussion.model

data class NewCommentRequest(
        val id_parent: String,
        val creator_username: String,
        val comment: String
)