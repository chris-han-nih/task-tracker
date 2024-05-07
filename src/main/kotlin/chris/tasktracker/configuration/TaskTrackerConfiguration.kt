package chris.tasktracker.configuration

import chris.tasktracker.repository.TaskRepository
import chris.tasktracker.service.TaskService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TaskTrackerConfiguration {
  @Bean
  fun taskService(taskRepository: TaskRepository): TaskService {
    return TaskService(taskRepository)
  }
}
