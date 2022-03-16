package k14dhpm2.oo.thigiuaki;

    import java.util.List;
import java.util.ArrayList;

public class hoadontheogio extends hoadon {
    private int sogiochothue;

    private static List<hoadontheogio> list = new ArrayList<hoadontheogio>();

    protected int thanhTien(int soGioThue, int donGia) {
        if (soGioThue > 40)
            System.out.println("số giờ đã vượt 40 tiếng, hãy sử dụng loại hóa đơn này.");
    
        if (soGioThue > 24 || soGioThue < 40)
            soGioThue = 24;

        return soGioThue * donGia;
    }

    public hoadontheogio(int soGioThue) {
        this.sogiochothue = soGioThue;
    }

    hoadontheogio() {
        list.add(this);
    }

    public static List<hoadontheogio> getList() {
        return list;
    }

    public int tongSoLuong() {
        return list.size();
    }

    
}

