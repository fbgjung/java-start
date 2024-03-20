package cond;

public class EvenOddEx {
    public static void main(String[] args) {
        //x가 짝수이면 짝수, 홀수이면 홀수 출력
        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }
}