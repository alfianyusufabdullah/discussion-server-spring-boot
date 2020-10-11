package alfianyusufabdullah.exp.discussion.model

data class ListDiscussionResponse(
        val page: Int,
        val size: Int,
        val discussions: List<DiscussionResponse> = listOf()
)