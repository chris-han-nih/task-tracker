package chris.tasktracker.exception

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.rmi.ServerException

@ControllerAdvice
class GlobalExceptionHandler {
  
  @ExceptionHandler(ServerException::class)
  fun handleServerException(e: ServerException): ResponseEntity<*> {
    return ResponseEntity(
      ErrorResponse(
        code = 5000,
        message = "Server error",
      ),
      HttpStatus.INTERNAL_SERVER_ERROR
    )
  }
  
  @ExceptionHandler(RuntimeException::class)
  fun handleRuntimeException(e: RuntimeException): ResponseEntity<*> {
    
    return ResponseEntity(
      ErrorResponse(
        code = 5001,
        message = "Internal server error",
      ),
      HttpStatus.INTERNAL_SERVER_ERROR
    )
  }
  
  @ExceptionHandler(UnauthorizedException::class)
  fun handleUnauthorizedException(e: UnauthorizedException): ResponseEntity<*> {
    
    return ResponseEntity(
      ErrorResponse(
        code = e.code,
        message = e.message
      ),
      HttpStatus.UNAUTHORIZED
    )
  }
  
  @ExceptionHandler(MethodArgumentNotValidException::class)
  fun notValid(ex: MethodArgumentNotValidException, request: HttpServletRequest): ResponseEntity<*> {
    
    val errors = ex.allErrors.map { it.defaultMessage ?: "Error" }
    val result = mapOf("errors" to errors)
    
    return ResponseEntity(result, HttpStatus.BAD_REQUEST)
  }
  
  @ExceptionHandler(IllegalArgumentException::class)
  fun illegalArgument(e: IllegalArgumentException): ResponseEntity<*> {
    
    return ResponseEntity(mapOf("errors" to e.message), HttpStatus.BAD_REQUEST)
  }
  
  @ExceptionHandler(HttpMessageNotReadableException::class)
  fun notReadable(ex: HttpMessageNotReadableException, request: HttpServletRequest): ResponseEntity<*> {
    val errors = ex.message
    val result = mapOf("errors" to errors)
    
    return ResponseEntity(result, HttpStatus.BAD_REQUEST)
  }
}
