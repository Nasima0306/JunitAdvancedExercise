package Exercise3;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OrderedTests {

    @Test

    @Order(1)

    void loginTest(){

        System.out.println("Login Test");

    }

    @Test

    @Order(2)

    void searchTest(){

        System.out.println("Search Test");

    }

    @Test

    @Order(3)

    void logoutTest(){

        System.out.println("Logout Test");

    }
}
