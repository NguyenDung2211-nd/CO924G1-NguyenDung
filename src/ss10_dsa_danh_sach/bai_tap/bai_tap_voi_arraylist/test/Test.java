package ss10_dsa_danh_sach.bai_tap.bai_tap_voi_arraylist.test;

import ss10_dsa_danh_sach.bai_tap.bai_tap_voi_arraylist.DanhSachSinhVien;
import ss10_dsa_danh_sach.bai_tap.bai_tap_voi_arraylist.SinhVien;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("Menu -------");
            System.out.println("Vui lòng chọn chức năng : ");
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. In danh sách sinh viên ra màn hình.");
            System.out.println("3. Lấy ra số lượng sinh viên trong danh sách.");
            System.out.println("4. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
            System.out.println("5. Tìm kiếm sinh viên dựa trên họ và tên");
            System.out.println("0. Thoát khỏi chương trình");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch(luaChon) {
                case 1:
                    System.out.println("Nhập mã sinh viên : ");
                    String maSinhVien = scanner.nextLine();
                    System.out.println("Nhập họ và tên : ");
                    String hoVaTen = scanner.nextLine();
                    System.out.println("Nhập năm sinh : ");
                    int namSinh = scanner.nextInt();
                    System.out.println("Nhập Điểm trung bình : ");
                    float diemTrungBinh = scanner.nextFloat();
                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Số lượng hiện tại : " + dssv.laySoLuongSinhVien());
                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên : ");
                    maSinhVien = scanner.nextLine();
                    SinhVien sinhVien = new SinhVien(maSinhVien);
                    System.out.println("Xóa sinh viên trong danh sách : " + dssv.xoaSinhVien(sinhVien));
                    break;
                case 5:
                    System.out.println("Nhập họ và tên : ");
                    hoVaTen = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm : ");
                    dssv.timKiemSinhVien(hoVaTen);
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.") ;
            }
        }while(luaChon != 0);
    }
}
