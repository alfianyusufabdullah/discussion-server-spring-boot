package alfianyusufabdullah.exp.discussion.service

import alfianyusufabdullah.exp.discussion.model.CommentResponse
import alfianyusufabdullah.exp.discussion.model.NewCommentRequest

interface CommentService {

    fun replyDiscussion(newCommentRequest: NewCommentRequest): CommentResponse
}