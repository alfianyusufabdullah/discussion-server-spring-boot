package alfianyusufabdullah.exp.discussion.controller

import alfianyusufabdullah.exp.discussion.model.DiscussionResponse
import alfianyusufabdullah.exp.discussion.model.NewDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.NewDiscussionResponse
import alfianyusufabdullah.exp.discussion.service.DiscussionService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DiscussionController(val discussionService: DiscussionService) {

    @PostMapping(
            value = ["/api/discussion"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun publishNewDiscussion(@RequestBody body: NewDiscussionRequest): DiscussionResponse<NewDiscussionResponse> {
        val newDiscussionResponse = discussionService.publishNewDiscussion(body)

        return DiscussionResponse(
                code = 200,
                message = "Successfully added new discussion",
                data = newDiscussionResponse
        )
    }
}