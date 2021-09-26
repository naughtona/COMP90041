public class InvalidCoinFileException extends Exception {

    public InvalidCoinFileException() {
        super("Coin File has invalid format.");
    }

    public InvalidCoinFileException(String message) {
        super(message);
    }
    
}

