import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranch() {
        //1
        User user = null;
        List<User> allUsers = new ArrayList<>();

        assertThrows(RuntimeException.class, ()->{
            SILab2.function(user,allUsers);
        });

        //2
        User user1 = new User(null,"Test1234!","test@test.test");
        User user2 = new User("test@test.test","Test1234!","test@test.test");
        User user3 = new User("test@test.test1","Test1234!","test@test.test1");
        List<User> allUsers1 = Arrays.asList(user2,user3);

        assertFalse(SILab2.function(user1,allUsers1));

        //3
        User user4 = new User("username","Test1!","test.test");
        List<User> allUsers2 = Arrays.asList();

        assertFalse(SILab2.function(user4,allUsers2));

        //4
        User user5 = new User("username","Test1234","test.test");
        List<User> allUsers3 = Arrays.asList();

        assertFalse(SILab2.function(user5,allUsers3));

        //5
        User user6 = new User("username","Test 1234","test.test");
        List<User> allUsers4 = Arrays.asList();

        assertFalse(SILab2.function(user6,allUsers4));

    }

    @Test
    void multipleCondition(){

        List<User> allUsers = new ArrayList<>();

        //1
        User user = null;
        assertThrows(RuntimeException.class, ()->{
            SILab2.function(user,allUsers);
        });

        //2
        User user1 = new User("username", null,null);

        assertThrows(RuntimeException.class, ()->{
            SILab2.function(user1,allUsers);
        });

        //3
        User user2 = new User("username", "Test123!",null);

        assertThrows(RuntimeException.class, ()->{
            SILab2.function(user2,allUsers);
        });

        //4
        User user3 = new User("username", "Test","test@test");

        assertFalse(SILab2.function(user3,allUsers));

    }
}