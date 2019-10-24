public interface Logger {
    void log(String message);

    public static Logger warn(){
        return message -> System.out.println("Warning "+message);
    }

    public static Logger error(){
        return message -> System.out.println("Error "+message);
    }
}
