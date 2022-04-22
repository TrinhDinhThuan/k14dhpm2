package TieuLuanCuoiKi;

public class HangDienMay extends HangHoa {
    private int ngayBaoHanh;
    private int congXuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int ngayBaoHanh,int congXuat ){
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngayBaoHanh = ngayBaoHanh;
        this.congXuat = congXuat;
   }
   public int getngayBaoHanh() {
    return ngayBaoHanh;
}
    public void setngayBaoHanhh(int ngayBaoHanh) {
    if (ngayBaoHanh >= 0) {
        this.ngayBaoHanh = ngayBaoHanh;
    } else {
        System.out.println("Ngay bao hanh phai lon hon hoac bang 0");
    }
}
    public int getCongXuat() {
    return congXuat;
}
    public void setCongXuat(int congXuat) {
    if (congXuat > 0) {
        this.congXuat = congXuat;
    } else {
        System.out.println("Cong xuat phai lon hon 0");
    }
    }
    @Override
    public double Vat() {
    double vat = 0;
    vat = this.getDonGia() * 0.1;
    return vat;
}
    @Override
    public String toString() {
     return "\n Hang Dien May: [ngay bao hanh; " + ngayBaoHanh + ", công xuat: " + congXuat + ", vat: " + Vat() + ", đánh giá tình trạng hàng hóa: " + DanhGiaHangHoa() +"]"+ super.toString();
}

    @Override
    public String DanhGiaHangHoa() {
    String str = "khong danh gia";
        if(this.getSoLuongTon() < 3){
        str = "khong ban duoc";
        }else {
        str = "ban duoc";
        }
    return str;
}
    
}