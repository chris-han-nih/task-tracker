package chris.tasktracker.configuration

import chris.tasktracker.service.TaskService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TaskTrackerConfiguration {
  @Bean
  fun taskService(): TaskService {
    return TaskService()
  }
}
