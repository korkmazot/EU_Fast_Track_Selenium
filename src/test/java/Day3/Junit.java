package Day3;

import org.junit.*;

public class Junit extends BasePage {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("At the beginning of the class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("At the end of the class");
    }

    @Before
    public void before(){
        System.out.println("Run before every test");
    }

    @After
    public void after(){
        System.out.println("Run after every test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }


}
