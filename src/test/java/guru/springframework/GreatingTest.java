package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - called Once !!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("in before each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Jonny"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("in after each ...");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - called Once !!!!");
    }
}