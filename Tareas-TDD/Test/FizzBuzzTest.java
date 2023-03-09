import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testSum1(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(2,f.suma(1,1));
    }
    @Test
    void testSum2(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(4,f.suma(1,1,2));
    }
}