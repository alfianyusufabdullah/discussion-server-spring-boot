package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.entity.DiscussionsEntity
import alfianyusufabdullah.exp.discussion.model.NewDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.NewDiscussionResponse
import alfianyusufabdullah.exp.discussion.repository.DiscussionRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class DiscussionServiceImpl(val discussionRepository: DiscussionRepository) : DiscussionService {

    override fun publishNewDiscussion(newDiscussionRequest: NewDiscussionRequest): NewDiscussionResponse {
        val newDiscussion = DiscussionsEntity(
                idDiscussion = "${newDiscussionRequest.creatorUsername}-${System.currentTimeMillis()}",
                creatorUsername = newDiscussionRequest.creatorUsername,
                createdAt = Date(),
                title = newDiscussionRequest.title,
                question = newDiscussionRequest.question
        )

        discussionRepository.save(newDiscussion)

        return NewDiscussionResponse(
                idDiscussion = newDiscussion.idDiscussion,
                creatorUsername = newDiscussion.creatorUsername,
                createdAt = newDiscussion.createdAt,
                title = newDiscussion.title,
                question = newDiscussion.question
        )
    }
}