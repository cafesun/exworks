package com.fiberhome.publicdev;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld=new HelloWorld();
        String result=helloWorld.sayHello();
        System.out.println("Run Hello World Unit Test");
        assertEquals("Hello Maven", result);
    }

}
