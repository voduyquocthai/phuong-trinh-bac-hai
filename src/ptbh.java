import java.util.Scanner;
public class ptbh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print(("a :"));
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.print("Equation pass with x = " + answer);
        } else {
            if (b == 0){
                System.out.print(("The solution is all x"));
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
