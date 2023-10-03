/**
 * No problema afirma-se a ordem de uma dada equação diferencial ordinária.
 * Determine se a equação é linear ou não linear através da classificação por linearidade.
 *
 * (1-x)y''-4xy'+5y = cos x
 *
 */
import java.util.Scanner;

public class LinearityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a equação:");
        String equation = scanner.nextLine();
        String[] terms = equation.split("=");

        boolean isLinearSecondOrder = checkLinearity(terms[0]) && checkLinearity(terms[1]);

        if (isLinearSecondOrder) {
            System.out.println("A equação é linear de segunda ordem.");
        } else {
            System.out.println("A equação não é linear de segunda ordem.");
        }
    }

    private static boolean checkLinearity(String equation) {
        if (equation.contains("''") || equation.contains("'")) {
            return false;
        }

        if (!equation.contains("y''") || !equation.contains("y'") || !equation.contains("y")) {
            return false;
        }

        return true;
    }
}

/*
  No problema afirma-se a ordem de uma dada equação diferencial ordinária.
          Determine se a equação é linear ou não linear através da classificação por linearidade.

          (1-x)y''-4xy'+5y = cos x*/
