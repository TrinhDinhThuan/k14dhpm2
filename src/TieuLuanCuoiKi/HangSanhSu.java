package TieuLuanCuoiKi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends HangHoa{
        private String nhaSanXuat;
        private Date ngayNhapKho;

        public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia) {
            super(maHang, tenHang, soLuongTon, donGia);
        }
        
        public String getnhaSanXuat() {
            return nhaSanXuat;
        }
        protected void setnhaSanXuat(String nhaSanXuat) {
            if(nhaSanXuat != null){
            this.nhaSanXuat = nhaSanXuat;
            }else{
                System.out.println("nha san xuat khong duoc rong");
            }
        }
        protected void setNgayNhapKho(Date ngayNhapKho) {
            if(ngayNhapKho != null){
            this.ngayNhapKho = ngayNhapKho;
            }else{
                System.out.println("Ngay nhap kho khong duoc rong!!!");
            }
        }
        public HangSanhSu() {
            super();
            this.nhaSanXuat = null;
            this.ngayNhapKho = null;
        }
    
        public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat,
                Date ngayNhapKho) {
            super(maHang, tenHang, soLuongTon, donGia);
            this.setnhaSanXuat(nhaSanXuat);
            this.setNgayNhapKho(ngayNhapKho);
        }
        @Override
    public String toString() {
        SimpleDateFormat ngayVN= new SimpleDateFormat("dd/MM/yyyy");
        return " \n Hang Sanh Su: [nha san xuat: " + nhaSanXuat + ", ngay nhap kho: " + ngayVN.format(ngayNhapKho) + ", vat: " + Vat() + ", danh gia hang hoa: " + DanhGiaHangHoa() + "]" +super.toString();
    }
    @Override
    public String DanhGiaHangHoa() {
        String str = "khong danh gia";  
        if(this.getSoLuongTon() > 50 && tinhThoiGianLuuKho() > 10){
            str = "ban cham";
        }else {
            str = "ban nhanh";
        }
        return str;
    }
    public int tinhThoiGianLuuKho() {
        Date ngayHienTai = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Date ngayNhapHang = this.getNgayNhapKho();
        calendar.setTime(ngayNhapHang);
        int ngayNhap = calendar.get(Calendar.DATE);
        int thangNhap = calendar.get(Calendar.MONTH) + 1;
        int namNhap = calendar.get(Calendar.YEAR); 

        calendar2.setTime(ngayHienTai);
        int ngayHT = calendar2.get(Calendar.DATE);
        int thangHT = calendar2.get(Calendar.MONTH) + 1;
        int namHT = calendar2.get(Calendar.YEAR);
        int thoiGianLuuKho = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (namHT == (namNhap + i)) {
                    if (thangHT == (thangNhap + j)) {
                        thoiGianLuuKho = ngayHT - ngayNhap;
                        thoiGianLuuKho += (j*30);
                        break;
                    } 
                    thoiGianLuuKho += (i*365);
                }                 
            }            
        }
        return thoiGianLuuKho;
    }
    private Date getNgayNhapKho() {
        return null;
    }
}
