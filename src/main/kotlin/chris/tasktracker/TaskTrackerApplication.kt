package chris.tasktracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class TaskTrackerApplication

fun main(args: Array<String>) {
  runApplication<TaskTrackerApplication>(*args)
}
