import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGHelloWorld {

    @BeforeClass
    public void setUp(){
        System.out.println("setup");
    }

    @Test()
    public void helloworld(){
        System.out.println("first testcase");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("teardown");
    }
}
