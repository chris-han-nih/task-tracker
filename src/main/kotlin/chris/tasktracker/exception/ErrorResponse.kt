package chris.tasktracker.exception

data class ErrorResponse(
  val code: Int,
  val message: String,
)
