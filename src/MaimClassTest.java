import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaimClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("this.getLocalNumber() != 14",this.getLocalNumber()==14);
    }
    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("this.getClassNumber () < 45",this.getClassNumber() > 45);
    }
}
