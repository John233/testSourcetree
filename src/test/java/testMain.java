import org.junit.Assert;
import org.junit.Test;

public class testMain {


    @Test
    public void testMain() {
        String actual = "Testing main";
        System.out.println("Testing main");
        Assert.assertEquals(actual, "Testing main");
    }

}
