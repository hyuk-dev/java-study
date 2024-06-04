package ch03.part04.main1;

import ch03.part04.main1.vo.ProductVo;

public class TestReference1 {
    public static void main(String[] args){

        /** 참조형 변수의 생성 */
        ProductVo product1 = new ProductVo();
        ProductVo product2 = new ProductVo();
        ProductVo product3 = new ProductVo();

        /** Product1 속성 정보 */
        product1.productNo = "a001";
        product1.productName = "아메리카노";
        product1.price = 1500;

        /** Product2 속성 정보 */
        product2.productNo = "a002";
        product2.productName = "카페라떼";
        product2.price = 3000;

        /** Product3 속성 정보 */
        product3.productNo = "a003";
        product3.productName = "디카페인 카페라떼";
        product3.price = 3500;

        /** 객체에 담긴 속성의 값 확인 */
        System.out.println("[product1]=============");
        System.out.println("품목번호 :" + product1.productNo);
        System.out.println("품목명 :" + product1.productName);
        System.out.println("가격 :" + product1.price);

        System.out.println("[product2]=============");
        System.out.println("품목번호 :" + product2.productNo);
        System.out.println("품목명 :" + product2.productName);
        System.out.println("가격 :" + product2.price);

        System.out.println("[product3]=============");
        System.out.println("품목번호 :" + product3.productNo);
        System.out.println("품목명 :" + product3.productName);
        System.out.println("가격: " + product3.price);
        System.out.println();

        /** 객체 비교 A */
        boolean compare1 = (product1 == product2);
        boolean compare2 = (product1 == product3);
        System.out.println("product1 == product2 :" + compare1);
        System.out.println("product1 == product3 :" + compare2);

        /** 객체 메모리 주소 복사 */
        ProductVo prod1 = product1;
        ProductVo prod2 = product2;
        ProductVo prod3 = product3;

        /** 객체 비교 B */
        boolean compare3 = (prod1 == product1);
        boolean compare4 = (prod2 == product2);
        boolean compare5 = (prod3 == product3);

        System.out.println("prod1 == product1 :" + compare3);
        System.out.println("prod2 == product2 :" + compare4);
        System.out.println("prod3 == product3 :" + compare5);

        /** 타입 비교 */
        boolean typeCompare1 = (product1 instanceof ProductVo);
        boolean typeCompare2 = (product2 instanceof ProductVo);
        boolean typeCompare3 = (product3 instanceof ProductVo);
        System.out.println("product1 instanceof ProductVo :" + typeCompare1);
        System.out.println("product2 instanceof ProductVo :" + typeCompare2);
        System.out.println("product3 instanceof ProductVo :" + typeCompare3);
    }
}
