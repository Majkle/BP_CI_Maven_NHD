package bp.ci;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        Assert.assertTrue(false);
    }

    @Test
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test
    public void test3() {
        System.out.println("Intense testing");
        System.out.println("Intense testing");
        System.out.println("Intense testing");
        System.out.println("Intense testing");
        System.out.println("Intense testing");
        Assert.assertTrue(false);
    }

    @Test
    public void test4() {
        Assert.assertTrue(false);
    }

    @Test
    public void test5() throws InterruptedException {
        System.out.println("Intense testing");
        Thread.sleep(5000);
        System.out.println("Intensified testing");
        Assert.assertTrue(false);
    }
}