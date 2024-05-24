package chris.tasktracker.task.adapter.`in`.controller

import chris.tasktracker.task.adapter.`in`.controller.model.TaskCreateRequest
import chris.tasktracker.task.adapter.`in`.controller.model.toResponse
import chris.tasktracker.task.application.port.`in`.TaskUseCase
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class TaskTrackerController (
  val taskUseCase: TaskUseCase
) {
  
  @PostMapping("/tasks")
  fun createTask(
    @Validated
    @RequestBody
    request: TaskCreateRequest
  ): ResponseEntity<*>{
    
    val task = taskUseCase.createTask(request.toDomain())
    
    return ResponseEntity
      .status(201)
      .body(task.toResponse())
  }
  
  @GetMapping("/task")
  fun getTask(): String {
    return "task"
  }
}
