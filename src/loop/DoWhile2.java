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

    public static class Nested1 {
        public static void main(String[] args) {
            for (int i = 0; i < 2; i++){
                System.out.println("외부 for 시작 i:" + i);
                for (int j = 0; j < 3; j++){
                    System.out.println("=> 내부 for " + i + "-" + j);
                }
                System.out.println("외부 for 종료 i:" + i);
                System.out.println();
            }
        }
    }

    public static class NestedEx1 {
        public static void main(String[] args) {
            for(int i = 1; i <= 9; i++){
                for (int j = 1; j <= 9; j++){
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }
    }

    public static class NestedEx2 {
        public static void main(String[] args) {
            int rows = 10;

            for (int i = 1; i <= rows; i++){
                for (int j = 1; j <= i ;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
