package casting;

public class Casting2 {
    public static void main(String[] args) {
        //큰 범위의 값을
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; //컴파일 오류 발생
        intValue = (int)doubleValue;
        System.out.println(intValue); // 1.5 -> 1
        System.out.println(doubleValue); // doubleValue의 값은 유지된다.
    }
}
