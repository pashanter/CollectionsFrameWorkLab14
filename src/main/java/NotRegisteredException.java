public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String name) {
        super("Player with" + name + "not found");
    }
}
