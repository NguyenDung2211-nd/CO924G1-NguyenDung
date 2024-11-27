package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Nhập đường dẫn tệp nguồn : ");
         String sourcePath = scanner.nextLine();

         BufferedReader reader = null;
         try{
             reader = new BufferedReader(new FileReader(sourcePath));
         }catch(FileNotFoundException e){
             System.out.println("Tệp nguồn không tồn tại. Hãy kiểm tra lại.");
         }

         System.out.println("Nhập đường dẫn tệp đích : ");
         String targetPath = scanner.nextLine();

        if (reader == null) {
            System.out.println("Không thể tiếp tục sao chép vì tệp nguồn không hợp lệ.");
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
                String line;
                int charCount = 0;

                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                    charCount += line.length();
                }

                System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + charCount);

            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi khi ghi tệp: " + e.getMessage());
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    System.out.println("Đã xảy ra lỗi khi đóng tệp nguồn: " + e.getMessage());
                }
            }
        }

    }
}
