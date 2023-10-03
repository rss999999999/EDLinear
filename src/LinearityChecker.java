/**
 * No problema afirma-se a ordem de uma dada equação diferencial ordinária.
 * Determine se a equação é linear ou não linear através da classificação por linearidade.
 *
 * (1-x)y''-4xy'+5y = cos x
 *
 */
import java.util.Scanner;

import java.util.Scanner;

public class LinearityChecker {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        String[] terms = equation.split("=");
        String leftSide = terms[0];
        String rightSide = terms[1];

        // Verificação da linearidade do lado esquerdo da equação
        boolean leftSideLinear = isLinear(leftSide);

        // Verificação da linearidade do lado direito da equação
        boolean rightSideLinear = isLinear(rightSide);

        // Impressão do resultado
        if (leftSideLinear && rightSideLinear) {
            System.out.println("A equação é linear.");
        } else {
            System.out.println("A equação não é linear.");
        }
    }

    private static boolean isLinear(String equation) {
        for (char c : equation.toCharArray()) {
            if (c >= 'x' && c <= 'z') {
                return false;
            }
        }
        return true;
    }
}

/*
  No problema afirma-se a ordem de uma dada equação diferencial ordinária.
          Determine se a equação é linear ou não linear através da classificação por linearidade.

          (1-x)y''-4xy'+5y = cos x*/
