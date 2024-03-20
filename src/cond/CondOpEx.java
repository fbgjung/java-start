package cond;

public class CondOpEx {
    public static void main(String[] args) {
        // 삼항 연산자를 사용하여 두 숫자 주 더 큰 숫자를 출력하는 코드
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println(max);
    }
}
