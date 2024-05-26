package chris.tasktracker.task.adapter.`in`.model

import chris.tasktracker.task.domain.Task
import chris.tasktracker.task.domain.TaskStatus
import chris.tasktracker.util.ValueOfEnum
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import org.hibernate.validator.constraints.Length
import java.time.LocalDateTime

data class TaskCreateRequest(
  @field:NotBlank(message = "Title must not be blank")
  @field:Length(min = 3, max = 100, message = "Title must be between 3 and 100 characters")
  @JsonProperty("title")
  val title: String,
  @field:NotBlank(message = "Memo must not be blank")
  @field:Length(min = 3, max = 255, message = "Memo must be between 3 and 255 characters")
  @JsonProperty("memo")
  val memo: String,
  @JsonProperty("start_date")
  val startDate: LocalDateTime?,
  @JsonProperty("due_date")
  val dueDate: LocalDateTime?,
) {
  @field:NotBlank(message = "Status must not be blank")
  @field:ValueOfEnum(enumClass = TaskStatus::class, message = "Status must be a valid value")
  var status: String? = null
    set(value) {
      field = value?.uppercase()
    }
  
  fun toDomain(): Task {
    return Task(
      title = title,
      memo = memo,
      status = TaskStatus.valueOf(status!!),
      startDate = startDate,
      dueDate = dueDate
    )
  }
}
