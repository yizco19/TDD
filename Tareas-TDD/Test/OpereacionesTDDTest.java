import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpereacionesTDDTest {

    @Test
    void testSum1(){
        assertEquals(0, OperacionesTDD.suma(""));
    }
    @Test
    void testSum2(){

        assertEquals(1,OperacionesTDD.suma("1"));
    }
    @Test
    void testSum3(){

        assertEquals(3,OperacionesTDD.suma("1,2"));
    }
    @Test
    void testSum4(){

        assertEquals(4,OperacionesTDD.suma("1,1,2"));
    }

    @Test
    void testSum5(){

        assertEquals(-1,OperacionesTDD.suma("1,2,"));
    }


}