package pkg;

import org.tinylog.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.error("This is an ERROR message");
        Logger.warn("This is a WARN string");
        Logger.info("This is a INFO message");
        Logger.debug("This is a DEBUG message");
        Logger.trace("This is a TRACE message");
//        Logger.info("User's name is " + System.getProperty("user.name"));
        Logger.info("User's name is {}", System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"), "Something is wrong");
    }
}
