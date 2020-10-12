package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.entity.CommentEntity
import alfianyusufabdullah.exp.discussion.model.CommentResponse
import alfianyusufabdullah.exp.discussion.model.NewCommentRequest
import alfianyusufabdullah.exp.discussion.repository.CommentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentServiceImpl(val commentRepository: CommentRepository) : CommentService {
    override fun replyDiscussion(newCommentRequest: NewCommentRequest): CommentResponse {
        val newComment = CommentEntity(
                idComment = "${newCommentRequest.creator_username}-${System.currentTimeMillis()}",
                idParent = newCommentRequest.id_parent,
                creatorUsername = newCommentRequest.creator_username,
                createdAt = Date(),
                comment = newCommentRequest.comment
        )

        commentRepository.save(newComment)

        return CommentResponse(
                idComment = newComment.idComment,
                idParent = newComment.idParent,
                creatorUsername = newComment.creatorUsername,
                createdAt = newComment.createdAt,
                comment = newComment.comment
        )
    }
}