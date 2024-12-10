import java.util.Scanner;
public class Main {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static int soustraction(double a, double b) {
        return a - b;
    }

    public static int multiplication(double a, double b) {
        return a * b;
    }

    public static double  division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : veillez réssayer !");
            return Double.NaN;
        }
        return a / b;
    }


    public static double puissance(double a, double b) {
        return Math.pow(a, b);
    }
    public static double racineCarree(double a) {
        if (a < 0) {
            System.out.println("Erreur : veillez réssayez : ");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        System.out.println("Choisissez une opération :");
        System.out.println("1. Addition ");
        System.out.println("2. Soustraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Puissance ");
        System.out.println("6. Racine carrée ");
        System.out.println("7. Factorielle ");
        System.out.print("veillez choisis une operation : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Résultat : " + addition(a, b));
                break;
            case 2:
                System.out.println("Résultat : " + soustraction(a, b));
                break;
            case 3:
                System.out.println("Résultat : " + multiplication(a, b));
                break;
            case 4:
                System.out.println("Résultat : " + division(a, b));
                break;
            case 5:
                System.out.println("Résultat : " + puissance(a, b));
                break;
            case 6:
                System.out.println("Racine carrée du premier nombre : " + racineCarree(a));
                System.out.println("Racine carrée du deuxième nombre : " + racineCarree(b));
                break;
            case 7:


