package chris.tasktracker.model

import chris.tasktracker.domain.Task
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class TaskResponse (
  val id: Long,
  val title: String,
  val memo: String,
  val status: String,
  @JsonProperty("start_date")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  val startDate: LocalDateTime?,
  @JsonProperty("due_date")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  val dueDate: LocalDateTime?,
)

fun Task.toResponse(): TaskResponse {
  return TaskResponse(
    id = this.id ?: 0,
    title = this.title,
    memo = this.memo,
    status = this.status.toString(),
    startDate = this.startDate,
    dueDate = this.dueDate
  )
}
