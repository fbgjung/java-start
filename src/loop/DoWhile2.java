package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        // do-while 문은 최소 한번은 항상 실행된다.
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
