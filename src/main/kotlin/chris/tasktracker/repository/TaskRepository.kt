package chris.tasktracker.repository

import chris.tasktracker.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository: JpaRepository<TaskEntity, Long>
