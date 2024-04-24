package chris.tasktracker.domain

import com.fasterxml.jackson.annotation.JsonCreator

enum class TaskStatus {
    OPEN,
    IN_PROGRESS,
    DONE;
  
  companion object {
    @JsonCreator
    @JvmStatic
    operator fun invoke(value: String): TaskStatus = valueOf(value.uppercase())
  }
}
