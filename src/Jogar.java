import java.util.*;

public class Jogar {

    public void play () {
        int opcao = scanner("Digite 1 para roletar e 0 para voltar").nextInt();
        if (opcao == 1) {
            int pontos = 0;
            int dificuldade = scanner("Digite a dificuldade que deseja").nextInt();
            List<String> itens = Arrays.asList("Banana", "Morango", "Estrela");
            List<String> sorteios = new ArrayList<>();

            for (int indice = 0; indice < dificuldade; indice++) {
                int sorteio = (int) (Math.random() * itens.size());
                String itensSorteados = itens.get(sorteio);
                sorteios.add(itensSorteados);
                if (itensSorteados.equals("Banana")) {
                    pontos += 10;
                } else if (itensSorteados.equals("Morango")) {
                    pontos += 20;
                } else if (itensSorteados.equals("Estrela")) {
                    pontos += 40;
                } else {
                    throw new RuntimeException("Erro ao roletar");
                }
                System.out.print(itensSorteados + " | ");
            }

            boolean todasIguais = true;
            String palavraSorteada = sorteios.get(0);

            for (String letra : sorteios) {
                if (!letra.equals(palavraSorteada)) {
                    todasIguais = false;
                    break;
                }
            }

            if (todasIguais) {
                if (palavraSorteada.equals("Banana")) {
                    pontos += (10 * dificuldade) * 100;
                } else if (palavraSorteada.equals("Morango")) {
                    pontos += (20 * dificuldade) * 100;
                } else if (palavraSorteada.equals("Estrela")) {
                    pontos += (40 * dificuldade) * 100;
                }
            }

            System.out.println("\n Pontos obtidos: " + pontos);
        } else if (opcao == 0) {
            IO.menu();
        }
    }

    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
