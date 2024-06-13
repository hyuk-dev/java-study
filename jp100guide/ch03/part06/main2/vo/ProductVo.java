package ch03.part06.main2.vo;

public class ProductVo{

    public String productNo;
    public String productName;
    public int price;

    public void setProductNo(String productNo){
        this.productNo = productNo;
    }

    public String getProductNo(){
        return productNo;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    /** 외부에서 품목번호, 품목명 입력 시 전역변수에 저장하기 위한 함수     */
    public void setProductInfo(String productNo, String productName){
        this.productNo = productNo;
        this.productName = productName;
    }

    /** 외부에서 품목번호, 품목명, 단가 입력 시 전역변수에 저장하기 위한 함수 */
    public void setProductInfo(String productNo, String productName, int price){
        this.productNo = productNo;
        this.productName = productName;
        this.price = price;
    }

    public void printProductInfo(){
        System.out.println(productNo);
        System.out.println(productName);
        System.out.println(price);
        System.out.println("===============");
    }
}