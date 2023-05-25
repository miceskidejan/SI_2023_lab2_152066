import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void userIsNull() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        assertThrows(RuntimeException.class, ()->{
            SILab2.function(user,allUsers);
        });
    }

    @Test
    void sameIsZeroFalse(){
        User user = new User(null,"Test1234!","test@test.test");
        User user1 = new User("test@test.test","Test1234!","test@test.test");
        User user2 = new User("test@test.test1","Test1234!","test@test.test1");
        List<User> allUsers = Arrays.asList(user1,user2);

        assertFalse(SILab2.function(user,allUsers));
    }

    @Test
    void invalidPasswordShort(){
        User user = new User("username","Test1!","test.test");
        List<User> allUsers = Arrays.asList();

        assertFalse(SILab2.function(user,allUsers));
    }

    @Test
    void invalidPasswordNotContainsSpecialCharacter(){
        User user = new User("username","Test1234","test.test");
        List<User> allUsers = Arrays.asList();

        assertFalse(SILab2.function(user,allUsers));
    }

    @Test
    void invalidPasswordContainsEmptySpace(){
        User user = new User("username","Test 1234","test.test");
        List<User> allUsers = Arrays.asList();

        assertFalse(SILab2.function(user,allUsers));
    }




}