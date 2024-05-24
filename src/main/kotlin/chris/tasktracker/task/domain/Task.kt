package chris.tasktracker.task.domain

import com.github.f4b6a3.uuid.UuidCreator
import java.time.LocalDateTime
import java.util.*

class Task(
  id: UUID? = null,
  val title: String,
  val memo: String,
  val status: TaskStatus,
  val startDate: LocalDateTime? = null,
  val dueDate: LocalDateTime? = null
) {
  val id: UUID = id ?: UuidCreator.getTimeOrderedEpoch()
  
  init {
    validate()
  }
  
  private fun validate() {
    require(title.isNotBlank()) { "Title must not be blank" }
    require(memo.isNotBlank()) { "Memo must not be blank" }
    require(startDate == null || dueDate == null || startDate.isBefore(dueDate)) { "Start date must be before due date" }
  }
}
