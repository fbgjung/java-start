package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 27;
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);
    }
}