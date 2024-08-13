package playground;


import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class MyFirstTest {

    @BeforeMethod
    public void runnbeforTest(){
        System.out.println(" this is befor ech test" );

    }
    @Test
    public void MyFierstTestMethud(){
        System.out.println("helo world");
    }
}
