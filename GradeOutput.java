import java.util.Scanner;

public class GradeOutput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in your grade as an integer: ");
        int grd = scan.nextInt();
        System.out.println("Your grade is: " + grd);

        if (98 <= grd && grd <= 100) { System.out.println("A+"); }
        else if (93 <= grd && grd <= 97) { System.out.println("A"); }
        else if (90 <= grd && grd <= 92) { System.out.println("A-"); }
        else if (88 <= grd && grd <= 89) { System.out.println("B+"); }
        else if (83 <= grd && grd <= 87) { System.out.println("B"); }
        else if (80 <= grd && grd <= 82) { System.out.println("B-"); }
        else if (78 <= grd && grd <= 79) { System.out.println("C+"); }
        else if (73 <= grd && grd <= 77) { System.out.println("C"); }
        else if (70 <= grd && grd <= 72) { System.out.println("C-"); }
        else if (68 <= grd && grd <= 69) { System.out.println("D+"); }
        else if (63 <= grd && grd <= 67) { System.out.println("D"); }
        else if (60 <= grd && grd <= 62) { System.out.println("D-"); }
        else if (0 <= grd && grd <= 59) { System.out.println("F"); }

    }
}