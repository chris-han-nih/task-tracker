package chris.tasktracker.task.adapter.out

import chris.tasktracker.task.application.port.out.TaskPersistencePort
import chris.tasktracker.task.domain.Task
import java.util.*

class TaskPersistenceAdapter: TaskPersistencePort {
  override fun createTask(task: Task): Task {
    TODO("Not yet implemented")
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
