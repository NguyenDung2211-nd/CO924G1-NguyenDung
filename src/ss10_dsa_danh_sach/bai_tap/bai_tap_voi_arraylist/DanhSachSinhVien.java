package ss10_dsa_danh_sach.bai_tap.bai_tap_voi_arraylist;


import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach){
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien(){
        for(SinhVien sinhVien : danhSach){
            System.out.println(sinhVien);
        }
    }

    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }

    public void timKiemSinhVien(String ten){
        for(SinhVien sinhVien : danhSach){
            if(sinhVien.getHoVaTen().indexOf(ten) >= 0){
                System.out.println(sinhVien);
            }
        }
    }

}
