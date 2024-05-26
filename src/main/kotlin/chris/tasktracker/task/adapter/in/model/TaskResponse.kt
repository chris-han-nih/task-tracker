package chris.tasktracker.task.adapter.`in`.model

import chris.tasktracker.task.domain.Task
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import java.util.*

class TaskResponse (
  val id: UUID,
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
    id = this.id,
    title = this.title,
    memo = this.memo,
    status = this.status.toString(),
    startDate = this.startDate,
    dueDate = this.dueDate
  )
}
