package guru.qa.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PropertiesTest {

    @Test
    void propertyTest() {
        String environment = System.getProperty("environment");
        System.out.println("Test environment is: " + environment);
    }

    @Test
    void propertyNameTest() {
        String name = System.getProperty("name");
        System.out.println("My name is: " + name);
    }
    @Test
    void propertyBrowserTest() {
        String browser = System.getProperty("browser", "crome");
        System.out.println("Browser is: " + browser);
    }
}
