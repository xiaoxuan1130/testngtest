import org.testng.annotations.*;

public class TestNGHelloWorld1 {

    @BeforeTest
    public void setUp(){
        System.out.println("setup");
    }

    //若在testNG.xml中设置了allow-return-values="false"，则不会执行该用例
    @Test()
    public String helloworld(){
        System.out.println("first testcase");
        return "return";
    }

    @AfterTest
    public void tearDown(){
        System.out.println("teardown");
    }
}
