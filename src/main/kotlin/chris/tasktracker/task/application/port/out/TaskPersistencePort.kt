package chris.tasktracker.task.application.port.out

import chris.tasktracker.task.domain.Task
import java.util.*

interface TaskPersistencePort {
  fun createTask(task: Task): Task
  fun getTask(id: UUID): Task
  fun getTasks(): List<Task>
  fun updateTask(task: Task): Task
  fun deleteTask(id: UUID)
}
