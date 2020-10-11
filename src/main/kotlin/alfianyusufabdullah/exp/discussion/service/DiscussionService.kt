package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.model.NewDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.NewDiscussionResponse

interface DiscussionService {

    fun publishNewDiscussion(newDiscussionRequest: NewDiscussionRequest): NewDiscussionResponse
}