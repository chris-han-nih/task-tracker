package chris.tasktracker.task.framework.repository

import chris.tasktracker.task.framework.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository: JpaRepository<TaskEntity, Long> {
  fun getTaskEntityByTitle(title: String): TaskEntity?
}
