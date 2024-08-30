import java.util.*;

public class IO {
    public static void menu() {
        Jogar play = new Jogar();
        boolean execucao = true;
        int opcao = scanner("Que os jogos comecem!" +
                "\n 1 - Jogar" +
                "\n 0 - Finalizar jogo").nextInt();
        while (execucao) {
            if (opcao == 1) {
                play.play();
            } else if (opcao == 0) {
                execucao = false;
            } else{
                throw new RuntimeException("Opção inválida. Reinicie o jogo!");
            }
        }
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
