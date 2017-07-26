package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String... args) {
        System.out.printf("%s%n", new App().getGreeting());
    }

    public String getGreeting() {
        return "Hello, world";
    }
}