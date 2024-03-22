package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students = new int[5];
        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 50;
        students[4] = 100;

        //변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + "의 점수: " + students[i]);
        }
    }
}
