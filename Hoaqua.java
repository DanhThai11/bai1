package hoaqua;
class Hoaqua {
    public int giaban;
    public String nguongoc;
    public String ngaynhap;
    public int soluong;

    public Hoaqua(int giaban, String nguongoc, String ngaynhap, int soluong) {
        this.giaban = giaban;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }

    public int getGiaBan() {
        return giaban;
    }

    public String getNguonGoc() {
        return nguongoc;
    }

    public String getNgayNhap() {
        return ngaynhap;
    }

    public int getSoLuong() {
        return soluong;
    }
}

class QuaCam extends Hoaqua {
    public QuaCam(int giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
    }
    public String mausac;
    public String loaicam;
    public String dochuangot;
}

class QuaTao extends Hoaqua {
    public QuaTao(int giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
    }
}

class CamCaoPhong extends QuaCam {
    public CamCaoPhong(int giaban, String ngaynhap, int soluong) {
        super(giaban, "Cao Phong", ngaynhap, soluong);
    }
}

class CamSanh extends QuaCam {
    public CamSanh(int giaban, String ngaynhap, int soluong) {
        super(giaban, "Sanh", ngaynhap, soluong);
    }
}
class Main {
    public static void main(String[] args) {
        QuaCam quaCam = new QuaCam(5000, "Vietnam", "2022-01-01", 100);
        QuaTao quaTao = new QuaTao(3000, "Japan", "2022-02-01", 50);
        CamCaoPhong camCaoPhong = new CamCaoPhong(7000, "2022-03-01", 80);
        CamSanh camSanh = new CamSanh(8000, "2022-04-01", 70);

        System.out.println("Qua Cam co gia ban: " + quaCam.getGiaBan() + " VND");
        System.out.println("Qua Tao co ngay nhap: " + quaTao.getNgayNhap());
        System.out.println("Cam Cao Phong co so luong: " + camCaoPhong.getSoLuong());
        System.out.println("Cam Sanh co nguon goc: " + camSanh.getNguonGoc());
    }
}