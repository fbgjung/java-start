package loop;

public class WhileEx2 {
    // 10개의 짝수를 출력
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10){
            System.out.println(num++ * 2);
        }
    }
}
