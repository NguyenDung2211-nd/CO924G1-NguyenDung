package case_study.view;

import case_study.controller.SongController;
import case_study.entity.Song;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println();
            System.out.println("========== QUẢN LÍ BÀI HÁT & QUẢN LÍ DANH SÁCH PHÁT ==========");
            System.out.println();
            System.out.println("1. Quản lí bài hát.");
            System.out.println("2. Quản lí danh sách phát.");
            System.out.println("0. Thoát chương trình.");
            System.out.println("Mời bạn nhập lựa chọn : ");
            choice = getChoice(scanner);

            switch(choice){
                case 1:
                    managerSong();
                    break;
                case 2:
                    managerPlaylist(scanner);
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    return;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
            }
        }
    }

    private static void managerSong(){
        Scanner scanner = new Scanner(System.in);
        SongController songController = new SongController();
        int choice = 0;
        while(true){
            System.out.println();
            System.out.println("========== Quản lí bài hát ==========");
            System.out.println("1. Thêm bài hát.");
            System.out.println("2. Hiển thị danh sách bài hát.");
            System.out.println("3. Xóa bài hát (Nhập id bài hát để xóa).");
            System.out.println("4. Tìm kiếm bài hát (Nhập tên bài hát để tìm kiếm).");
            System.out.println("5. Sửa thông tin bài hát (Nhập id bài hát để sửa).");
            System.out.println("6. Sắp xếp bài hát theo tên (Nếu cùng tên thì sắp xếp theo id)");
            System.out.println("0. Thoát khỏi chương trình.");
            System.out.println("Mời bạn nhập lựa chọn : ");
            choice = getChoice(scanner);

            switch(choice){
                case 1:
                    addSong(scanner, songController);
                    break;
                case 2:
                    songController.print();
                    break;
                case 3:
                    deleteSong(scanner, songController);
                    break;
                case 4:
                    searchSong(scanner, songController);
                    break;
                case 5:
                    editSong(scanner, songController);
                    break;
                case 6:
                    songController.sortByNameThenId();
                    songController.print();
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void addSong(Scanner scanner, SongController songController){
        int id = 0;
        while(true){
            System.out.println("Nhập id bài hát : ");
            try{
                id = Integer.parseInt(scanner.nextLine());
                if(id <= 0){
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0)");
                }else if(songController.isIdExist(id)){
                    System.out.println("Id bài hát đã tồn tại. vui lòng nhập id khác.");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("sai yêu cầu. Id phải là một số.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.println("Nhập tên bài hát : ");
        String name = scanner.nextLine();

        System.out.println("Nhập tên ca sĩ : ");
        String singer = scanner.nextLine();

        System.out.println("Nhập thể loại nhạc : ");
        String genre = scanner.nextLine();

        int releaseYear = 0;
        while(true){
            System.out.println("Nhập năm sản xuất : ");
            try{
                releaseYear = Integer.parseInt(scanner.nextLine());
                if(releaseYear <= 0){
                    System.out.println("Sai yêu cầu. Năm sản xuất phải là một số nguyên dương (> 0)");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. Năm sản xuất phải là một số.");
            }
        }
        songController.add(id, name, singer, genre, releaseYear);
    }

    private static void deleteSong(Scanner scanner, SongController songController) {
        int id = 0;
        while(true) {
            System.out.print("Nhập id bài hát cần xóa: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if(id <= 0){
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0).");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. id phải là 1 số.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }
        Song song = songController.getById(id);
        if(song == null){
            System.out.println("Không tìm thấy bài hát có id là " + id +".");
        }else{
            System.out.println("Thông tin bài hát cần xóa : " + song +".\nBạn có chắc muốn xóa bài hát này không? " + "\n Lưu ý hành động này không thể hoàn tác.");
            System.out.println("Bấm y để xác nhận xóa. Bấm phím bất kì để hủy.");

            char confirm = scanner.nextLine().charAt(0);

            if(confirm == 'y'){
                songController.delete(id);
            }else{
                System.out.println("Hủy xóa bài hát.");
            }
        }
    }

    private static void searchSong(Scanner scanner, SongController songController) {
        System.out.print("Nhập tên bài hát cần tìm: ");
        String name = scanner.nextLine();
        songController.search(name);
    }

    private static void editSong(Scanner scanner, SongController songController) {
        int id;
        while (true) {
            System.out.print("Nhập id bài hát cần sửa: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0).");
                    continue;
                }
                if (songController.getById(id) == null) {
                    System.out.println("Không tìm thấy bài hát với Id: " + id);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai yêu cầu. id phải là một số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.println("Nhập tên bài hát mới : ");
        String name = scanner.nextLine();

        System.out.println("Nhập tên ca sĩ mới :");
        String singer = scanner.nextLine();

        System.out.println("Nhập thể loại nhạc mới : ");
        String genre = scanner.nextLine();

        int releaseYear;
        while (true) {
            System.out.print("Nhập năm phát hành bài hát mới : ");
            try {
                releaseYear = Integer.parseInt(scanner.nextLine());
                if (releaseYear <= 0) {
                    System.out.println("Sai yêu cầu. Số năm phát hành phải lớn hơn 0.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai yêu cầu. Năm phát hành phải là một số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định.");
            }
        }
        songController.edit(id, name, singer, genre, releaseYear);
    }



    private static void managerPlaylist(Scanner scanner){
        int choice = 0;
        while(true){
            System.out.println();
            System.out.println("========== QUẢN LÍ DANH SÁCH PHÁT ==========");
            System.out.println("1. Tạo danh sách phát mới.");
            System.out.println("2. Hiển thị danh sách phát.");
            System.out.println("3. Thêm bài hát vào danh sách phát.");
            System.out.println("4. Xóa bài hát khỏi danh sách phát.");
            System.out.println("5. Xóa danh sách phát.");
            System.out.println("6. Tìm kiếm danh sách phát (Nhập tên danh sách phát để xóa.");
            System.out.println("7. Sửa tên danh sách phát (Nhập id danh sách phát để sửa)");
            System.out.println("0. Thoát chương trình.");
            choice = getChoice(scanner);

            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    return;
            }
        }
    }

    private static int getChoice(Scanner scanner){
        int choice = 0;
        while(true){
            try{
                choice = Integer.parseInt(scanner.nextLine());
                return choice;
            }catch(NumberFormatException e){
                System.out.println("Lựa chọn phải là một số.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }
    }
    
}
