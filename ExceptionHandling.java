public class ExceptionHandling {
    public static class EmptyStackException extends Exception {
        public EmptyStackException() {
            super("Exception Thrown: Stack is empty!");
        }

    }

    public static class IllegalInputException extends Exception {
        public IllegalInputException() {
            super("Exception Thrown: Illegal Input!");
        }
    }

}
