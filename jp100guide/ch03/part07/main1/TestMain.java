package ch03.part07.main1;

import ch03.part07.main1.vo.ProductVo1;

public class TestMain {
    public static void main(String[] args) {
        /** ProductVo1 타입의 객체 생성 */
        ProductVo1 prod1 = new ProductVo1();
        prod1.productNo = "a001";
        prod1.productName = "아메리카노";
        prod1.price = 4000;
        prod1.type = 1;

        /** ProductVo2 타입의 객체 생성 */
        ProductVo2 prod2 = new ProductVo2();
        prod2.productNo = "a002";
        prod2.productName = "카페라떼";
        prod2.price = 4300;
        prod2.type = 1;
    }
}
