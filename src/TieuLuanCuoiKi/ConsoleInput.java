package TieuLuanCuoiKi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput {
    private static String maHang;
    private static String tenHang;
    private static String nhaCungCap;
    private static String nhaSanXuat;
    private static int soLuongTon;
    private static int ngayBaoHanh;
    private static int congXuat;
    private static double donGia; 
    private static Date ngaySanXuat;
    private static Date ngayHetHan;
    private static Date ngayNhapKho;
    public static Scanner input = new Scanner(System.in);
    static SimpleDateFormat ngayVN = new SimpleDateFormat("dd/MM/yyyy");

    public static HangHoa inputKhoHang(List<HangHoa> hangHoa){
        HangHoa hh = null;
       
        System.out.print("Nhap ma hang hoa: ");
        maHang = input.nextLine();
        for (HangHoa hangHoa2 : hangHoa) {
            if (hangHoa2.getmaHang().equalsIgnoreCase(maHang)) {
                System.out.println("Ma hang hoa da co ban vui long thu lai!");
                return null;
            }
        }
        
        System.out.print("Nhap ten hang hoa: ");
        tenHang = input.nextLine();   
        System.out.print("Nhap so luong ton kho: ");
        try {
            soLuongTon = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ban nhap da bi loi!");
            System.out.println("Ban vui long nhap so!");
            ex.printStackTrace();
        }
        input.nextLine();
        System.out.print("Nhap don gia: ");
        try {
            donGia = input.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Ban nhap da bi loi!");
            ex.printStackTrace();
        } 
        
        input.nextLine();
        System.out.print("Ban muon nhap hang hoa loai nao? \n- Hang thuc pham - 1, hang dien may - 2, hang sanh su - 3: ");
        int loai = input.nextInt();
        input.nextLine();
        
        if(loai == 1){
            System.out.print("Nhap ngay san xuat: ");
            try {
                ngaySanXuat = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo dung kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
                input.nextLine();
            } 
                       
            System.out.print("Nhap ngay het han: ");
            try {
                ngayHetHan = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo dung kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
                input.nextLine();
            }
             
            System.out.print("Nhap nha cung cap: ");
            nhaCungCap = input.nextLine();

            hh  = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
        } else if (loai == 2) {
            System.out.print("Nhap thoi gia bao hanh(thang): ");
            try {
                ngayBaoHanh = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ban nhap da bi loi!");
                System.out.println("Ban vui long nhap so nha!");
                ex.printStackTrace();
                input.nextLine();
            }
            
            System.out.print("Nhap cong suat: ");
            try {
                congXuat = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ban nhap da bi loi!");
                System.out.println("Ban vui long nhap so nha!");
                ex.printStackTrace();
            }
            input.nextLine();

            hh = new HangDienMay(maHang, tenHang, soLuongTon, donGia, ngayBaoHanh, congXuat);
        } else {
            System.out.print("Nhap nha san xuat: ");
            nhaSanXuat = input.nextLine();
            System.out.print("Nhap ngay nhap kho: ");
            try {
                ngayNhapKho = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo dung kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
            } 
            input.nextLine();

            hh = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
        }
        return hh;
    }   

    public HangHoa suaHangHoa(HangHoa hangHoa){
        maHang = hangHoa.getmaHang();
        System.out.print("Nhap ten hang hoa: ");
        tenHang = input.nextLine();   
        System.out.print("Nhap so luong ton kho: ");
        try {
            soLuongTon = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Ban nhap da bi loi!");
            System.out.println("Ban vui long nhap so nha!");
            ex.printStackTrace();
        }
        input.nextLine();
        System.out.print("Nhap don gia: ");
        try {
            donGia = input.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Ban nhap da bi loi!");
            ex.printStackTrace();
        } 
        
        input.nextLine();
        System.out.print("Ban muon nhap hang hoa loai nao? \n- Hang thuc pham - 1, hang dien may - 2, hang sanh su - 3: ");
        int loai = input.nextInt();
        input.nextLine();
        
        if(loai == 1){
            System.out.print("Nhap ngay san xuat: ");
            try {
                ngaySanXuat = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo ndug kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
                input.nextLine();
            } 
                       
            System.out.print("Nhap ngay het han: ");
            try {
                ngayHetHan = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo dung kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
                input.nextLine();
            }
             
            System.out.print("Nhap nha cung cap: ");
            nhaCungCap = input.nextLine();

            hangHoa  = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
        } else if (loai == 2) {
            System.out.print("Nhap thoi gia bao hanh(thang): ");
            try {
                ngayBaoHanh = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ban nhap da bi loi!!");
                System.out.println("Ban vui long nhap so nha!");
                ex.printStackTrace();
                input.nextLine();
            }
            
            System.out.print("Nhap cong suat: ");
            try {
                congXuat = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ban nhap da bi loi!");
                System.out.println("Ban vui long nhap so nha!");
                ex.printStackTrace();
            }
            input.nextLine();

            hangHoa = new HangDienMay(maHang, tenHang, soLuongTon, donGia, ngayBaoHanh, congXuat);
        } else {
            System.out.print("Nhap nha san xuat: ");
            nhaSanXuat = input.nextLine();
            System.out.print("Nhap ngay nhap kho: ");
            try {
                ngayNhapKho = ngayVN.parse(input.nextLine());
            } catch (ParseException e) {
                System.out.println("Ban da nhap sai kieu dinh dang ngay!");
                System.out.println("Ban vui long nhap theo dung kieu dinh dang dd/MM/yyyy!");
                e.printStackTrace();
            } 
            input.nextLine();

            hangHoa = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
        }
        return hangHoa;
    } 

}
