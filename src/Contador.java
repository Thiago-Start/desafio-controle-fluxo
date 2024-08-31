import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro Parâmetro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo Parâmetro: ");
        int parametro2 = terminal.nextInt();
        int interacao = 0;
        int contagem;

        try {
            contar(parametro1, parametro2);
            if (parametro1 < parametro2) {
                interacao = parametro2 - parametro1;

                System.out.println("O número de interações entre " + parametro1 + " e " + parametro2 + " é: " + interacao);
                System.out.println("E estas interações são:");

                contagem = interacao;
                for (int i = 1; i <= contagem; i++) {
                    System.out.println(i);
                }

            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo Parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

    }
}
