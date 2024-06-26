package ch03.part05.main4;

import ch03.part05.main4.service.ProductService;
import ch03.part05.main4.vo.ProductVo;

public class TestMain {
    public static void main(String[] args){
        /** 1.다음 3개의 품목의 정보를 ProductVo로 만든 후 신규 등록하시오. */

        // 1) product1 객체생성 및 속성설정
        ProductVo product1 = new ProductVo();
        product1.setProductNo("a001");
        product1.setProductName("아메리카노");
        product1.setPrice(4000);

        // 2) product2 객체생성 및 속성설정
        ProductVo product2 = new ProductVo();
        product2.setProductNo("a002");
        product2.setProductName("카페 라떼");
        product2.setPrice(4300);

        // 3) product3 객체생성 및 속성설정
        ProductVo product3 = new ProductVo();
        product3.setProductNo("a003");
        product3.setProductName("카페 모카");
        product3.setPrice(4500);

        /** ProductService 사용을 위한 객체생성 */
        ProductService service = new ProductService();

        // 4) 데이터베이스 시스템에 자료등록
        service.insertProduct(product1);
        service.insertProduct(product2);
        service.insertProduct(product3);

        /** 2. 아메리카노 품목의 단가를 200원 인상 후 자료를 저장하시오. */
        int price = product1.getPrice()+200;
        product1.setPrice(price);
        int updateProduct = service.updateProduct(product1);
        System.out.println(updateProduct);

        /** 3. 카페 모카 품목을 삭제하시오. */
        service.deleteProduct("a003");

        /** 4. a001의 품목정보를 조회하시오. */
        ProductVo productVo = service.getProduct("a001");
        System.out.println(productVo);
    }
}