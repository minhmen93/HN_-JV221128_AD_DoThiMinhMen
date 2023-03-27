package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {

    private int catalogId ;
    private String catalogName;
    private int priority;
    private String descriptions;
    private Boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã danh mục sản phẩm : ");
        catalogId = input.nextInt();
        System.out.println("Nhập tên danh mục sản phẩm : ");
        catalogName = input.nextLine();
        input.nextLine();
        System.out.println("Độ ưu tiên :  ");
        priority = input.nextInt();
        input.nextLine();
        System.out.println("Nhập mô tả danh mục : ");
        descriptions = input.nextLine();
        System.out.println("Nhập trạng thái danh mục (true/false) : ");
        catalogStatus = input.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Mã danh mục : "+catalogId);
        System.out.println("Tên danh mục : "+catalogName);
        System.out.println("Độ ưu tiên : "+priority);
        System.out.println("Mô tả danh mục : "+descriptions);
        System.out.println("Trạng thái danh mục : "+catalogStatus);
    }



}
