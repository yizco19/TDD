import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testSum(){
        FizzBuzz f=new FizzBuzz();
        assertEquals(2,f.suma(1,1));
    }
}