import java.util.Scanner;

public class IO {
    public static void menu() {
        Jogo jogo = new Jogo();
        boolean execucao = true;

        while (execucao) {
            int opcao = scanner("Que os jogos comecem!" +
                    "\n 1 - Jogar" +
                    "\n 0 - Finalizar jogo").nextInt();

            if (opcao == 1) {
                jogo.jogar();
            } else if (opcao == 0) {
                execucao = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
