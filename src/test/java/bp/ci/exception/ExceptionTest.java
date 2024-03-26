package bp.ci.exception;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {

    @Test
    public void throwsException1() {
        Assert.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("I threw up");
        });
    }

    @Test
    public void throwsException2() {
        Assert.assertThrows(RuntimeException.class, () -> {
            throw new IllegalArgumentException("I threw up");
        });
    }

    @Test
    public void throwsException3() {
        Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            throw new RuntimeException("I threw up");
        });
    }
}
