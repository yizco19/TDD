import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testSum1(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(0,f.suma(""));
    }
    @Test
    void testSum2(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(1,f.suma("1"));
    }
    @Test
    void testSum3(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(3,f.suma("1,2"));
    }
}