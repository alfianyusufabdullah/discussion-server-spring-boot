package alfianyusufabdullah.exp.discussion.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class CommentEntity(
        @Id
        val idComment: String,

        @Column(name = "id_parent")
        val idParent: String,

        @Column(name = "creator_username")
        val creatorUsername: String,

        @Column(name = "creator_at")
        val createdAt: Date,

        @Column(name = "comment")
        val comment: String
)