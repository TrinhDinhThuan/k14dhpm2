package TieuLuanCuoiKi;

import java.util.Date;

public class HangThucPham extends HangHoa{
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
    }
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.setngayHetHan(ngayHetHan);
        this.nhaCungCap = nhaCungCap;
    }
    public void setngayHetHan(Date ngayHetHan) {
        if(ngayHetHan!=null){
            if(ngayHetHan.after(ngaySanXuat)){
                this.ngayHetHan = ngayHetHan;
            }else{
                System.out.println("Ngay het han phai sau ngay san xuat!");
            }
        }else{
            System.out.println("Ngay het han khong duoc rong!");
        }
    }

    public Date getngayHetHan() {
        return ngayHetHan;
    }
    @Override
    public String toString() {
        return "Hang Thuc Pham" + super.toString() + "[ngay Het Han = " + ngayHetHan + ", ngay San Xuat = " + ngaySanXuat + ", nha Cung Cap =" + nhaCungCap
                + "]";
    }
    public boolean kiemTraHSD(){
        return this.tinhHSD();
    }

    private boolean tinhHSD() {
        boolean isHetHan = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            isHetHan = true;
        }  
        return isHetHan;                                                                                                                    
    }
    @Override
    public String DanhGiaHangHoa() {
        String str = "khong danh gia";
        if(this.getSoLuongTon() <= 0 && this.tinhHSD() == false){
            str = "hang kho ban";
        }else {
            str = "hang de ban";
        }
        return str;
    }
}
