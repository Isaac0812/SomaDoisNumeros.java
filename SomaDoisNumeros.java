import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler os dados do usuário
        Scanner entrada = new Scanner(System.in);

        // Lê o primeiro número
        System.out.print("Digite um valor: ");
        int numero1 = entrada.nextInt();

        // Lê o segundo número
        System.out.print("Digite outro valor: ");
        int numero2 = entrada.nextInt();

        // Calcula a soma
        int soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " é igual a " + soma + ".");

        // Fecha o Scanner
        entrada.close();
    }
}
