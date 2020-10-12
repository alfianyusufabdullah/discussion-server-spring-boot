package alfianyusufabdullah.exp.discussion.repository

import alfianyusufabdullah.exp.discussion.entity.CommentEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<CommentEntity, String>