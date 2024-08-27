import java.util.Scanner;

public class MaxFinderInteger {

    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        Integer num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        Integer num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        Integer num3 = scanner.nextInt();

        Integer max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
        
        scanner.close();
    }
}
