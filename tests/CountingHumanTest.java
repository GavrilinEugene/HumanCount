import org.junit.Assert;
import org.junit.Test;

public class CountingHumanTest {

    @Test
    public void startTestOneElement() throws Exception {
        Assert.assertEquals(0, HumanCount.start(1));
    }

    @Test
    public void startTestOddElements() throws Exception {
        Assert.assertEquals(7, HumanCount.start(10));
    }

    @Test
    public void startTestEvenElements() throws Exception {
        Assert.assertEquals(3, HumanCount.start(7));
    }

}