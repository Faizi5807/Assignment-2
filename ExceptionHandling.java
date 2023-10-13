public class ExceptionHandling {
    public static class EmptyStackException extends Exception {
        public EmptyStackException() {
            super("Throwing an Exception: Stack is empty!");
        }

    }

    public static class IllegalInputException extends Exception {
        public IllegalInputException() {
            super("Throwing an exception: Illegal Input!");
        }
    }

}
