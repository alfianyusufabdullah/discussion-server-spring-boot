package alfianyusufabdullah.exp.discussion.controller

import alfianyusufabdullah.exp.discussion.model.*
import alfianyusufabdullah.exp.discussion.service.DiscussionService
import org.springframework.web.bind.annotation.*

@RestController
class DiscussionController(val discussionService: DiscussionService) {

    @PostMapping(
            value = ["/api/discussion"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun publishNewDiscussion(@RequestBody body: NewDiscussionRequest): WebResponse<DiscussionResponse> {
        val newDiscussionResponse = discussionService.publishNewDiscussion(body)

        return WebResponse(
                code = 200,
                message = "Successfully added new discussion",
                data = newDiscussionResponse
        )
    }

    @GetMapping(
            value = ["/api/discussion"],
            produces = ["application/json"]
    )
    fun findAllDiscussions(
            @RequestParam("size", defaultValue = "10") size: Int,
            @RequestParam("page", defaultValue = "0") page: Int): WebResponse<ListDiscussionResponse> {
        val request = ListDiscussionRequest(page, size)
        val response = discussionService.findAllDiscussions(request)

        return WebResponse(
                code = 200,
                message = "Successfully retrieve all discussion",
                data = ListDiscussionResponse(
                        response.page,
                        response.size,
                        response.discussions
                )
        )
    }
}