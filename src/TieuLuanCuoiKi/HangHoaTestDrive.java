package TieuLuanCuoiKi;

import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) {
        int luaChon;
        int key;
        Scanner sc = new Scanner(System.in); 
 
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        
        danhSachHangHoa.duLieuMoi();

        do {
            System.out.println("\n\t---------------- Menu ----------------");
            System.out.println("\t1. Them hang hoa.");
            System.out.println("\t2. Xoa hang hoa.");
            System.out.println("\t3. In danh sach hang hoa.");
            System.out.println("\t4. Tim kiem hang hoa.");
            System.out.println("\t5. Sap xep hang hoa.");
            System.out.println("\t0. Thoat.");
            System.out.println("\t----------------------------------------");
            System.out.print("\n- Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    do {
                        System.out.println("\n\t---------- Menu them hang hoa ----------");
                        System.out.println("\t1. Them hang hoa.");
                        System.out.println("\t0. Thoat.");
                        System.out.println("\t------------------------------------------");
                        System.out.print("\n- Vui long nhap lua chon: ");
                        key = sc.nextInt();
                        sc.nextLine();
                        switch (key) {
                            case 1:
                                danhSachHangHoa.themHangHoa();
                                break;
                            default:
                                break;
                        }
                    } while (key != 0);
                    break;
                case 2:
                    danhSachHangHoa.xoaHangHoaTheoMa();
                    break;
                case 3:
                    danhSachHangHoa.inDanhSach();
                    break;
                case 5:
                    do {
                        System.out.println("\n\t------------ Menu tim kiem hang ho--------------");
                        System.out.println("\t1. Tim kiem hang hoa theo loai hang.");
                        System.out.println("\t2. Tim kiem hang hoa theo ma hang hoa.");
                        System.out.println("\t0. Thoat.");
                        System.out.println("\t--------------------------------------------------");
                        System.out.print("\n- Vui long nhap lua chon: ");
                        key = sc.nextInt();
                        sc.nextLine();
                        switch (key) {
                            case 1:
                                danhSachHangHoa.timKiemTheoMa();
                                break;
                        }
                    } while (key != 0);
                    break;
            }
        } while (luaChon != 0);
        
    }
}