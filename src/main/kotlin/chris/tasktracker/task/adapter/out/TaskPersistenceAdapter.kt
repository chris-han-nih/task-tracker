package chris.tasktracker.task.adapter.out

import chris.tasktracker.task.application.port.out.TaskPersistencePort
import chris.tasktracker.task.domain.Task
import chris.tasktracker.task.framework.entity.toDomain
import chris.tasktracker.task.framework.entity.toEntity
import chris.tasktracker.task.framework.repository.TaskRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class TaskPersistenceAdapter(
  private val taskRepository: TaskRepository
): TaskPersistencePort {
  override fun createTask(task: Task): Task {
    val entity = task.toEntity()
    val result = taskRepository.save(entity)
    return result.toDomain()
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
