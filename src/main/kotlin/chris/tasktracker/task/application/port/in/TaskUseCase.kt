package chris.tasktracker.task.application.port.`in`

import chris.tasktracker.task.domain.Task
import java.util.*

interface TaskUseCase {
  fun createTask(task: Task): Task
  fun getTask(id: UUID): Task
  fun getTasks(): List<Task>
  fun updateTask(task: Task): Task
  fun deleteTask(id: UUID)
}
