package pkg01

import org.junit.Test;
import org.junit.Assert.assertEquals

class HelloServiceTest
{
    @Test
    def test()
    {
        assertEquals("Hello1", HelloService.hello)
    }

    @Test
    def innertest()
    {
        assertEquals("InnerHello1", new HelloService.Inner().innerHello)
    }

}
