package chris.tasktracker.entity

import chris.tasktracker.domain.Task
import chris.tasktracker.domain.TaskStatus
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
@Table(
  name = "task",
  indexes = [
    Index(name = "idx_task_status", columnList = "status"),
    Index(name = "idx_task_start_date", columnList = "start_date DESC"),
    Index(name = "idx_task_due_date", columnList = "due_date DESC")
  ]
)
class TaskEntity (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  @Column(name="title", nullable = false, length = 100)
  val title: String,
  @Column(name="memo", nullable = false, length = 255)
  val memo: String,
  @Column(name="status", columnDefinition = "VARCHAR(20)", nullable = false, length = 20)
  @Enumerated(EnumType.STRING)
  val status: TaskStatus,
  @Column(name="start_date")
  @CreatedDate
  val startDate: LocalDateTime?,
  @Column(name="due_date")
  @LastModifiedDate
  val dueDate: LocalDateTime?,
)

fun Task.toEntity(): TaskEntity {
  return TaskEntity(
    title = title,
    memo = memo,
    status = status,
    startDate = startDate,
    dueDate = dueDate
  )
}

fun TaskEntity.toDomain(): Task {
  return Task(
    id = id!!,
    title = title,
    memo = memo,
    status = status,
    startDate = startDate,
    dueDate = dueDate
  )
}
