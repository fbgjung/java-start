package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] students = new int[5];
        int sum = 0;
        int number = students.length;

        System.out.println("5개의 점수를 입력하세요: ");
        for (int i = 0; i < students.length; i++){
            students[i] = input.nextInt();
            sum += students[i];
        }
        double average = (double)sum / number;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);
    }
}
