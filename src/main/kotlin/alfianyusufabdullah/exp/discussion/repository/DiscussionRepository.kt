package alfianyusufabdullah.exp.discussion.repository

import alfianyusufabdullah.exp.discussion.entity.DiscussionsEntity
import org.springframework.data.jpa.repository.JpaRepository

interface DiscussionRepository : JpaRepository<DiscussionsEntity, String>