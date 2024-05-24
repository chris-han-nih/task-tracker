package chris.tasktracker.controller

import chris.tasktracker.task.application.port.`in`.TaskUseCase
import chris.tasktracker.task.adapter.`in`.controller.TaskTrackerController
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.mockk
import org.springframework.test.web.reactive.server.WebTestClient

class TaskControllerTest: BehaviorSpec({
  
  lateinit var webTestClient: WebTestClient
  val taskUseCase: TaskUseCase = mockk<TaskUseCase>()
  
  beforeTest {
    webTestClient = WebTestClient.bindToController(TaskTrackerController(taskUseCase)).build()
  }
  
  Given("POST/ Task Controller 주어졌을 때") {
    When("정상적인 요청을 하면") {
      val response = webTestClient
        .post()
        .uri("/task")
        .bodyValue("task")
        .exchange()
      
      Then("정상적인 응답을 받는다") {
        response.expectStatus().isOk
      }
    }
  }
})
