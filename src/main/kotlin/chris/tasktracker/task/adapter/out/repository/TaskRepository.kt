package chris.tasktracker.task.adapter.out.repository

import chris.tasktracker.task.adapter.out.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository: JpaRepository<TaskEntity, Long> {
  fun getTaskEntityByTitle(title: String): TaskEntity?
}
