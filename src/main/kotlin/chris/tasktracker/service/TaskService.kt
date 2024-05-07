package chris.tasktracker.service

import chris.tasktracker.domain.Task
import chris.tasktracker.entity.toDomain
import chris.tasktracker.entity.toEntity
import chris.tasktracker.repository.TaskRepository

class TaskService (
  private val taskRepository: TaskRepository
): TaskUseCase {
  
  override fun createTask(task: Task): Task {
    val entity = task.toEntity()
    val result = taskRepository.save(entity)
    return result.toDomain()
  }
  
  override fun getTask(id: Long): Task {
    TODO("Not yet implemented")
  }
  
  override fun getTasks(): List<Task> {
    TODO("Not yet implemented")
  }
  
  override fun updateTask(task: Task): Task {
    TODO("Not yet implemented")
  }
  
  override fun deleteTask(id: Long) {
    TODO("Not yet implemented")
  }
}
