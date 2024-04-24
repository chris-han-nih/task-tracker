package chris.tasktracker.domain

import java.time.LocalDateTime

class Task (
  val id: Long? = null,
  val title: String,
  val memo: String,
  val status: TaskStatus,
  val startDate: LocalDateTime?,
  val dueDate: LocalDateTime?,
) {
  init {
    require(title.isNotBlank()) { "Title must not be blank" }
    require(memo.isNotBlank()) { "Memo must not be blank" }
    require(startDate == null || dueDate == null || startDate.isBefore(dueDate)) { "Start date must be before due date" }
  }
}
