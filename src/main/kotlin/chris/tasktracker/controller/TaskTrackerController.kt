package chris.tasktracker.controller

import chris.tasktracker.service.TaskUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class TaskTrackerController (
  val taskUseCase: TaskUseCase
) {
  
  @PostMapping("/task")
  fun createTask(
    @RequestBody
    task: String
  ): String {
    return taskUseCase.getTask()
  }
  
  @GetMapping("/task")
  fun getTask(): String {
    return "task"
  }
}
