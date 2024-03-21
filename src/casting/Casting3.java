package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1ㅊ
        int intValue = 0;

        intValue = (int)maxIntValue;
        System.out.println("maxIntValue casting= " + intValue);

        //overflow: 발생하는 것 자체가 문제
        intValue = (int)maxIntOver;
        System.out.println("maxIntOver casting= " + intValue); // -2147483648

    }
}
