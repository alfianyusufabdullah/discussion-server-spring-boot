package alfianyusufabdullah.exp.discussion.model

data class DiscussionResponse<T>(
        val code: Int,
        val message: String,
        val data: T?
)