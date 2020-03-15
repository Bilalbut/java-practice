package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arithmatic calculator = new Arithmatic();
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        int a,b;
        while (flag) {
            System.out.print("\n\n--------------Calculator--------------\n\n");
            System.out.print("\n1. Add"
                    + "\n2. Subtact"
                    + "\n3. Multiply"
                    + "\n4. Divide"
                    + "\n5. Mod"
                    + "\n0. Exit");
            System.out.print("\n\nYour Choice:\t");

            switch (scan.nextInt()) {

                case 1:
                    System.out.print("\n\nEnter your first Number\t\t");
                    a = scan.nextInt();
                    System.out.print("\n\nEnter your second Number\t");
                    b = scan.nextInt();
                    
                    System.out.print("Sum =\t" + calculator.add(a, b));
                    break;
                case 2:
                    System.out.print("\n\nEnter your first Number\t\t");
                    a = scan.nextInt();
                    System.out.print("\n\nEnter your second Number\t");
                    b = scan.nextInt();

                    System.out.print("Sub =\t" + calculator.subtract(a, b));
                    break;

                case 3:
                    System.out.print("\n\nEnter your first Number\t\t");
                    a = scan.nextInt();
                    System.out.print("\n\nEnter your second Number\t");
                    b = scan.nextInt();

                    System.out.print("Multiply =\t" + calculator.multiply(a, b));
                    break;
                case 4:
                    System.out.print("\n\nEnter your first Number\t\t");
                    a = scan.nextInt();
                    System.out.print("\n\nEnter your second Number\t");
                    b = scan.nextInt();

                    System.out.print("Divide =\t" + calculator.divide(a, b));
                    break;
                case 5:
                    System.out.print("\n\nEnter your first Number\t\t");
                    a = scan.nextInt();
                    System.out.print("\n\nEnter your second Number\t");
                    b = scan.nextInt();

                    System.out.print("Mod =\t" + calculator.mod(a, b));
                    break;
                case 0:
                    flag = !flag;
                    break;
                default:
                    break;
            }
        }

    }

}
