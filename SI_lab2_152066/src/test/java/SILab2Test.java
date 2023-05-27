import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranch() {
        RuntimeException ex;

        //1
        ex = assertThrows(RuntimeException.class, ()->SILab2.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //2
        assertFalse(SILab2.function(new User(null,"Test1234!","test@test.test"),
                Arrays.asList(
                        new User("test@test.test","Test1234!","test@test.test"),
                        new User("test@test.test1","Test1234!","test@test.test1"))));

        //3
        assertFalse(SILab2.function(new User("username","Test1!","test.test"),null));

        //4
        assertFalse(SILab2.function(new User("username","Test1234","test.test"),null));

        //5
        assertFalse(SILab2.function(new User("username","Test 1234","test.test"),null));

    }

    @Test
    void multipleCondition(){
        RuntimeException ex;

        //1
        ex = assertThrows(RuntimeException.class, ()->SILab2.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //2
        ex = assertThrows(RuntimeException.class, ()->
            SILab2.function(new User("username", null,null),null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //3
        ex = assertThrows(RuntimeException.class, ()->
                SILab2.function(new User("username", "Test123!",null),null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //4
        assertFalse(SILab2.function(new User("username", "Test","test@test"),null));

    }
}