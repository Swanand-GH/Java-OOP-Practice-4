
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new Exception();
            }
            System.out.println("Valid marks.");
        } catch (Exception e) {
            System.out.println("Invalid marks.");
        }
    }
}