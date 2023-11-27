public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (HighLevelException e) {
            e.printStackTrace();
        }
    }

    static void method1() throws HighLevelException {
        try {
            method2();
        } catch (LowLevelException lle) {
            throw new HighLevelException("Method1 faced an issue.", lle);
        }
    }

    static void method2() throws LowLevelException {
        throw new LowLevelException("A low-level exception occurred.");
    }
}

class HighLevelException extends Exception {
    public HighLevelException(String message, Throwable cause) {
        super(message, cause);
    }
}

class LowLevelException extends Exception {
    public LowLevelException(String message) {
        super(message);
    }
}