package TieuLuanCuoiKi;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> DanhSach = new ArrayList<>();

    private int soLuongHangThucPham;
    private int soLuongHangSanhSu;
    private int soLuongHangDienMay;

    private List<HangHoa> quanLyHangHoa;
    public int getSoLuongHangThucPham() {
        return soLuongHangThucPham;
    }

    public int getSoLuongHangSanhSu() {
        return soLuongHangSanhSu;
    }

    public int getSoLuongHangDienMay() {
        return soLuongHangDienMay;
    }
    public void themKhoHang() throws ParseException{
        DanhSach.add(new HangThucPham("1", "gao", 0, 10000.0, ConsoleInput.ngayVN.parse("20/2/2022"), ConsoleInput.ngayVN.parse("20/3/2022"), "gao Sai Gon"));
        DanhSach.add(new HangSanhSu("2", "binh hoa", 60, 7000.0, "lo gom bat trang"  ,ConsoleInput.ngayVN.parse("20/3/2022")));
        DanhSach.add(new HangDienMay("3", "noi com dien", 2, 7000000.0, 12  , 220));
        DanhSach.add(new HangThucPham("4", "ca rot", 10, 5000.0, ConsoleInput.ngayVN.parse("2/2/2022"), ConsoleInput.ngayVN.parse("2/5/2022"), "nha may cung cap ca rot"));
        DanhSach.add(new HangSanhSu("5", "chen", 100, 15000.0, "lo gom bat trang"  ,ConsoleInput.ngayVN.parse("16/4/2022")));
        DanhSach.add(new HangDienMay("6", "tu lanh", 40, 8000000.0, 24  , 220));
        DanhSach.add(new HangThucPham("7", "cam", 2, 12000.0, ConsoleInput.ngayVN.parse("1/2/2022"), ConsoleInput.ngayVN.parse("1/3/2022"), "nha may cung cap cam TPHCM"));
        DanhSach.add(new HangSanhSu("8", "am tra", 9, 20000.0, "lo gom bat trang"  ,ConsoleInput.ngayVN.parse("30/3/2022")));
        DanhSach.add(new HangDienMay("9", "may lanh", 35, 700000.0, 12  , 280));
        DanhSach.add(new HangThucPham("10", "du du", 99, 12000.0, ConsoleInput.ngayVN.parse("13/2/2022"), ConsoleInput.ngayVN.parse("31/3/2022"), "nong trai"));
    }
    public void them() {
        while (true) {
            quanLyHangHoa.add(ConsoleInput.inputKhoHang(quanLyHangHoa));
            System.out.print("- Ban co muon tiep tuc them(Y/N): ");
            if (ConsoleInput.input.nextLine().equalsIgnoreCase("N")) {
                return;
            }
        }
    }  
    public HangHoa timHangHoaTheoMa(String maHang) {
        HangHoa hangHoa = null;
        for (HangHoa hangHoa1 : DanhSach) {
            if (hangHoa1.getmaHang().toString().equalsIgnoreCase(maHang)) {
                hangHoa = hangHoa1;
            }
        }
        return hangHoa;
    }
    public int timViTri(String maHH) {
        int viTri = -1;
        for (HangHoa hh : quanLyHangHoa) {
            viTri++;
            if (hh.getmaHang().equalsIgnoreCase(maHH)) {
                return viTri;
            }
        }
        return viTri;
    }
    public void  inDanhSach() {
        for (HangHoa hangHoa : DanhSach) {
            System.out.println(hangHoa);
            System.out.println("");
        }
    }
    public void xoaHangHoaTheoMa() {
        HangHoa hangHoa = null;
        System.out.print("Nhap ma hang hoa can xoa: ");
        String ma = ConsoleInput.input.nextLine();

        hangHoa = timHangHoaTheoMa(ma);

        if (hangHoa != null) {
            quanLyHangHoa.remove(hangHoa);
            System.out.println("Hang hoa da duoc xoa khoi danh sach.");
        } else {
            System.out.println("Ma hang hoa can xoa khong co trong danh sach!");
        }
    }

    public void duLieuMoi() {
    }

    public void timKiemTheoMa() {
    }

    public void themHangHoa() {
    }
}
