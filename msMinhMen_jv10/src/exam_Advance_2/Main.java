package exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        while (true){
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập câu : ");
                    String input = scanner.nextLine();
                    String[] words = input.split(" ");
                    for (String word : words){
                        stack.push(word);
                    }
                    break;
                case 2:
                    System.out.println("Câu đảo ngược là : ");
                    while (!stack.empty()){
                        System.out.println(stack.pop()+" ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình .");
                    System.exit(0);
                default:
                    System.out.println("Không có sự lựa chọn này .");
                    break;
            }
        }
    }
}
