import java.util.Scanner;
public class Main {
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double soustraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : veillez réssayer !");
        }
        return a / b;
    }


    public static double puissance(double a, double b) {
        return Math.pow(a, b);
    }

    public static double racineCarree(double a) {
        if (a < 0) {
            System.out.println("Erreur : veillez réssayez !");
        }
        return Math.sqrt(a);
    }

    public static double factorial(double a) {
        if (a < 0) {
            System.out.println("ERREUR : veillez réssayer !");
        }
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            double a = 0;
            double b = 0;
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition ");
            System.out.println("2. Soustraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division ");
            System.out.println("5. Puissance ");
            System.out.println("6. Racine carrée ");
            System.out.println("7. Factorielle ");
            System.out.print("veillez choisis une operation : ");
            choix = scanner.nextInt();
            if (choix != 6) {
                System.out.print("Entrez le premier nombre : ");
                a = scanner.nextDouble();
                System.out.print("Entrez le deuxième nombre : ");
                b = scanner.nextDouble();
            } else {
                System.out.print("Entrez le nombre pour la racine carrée : ");
                a = scanner.nextDouble();
            }

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
                    break;
                case 7:
                    System.out.println("resultat :" + factorial(a));
                    break;
                case 8:
                    System.out.println("merci!");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (choix != 8);
    }
}
