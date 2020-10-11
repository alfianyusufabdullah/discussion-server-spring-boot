package alfianyusufabdullah.exp.discussion.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "discussion")
data class DiscussionsEntity(
        @Id
        val idDiscussion: String,

        @Column(name = "creator_username")
        val creatorUsername: String,

        @Column(name = "created_at")
        val createdAt: Date,

        @Column(name = "title")
        val title: String,

        @Column(name = "question")
        val question: String
)