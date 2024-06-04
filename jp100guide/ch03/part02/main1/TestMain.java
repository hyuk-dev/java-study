package ch03.part02.main1;

import java.util.Scanner;

/** another package's class import */
import ch03.part02.main1.vo.ProductVo;

public class TestMain {

    /** main class define */
    public static void main(String[] args){

        

        /** Reference variable create */
        ProductVo product1 = new ProductVo();
        ProductVo product2 = new ProductVo();
        ProductVo product3 = new ProductVo();

        /** Product1 Attributes Insert */
        product1.productNo = "a001";
        product1.productName = "Americano";
        product1.price = 4000;

        /** Product2 Attributes Insert */
        product2.productNo = "a002";
        product2.productName = "Caffe latte";
        product2.price = 4300;

        /** product3 Attributes Insert */
        product3.productNo = "a003";
        product3.productName = "Dolce latte";
        product3.price = 4800;

        System.out.println("주문할 제품의 숫자를 입력하세요. (1:아메리카노, 2:카페라떼, 3:돌체라떼)");
        System.out.print(":");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        if(num == 1){ // 1 입력 시 
            System.out.println("========[주문하실 제품 정보]========");
            System.out.println("제품 번호: " + product1.productNo);
            System.out.println("제품명: " + product1.productName);
            System.out.println("가격: " + product1.price);
        }
        else if(num == 2){ // 2 입력 시 
            System.out.println("========[주문하실 제품 정보]========");
            System.out.println("제품 번호: " + product2.productNo);
            System.out.println("제품명: " + product2.productName);
            System.out.println("가격: " + product2.price);
        }
        else if(num == 3){ // 3 입력 시 
            System.out.println("========[주문하실 제품 정보]========");
            System.out.println("제품 번호: " + product3.productNo);
            System.out.println("제품명: " + product3.productName);
            System.out.println("가격: " + product3.price);
        }
        else{ // 다른 값 입력 시 예외처리
            System.out.println("올바르지 않은 값입니다.");
        }

        
        
    }
}
