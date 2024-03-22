package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = input.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n ; i++){
            numbers[i] = input.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];

        for (int i = 1; i < n; i++){
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }

            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 큰 수: " + maxNumber);
        System.out.println("가장 작은 수: " + minNumber);
    }
}
