package exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> danhSachPhuHuynh = new LinkedList<>();
        while (true){
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng nhập sự lựa chọn của bạn. ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập tên phụ huynh : ");
                    String tenPhuHuynh = scanner.nextLine();
                    danhSachPhuHuynh.add(tenPhuHuynh);
                    break;
                case 2:
                    if (danhSachPhuHuynh.isEmpty()){
                        System.out.println("Danh sách trống. ");
                    }else {
                        String phuHuynhDauTien = danhSachPhuHuynh.poll();
                        System.out.println("Phụ huynh đầu tiên trong danh sách ."+phuHuynhDauTien);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình. ");
                    System.exit(0);
                default:
                    System.out.println("Không có sự lựa chọn này.");
                    break;
            }
        }
    }

}
