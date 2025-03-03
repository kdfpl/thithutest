import com.thicuoimon.Bai1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Bai1Test {
    private Bai1 bai1 = new Bai1();

    @Test
    public void testBienMax() {
        Assertions.assertEquals("So le", bai1.soChanle(Integer.MAX_VALUE));
    }

    @Test
    public void testBienMin() {
        Assertions.assertEquals("So chan", bai1.soChanle(Integer.MIN_VALUE));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> bai1.soChanle(null));
    }

    @Test
    public void testSoChan() {
        Assertions.assertEquals("So chan", bai1.soChanle(2));
    }

    @Test
    public void testSoLe() {
        Assertions.assertEquals("So le", bai1.soChanle(3));
    }

    @Test
    public void testSoAmLe() {
        Assertions.assertEquals("So le", bai1.soChanle(-1));
    }

    @Test
    public void testSoAmChan() {
        Assertions.assertEquals("So chan", bai1.soChanle(-2));
    }

    @Test
    public void testSoKhong() {
        Assertions.assertEquals("So chan", bai1.soChanle(0));
    }
}