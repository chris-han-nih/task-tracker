package chris.tasktracker.service

import chris.tasktracker.domain.Task


interface TaskUseCase {
  fun createTask(task: Task): Task
  fun getTask(id: Long): Task
  fun getTasks(): List<Task>
  fun updateTask(task: Task): Task
  fun deleteTask(id: Long)
}
