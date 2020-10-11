package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.entity.DiscussionsEntity
import alfianyusufabdullah.exp.discussion.model.NewDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.DiscussionResponse
import alfianyusufabdullah.exp.discussion.model.ListDiscussionRequest
import alfianyusufabdullah.exp.discussion.model.ListDiscussionResponse
import alfianyusufabdullah.exp.discussion.repository.DiscussionRepository
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class DiscussionServiceImpl(val discussionRepository: DiscussionRepository) : DiscussionService {

    override fun publishNewDiscussion(newDiscussionRequest: NewDiscussionRequest): DiscussionResponse {
        val newDiscussion = DiscussionsEntity(
                idDiscussion = "${newDiscussionRequest.creatorUsername}-${System.currentTimeMillis()}",
                creatorUsername = newDiscussionRequest.creatorUsername,
                createdAt = Date(),
                title = newDiscussionRequest.title,
                question = newDiscussionRequest.question
        )

        discussionRepository.save(newDiscussion)

        return DiscussionResponse(
                idDiscussion = newDiscussion.idDiscussion,
                creatorUsername = newDiscussion.creatorUsername,
                createdAt = newDiscussion.createdAt,
                title = newDiscussion.title,
                question = newDiscussion.question
        )
    }

    override fun findAllDiscussions(listDiscussionRequest: ListDiscussionRequest): ListDiscussionResponse {
        val pageDiscussions = discussionRepository.findAll(PageRequest.of(listDiscussionRequest.page, listDiscussionRequest.size))
        val discussions = pageDiscussions.get().collect(Collectors.toList())

        return ListDiscussionResponse(
                pageDiscussions.totalPages,
                pageDiscussions.size,
                discussions.map {
                    DiscussionResponse(
                            idDiscussion = it.idDiscussion,
                            creatorUsername = it.creatorUsername,
                            createdAt = it.createdAt,
                            title = it.title,
                            question = it.question
                    )
                }
        )
    }
}