package com.thicuoimon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SanPhamService {
    private SanPham sanPham;

    public List<SanPham> sanPhamList = new ArrayList<>();

    public SanPhamService() {
        sanPhamList.add(new SanPham("sp1", "san pham 1", 1, 1000, 10, "danh muc 1"));
        sanPhamList.add(new SanPham("sp2", "san pham 2", 2, 2000, 20, "danh muc 2"));
        sanPhamList.add(new SanPham("sp3", "san pham 3", 3, 3000, 30, "danh muc 3"));
        sanPhamList.add(new SanPham("sp4", "san pham 4", 4, 4000, 40, "danh muc 4"));
        sanPhamList.add(new SanPham("sp5", "san pham 5", 5, 5000, 50, "danh muc 5"));
    }

    public SanPham suaSanPham(String ma, SanPham sanPham) {
        this.sanPham = sanPhamList.stream().filter(sp -> sp.getMa().equals(ma)).findFirst().orElse(null);
        if (this.sanPham == null) {
            throw new NullPointerException("Không tìm thấy sản phẩm");
        } else {
            this.sanPham.setTen(sanPham.getTen());
            this.sanPham.setNamBaoHanh(sanPham.getNamBaoHanh());
            this.sanPham.setGia(sanPham.getGia());
            this.sanPham.setSoLuong(sanPham.getSoLuong());
            this.sanPham.setDanhMuc(sanPham.getDanhMuc());
            return this.sanPham;
        }

    }
}
