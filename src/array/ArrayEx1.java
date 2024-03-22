package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};
        int sum = 0;
        int number = students.length;

        for (int student : students) {
            sum += student;
        }

        double average = (double)sum / number;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);
    }
}
