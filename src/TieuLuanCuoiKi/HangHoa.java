package TieuLuanCuoiKi;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuongTon; 
    private double donGia;

    public HangHoa(){
        this.setmaHang(maHang);
    }

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia){
        this.setmaHang(maHang);
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    protected String setMaHang() {
        return tenHang;
    }
    private void setmaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Khong duoc de trong!");
        }
    }
    public void settenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        } else {
            System.out.println("Khong duoc de trong!");
        }
    }
    protected int getSoLuongTon() {
        return soLuongTon;
    }

    protected void setsoLuongTon(int soLuongTon) {
        if(soLuongTon>=0){
        this.soLuongTon = soLuongTon;
        }else{
            System.out.println("So luong ton phai > = 0");
        }
    }
    public void setDonGia(double donGia) {
        if(donGia > 0 ){
            this.donGia = donGia;
        } else {
            System.out.println("error!! input again");
        }
     }
 
     public double getDonGia() {
         return donGia;
     }

     public double Vat() {
        return 0;
    }
     public String DanhGiaHangHoa() {
        return null;
    }

     @Override
     public String toString() {
         return " [don Gia = " + donGia + ", ma Hang = " + maHang + ", so Luong Ton = " + soLuongTon + ", ten Hang = "
                 + tenHang + "]";
     }

    public String getmaHang() {
        return null;
    };
}
