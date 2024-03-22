package array;

public class EnhanceFor1 {
    public static void main(String[] args) {
        //for-each문
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        //증가하는 index 값 필요할 땐 사용 불가능
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
