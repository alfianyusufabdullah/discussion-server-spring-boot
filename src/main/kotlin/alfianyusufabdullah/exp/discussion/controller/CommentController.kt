package alfianyusufabdullah.exp.discussion.controller

import alfianyusufabdullah.exp.discussion.model.*
import alfianyusufabdullah.exp.discussion.service.CommentService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController(val commentService: CommentService) {
    @PostMapping(
            value = ["/api/comment"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun replyDiscussion(@RequestBody body: NewCommentRequest): WebResponse<CommentResponse> {
        val newDiscussionResponse = commentService.replyDiscussion(body)

        return WebResponse(
                code = 200,
                message = "Successfully reply discussion",
                data = newDiscussionResponse
        )
    }
}