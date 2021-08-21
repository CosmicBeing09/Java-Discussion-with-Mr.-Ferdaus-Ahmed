package java_discussion_27;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    static Demo d;

    @BeforeAll
    static void init(){
        d = new Demo();
    }

    @Test
    void sum(){
        assertEquals(7, d.sum(2,5));
    }

    @Test
    void getCircleArea(){
        assertEquals(28.2744, d.getCircleArea(3));
    }

    @Test
    void isEven() {
        assertFalse(d.isEven(3));
    }




}