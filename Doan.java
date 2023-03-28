package Doan;
 import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Sach {
    private String maSach, nhaXuatBan;
    private double donGia;
    private int soLuong;
    Scanner scanner = new Scanner(System.in);
     
    public Sach() {
        super();
    }
 
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
 
    public String getMaSach() {
        return maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public void nhapSach() {
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
    }
     
    @Override
    public String toString() {
        return "Ma sach: " + this.maSach + ", ten nha xuat ban: " + this.nhaXuatBan + ", domn gia: " + 
                this.donGia + ", so luong: " + this.soLuong;
    }
    class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private int soThutu;
    private double thanhTien;
 
    public SachGiaoKhoa() {
        super();
    }
 
    public SachGiaoKhoa(String tinhTrang, int soThutu,double thanhTien) {
        super();
        this.tinhTrang = tinhTrang;
        this.soThutu = soThutu;
        this.thanhTien = thanhTien;
    }
 
    public String getTinhTrang() {
        return tinhTrang;
    }
 
 
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
 
 
    public int getNumber() {
        return soThutu;
    }
 
 
    public void setNumber(int number) {
        this.soThutu = number;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
 
    public String tinhTrangSach(int x) {
        switch (soThutu) {
            case 0:
                tinhTrang = "old";
                break;
            case 1:
                tinhTrang = "new";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
     
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap tinh trang sach (0 - old/ 1 - new): ");
        soThutu = scanner.nextInt();
    }
     
    public String toString() {
        return super.toString() + ", tinh trang sach: " + this.tinhTrangSach(soThutu);
    }
}
    class SachKhoaHoc extends Sach {
    private double thueSachKh, thanhTien;
 
    public SachKhoaHoc() {
        super();
    }
 
    public SachKhoaHoc(double thueSachKh) {
        super();
        this.thueSachKh = thueSachKh;
    }
 
    public double getThueSachKh() {
        return thueSachKh;
    }
 
    public void setThueSachKh(double thueSachKh) {
        this.thueSachKh = thueSachKh;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue sach khoa hoc: ");
        thueSachKh = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thueSachKh: " + this.thueSachKh;
    }
     
}
    class SachLichSu extends Sach {
    private double thueSachls, thanhTien;
 
    public SachLichSu() {
        super();
    }
 
    public SachLichSu(double thueSachls) {
        super();
        this.thueSachls = thueSachls;
    }
    public double getThueSachLs() {
        return thueSachls;
    }
 
    public void setThueSachLs(double thueSachls) {
        this.thueSachls = thueSachls;
    }
    public double getThanhTien() {
        return thanhTien;
    }
 
 
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhap thue sach lich su: ");
        thueSachls = scanner.nextDouble();
    }
     
    @Override
    public String toString() {
        return super.toString() + ", thueSachLs: " + this.thueSachls;
    }
     
}
    class Main {
     
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachKhoaHoc> arrSachKhoaHoc = new ArrayList<>();
        ArrayList<SachLichSu> arrSachLichSu = new ArrayList<>();
        int soSachGiaoKhoa, soSachKhoaHoc, soSachLichSu;
        double tongTienSachGiaoKhoa = 0, tongTienSachKhoaHoc = 0,tongTienSachLichSu = 0, tongDonGiaSachKhoaHoc = 0, 
            trungBinhCongDonGia = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhap so sach  giao khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
        System.out.print("Nhap so sach khoa hoc: ");
        soSachKhoaHoc = scanner.nextInt();
        System.out.print("Nhap so sach lich su: ");
        soSachLichSu = scanner.nextInt();
         
        System.out.println("Nhap thông tin sach giao khoa:");
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhap thông tin quyen sach thu  " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }
         
        System.out.println("Nhap thông tin sach tham khao:");
        for (int i = 0; i < soSachKhoaHoc; i++) {
            System.out.println("Nhap thông tin quyen sach thu " + (i + 1) + ":");
            SachKhoaHoc sachKH = new SachKhoaHoc();
            sachKH.nhapSach();
            arrSachKhoaHoc.add(sachKH);
        }
        System.out.println("Nhap thông tin sach lich su:");
        for (int i = 0; i < soSachLichSu; i++) {
            System.out.println("Nhap thông tin quyen sach thu " + (i + 1) + ":");
            SachLichSu sachLS = new SachLichSu();
            sachLS.nhapSach();
            arrSachLichSu.add(sachLS);
        }
         
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia();
            }
        }
        System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);
         
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            tongTienSachKhoaHoc += arrSachKhoaHoc.get(i).getSoLuong() * 
                arrSachKhoaHoc.get(i).getDonGia() + arrSachKhoaHoc.get(i).getThueSachKh();
        }
        System.out.println("Tong tien sach tham khao = " + tongTienSachKhoaHoc);
         
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            tongTienSachLichSu += arrSachLichSu.get(i).getSoLuong() * 
                arrSachLichSu.get(i).getDonGia() + arrSachLichSu.get(i).getThueSachLs();
        }
        System.out.println("Tong tien sach lich su = " + tongTienSachLichSu);

        System.out.println("-----Thong tin sach giao khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }
         
        System.out.println("-----Thong tin sach tham khao-----");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            System.out.println(arrSachKhoaHoc.get(i).toString());
        }

        System.out.println("-----Thong tin sach lich su-----");
        for (int i = 0; i < arrSachLichSu.size(); i++) {
            System.out.println(arrSachLichSu.get(i).toString());
        }
         
        System.out.println("---Trung binh cong đon gia cac sach khoa hoc---");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            tongDonGiaSachKhoaHoc += arrSachKhoaHoc.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachKhoaHoc / arrSachKhoaHoc.size();
        }
        System.out.println("Trung binh cong don gia cac sach khoa hoc = " + trungBinhCongDonGia);
         
        System.out.println("---Cac sach giao khoa cua nha xuat ban X---");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(arrSachGiaoKhoa.get(i).toString());
            }
        }
    }
 
}
}
