package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Product implements IShop, Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private Boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm : ");
        productId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm  : ");
        productName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm : ");
        title = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm : ");
        descriptions = scanner.nextLine();
        System.out.println("Nhập giá nhập sản phẩm  : ");
        importPrice = Float.parseFloat(scanner.nextLine());
        scanner.nextLine();
        exportPrice =importPrice * RATE;
        System.out.println("Nhập trạng thái sản phẩm (true/false): ");
        productStatus = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Mã sản phẩm : "+productId);
        System.out.println("Tên sản phẩm : "+productName);
        System.out.println("Tên danh mục sản phẩm : "+productName);
        System.out.println("Giá bán sản phẩm : "+exportPrice);
        System.out.println("Trạng thái sản phẩm : "+productStatus);
    }

    public void add(Product product) {
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
