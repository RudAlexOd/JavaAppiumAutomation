import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class MaimClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("this.getLocalNumber() != 14", this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {

        if (this.class_number == 45) {
            Assert.assertTrue("this.getLocalNumber() = 45", this.getLocalNumber() == 45);
        } else {
            Assert.assertTrue("this.getClassNumber () < 45", this.getClassNumber() > 45);
        }
    }

    @Test
    public void testGetClassString()
    {
       boolean newStr;
       newStr = this.class_string.contains("hello");

        {
            Assert.assertTrue("In this.getClass String() without substring _hello and _Hello", newStr!=this.class_string.contains("Hello"));
        }

    }
}
