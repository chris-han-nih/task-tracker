package chris.tasktracker.task.application.service

import chris.tasktracker.task.adapter.out.TaskPersistenceAdapter
import chris.tasktracker.task.domain.Task
import chris.tasktracker.task.framework.entity.toDomain
import chris.tasktracker.task.framework.entity.toEntity
import chris.tasktracker.task.framework.repository.TaskRepository
import chris.tasktracker.task.application.port.`in`.TaskUseCase
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskService (
  private val taskPersistenceAdapter: TaskPersistenceAdapter
): TaskUseCase {
  
  override fun createTask(task: Task): Task {
    val result = taskPersistenceAdapter.createTask(task)
    return result
  }
  
  override fun getTask(id: UUID): Task {
    TODO("Not yet implemented")
  }
  
  override fun getTasks(): List<Task> {
    TODO("Not yet implemented")
  }
  
  override fun updateTask(task: Task): Task {
    TODO("Not yet implemented")
  }
  
  override fun deleteTask(id: UUID) {
    TODO("Not yet implemented")
  }
}
