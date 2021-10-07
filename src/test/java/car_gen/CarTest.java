package test.java.car_gen;

import main.java.car_gen.Honda;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {



    @Test
public void testAccelerateSpeed() {
Assert.assertEquals(5, civic.accelerateSpeed());


    }

    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(0, civic.decelerateSpeed());
    }


    Honda civic = new Honda("Black", 2019, 160, false);
}

