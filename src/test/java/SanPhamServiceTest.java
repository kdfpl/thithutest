import com.thicuoimon.SanPham;
import com.thicuoimon.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SanPhamServiceTest {
    private SanPhamService sanPhamService = new SanPhamService();

    @Test
    public void testSuaTenSanPham() {
        SanPham newSanPham = new SanPham("sp1", "san pham 2", 1, 1000, 10, "danh muc 1");
        Assertions.assertEquals("san pham 2", sanPhamService.suaSanPham("sp1", newSanPham).getTen());
    }

    @Test
    public void testSuaGiaSanPham() {
        SanPham newSanPham = new SanPham("sp1", "san pham 1", 1, 2000, 10, "danh muc 1");
        Assertions.assertEquals(2000, sanPhamService.suaSanPham("sp1", newSanPham).getGia(), 0.01);
    }

    @Test
    public void testSuaSoLuongSanPham() {
        SanPham newSanPham = new SanPham("sp1", "san pham 1", 1, 1000, 5, "danh muc 1");
        Assertions.assertEquals(5, sanPhamService.suaSanPham("sp1", newSanPham).getSoLuong());
    }

    @Test
    public void testSuaDanhMucSanPham() {
        SanPham newSanPham = new SanPham("sp1", "san pham 1", 1, 1000, 10, "danh muc 2");
        Assertions.assertEquals("danh muc 2", sanPhamService.suaSanPham("sp1", newSanPham).getDanhMuc());
    }

    @Test
    public void testSuaDanhMucSanPhamKhongTonTai() {
        SanPham newSanPham = new SanPham("sp6", "san pham 6", 1, 1000, 10, "danh muc 3");
//        Assertions.assertNull(sanPhamService.suaSanPham("sp6", newSanPham));
        Assertions.assertThrows(NullPointerException.class, () -> sanPhamService.suaSanPham("sp6", newSanPham));
    }

    @Test
    public void testSuaDanhMucSanPhamRong() {
        SanPham newSanPham = new SanPham("sp1", "san pham 1", 1, 1000, 10, "");
        Assertions.assertEquals("", sanPhamService.suaSanPham("sp1", newSanPham).getDanhMuc());
    }

    @Test
    public void testSuaDanhMucSanPhamNull() {
        SanPham newSanPham = new SanPham("sp1", "san pham 1", 1, 1000, 10, null);
        Assertions.assertNull(sanPhamService.suaSanPham("sp1", newSanPham).getDanhMuc());
    }
}
