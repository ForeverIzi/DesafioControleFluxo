import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidException {
        if (numero1 >= numero2) {
            throw new ParametrosInvalidException();
        }

        for (int x = numero1; x <= numero2; x++) {
            System.out.println("Imprimindo o número: " + x); 
        }
    }
}