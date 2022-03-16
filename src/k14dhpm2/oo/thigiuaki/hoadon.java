package k14dhpm2.oo.thigiuaki;

import java.util.Date;

public abstract class hoadon {
    private String tenKhachHang;
    private String maPhong;
    private Date ngayHoaDon;
    private double donGia;
    private String maHoadon;

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getMaPhong()
     {
        return maPhong;
    }
    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }
    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaHoadon() {
        return maHoadon;
    }
    public void setMaHoadon(String maHoadon) {
        this.maHoadon = maHoadon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract int tongSoLuong();

    
}
