Security filters exceptions are not handled by RestControllerAdvice ExceptionHandler.

The way to handle such exceptions is by adding a filter to the SecurityFilterChain.

This filter should inject and use HandlerExceptionResolver.

This filter will try-catch the rest of security filter chain and will throw exceptions to the RestControllerAdvice ExceptionHandler.