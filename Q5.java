import java.util.Scanner;

class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception();
            }

            System.out.println("Eligible to vote.");

        } catch (Exception e) {
            System.out.println("Not eligible to vote.");
        }
    }
}