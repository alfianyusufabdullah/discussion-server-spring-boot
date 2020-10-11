package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.model.DiscussionResponse
import alfianyusufabdullah.exp.discussion.model.ListDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.ListDiscussionResponse
import alfianyusufabdullah.exp.discussion.model.NewDiscussionRequest

interface DiscussionService {

    fun publishNewDiscussion(newDiscussionRequest: NewDiscussionRequest): DiscussionResponse

    fun findAllDiscussions(listDiscussionRequest: ListDiscussionRequest): ListDiscussionResponse
}