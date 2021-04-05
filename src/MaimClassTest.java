import org.junit.Assert;
import org.junit.Test;

public class MaimClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("this.getLocalNumber() != 14",this.getLocalNumber()==14);
    }
}
