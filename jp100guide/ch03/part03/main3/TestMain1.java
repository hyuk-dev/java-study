package ch03.part03.main3;

public class TestMain1 {
    public static void main(String[] args){
        /** 실수 -> 정수로 형변환 : 값의 변경 있음 */
        double a = 1.414;
        int b = (int)a;

        /** 정수 -> 실수로 형변환 : 값의 변경 없음 */
        int c = 1;
        double d = (double)c;
        double e = c;

        /** char -> 정수로 형 변환 : 값의 변경 있음 */
        char m = 'A';
        int n = (int) m;

        /** char -> 정수로 형 변환 : 값의 변경 있음 */
        int o = 100;
        char p = (char) o;

        System.out.println(a + " " + b);

        System.out.println(c + " " + d + " " + e);

        System.out.println(m + " " + n);

        System.out.println(o + " " + p);
    }
}
