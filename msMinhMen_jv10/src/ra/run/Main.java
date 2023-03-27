package ra.run;

import ra.bussiness.IShop;
import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog> catalogs = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        int choice = 0;
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục \n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "5. Thoát ");
            System.out.println("Vui lòng nhập lựa chọn của bạn !");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Nhập số danh mục sản phẩm:");
                    int numOfCatalogs = scanner.nextInt();

                    Catalog[] catalogs1 = new Catalog[numOfCatalogs];

                    for (int i = 0; i < numOfCatalogs; i++) {
                        System.out.println("Nhập thông tin danh mục sản phẩm thứ " + (i + 1) + ":");
                        Catalog catalog = new Catalog();
                        catalog.inputData();
                        catalogs1[i] = catalog;
                    }

                    System.out.println("Đã lưu trữ " + numOfCatalogs + " danh mục sản phẩm thành công.");

                    break;

                case 2:
                    System.out.println("Nhập số lượng sản phẩm cần nhập thông tin : ");
                    int n = scanner.nextInt();
                    System.out.println("Danh sách các danh mục sản phẩm: ");
                    for (int i = 0; i < catalogs.size(); i++) {
                        Catalog catalog = catalogs.get(i);
                        System.out.printf("%d. %s%n", i + 1, catalog.getCatalogName());
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhập thông tin cho sản phẩm thứ %d:%n", i + 1);
                        Product product = new Product();
                        product.inputData();
                        product.setExportPrice(product.getImportPrice() * IShop.RATE);
                        System.out.println("Chọn danh mục sản phẩm : ");
                        int catalogIndex = scanner.nextInt() - 1;
                        product.setCatalog(catalogs.get(catalogIndex));
                        product.add(product);
                    }
                        break;
                        case 3:
                            if (products.isEmpty()) {
                                System.out.println("Không có sách trong danh sách.");
                            } else {
                                System.out.println("Danh sách các sách hiện có : ");
                                for (Product product : products) {
                                    product.displayData();
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Nhập tên danh mục sản phẩm cần tìm kiếm:");
                            String catalogName = scanner.next();
                            List<Product> foundProducts = new ArrayList<>();
                            for (Product product : products) {
                                if (product.getCatalog().getCatalogName().equals(catalogName)) {
                                    foundProducts.add(product);
                                }
                            }
                            if (foundProducts.isEmpty()) {
                                System.out.println("Không tìm thấy sản phẩm nào thuộc danh mục " + catalogName);
                            } else {
                                System.out.println("Danh sách các sản phẩm thuộc danh mục " + catalogName + ":");
                                for (Product product : foundProducts) {
                                    product.displayData();
                                }
                            }

                            break;
                        case 5:
                            System.exit(0);
                default:
                    System.out.println("Không có sự lựa chọn này .");
                            break;
            }
        }
    }
}

