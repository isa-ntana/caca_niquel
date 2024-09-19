import java.util.*;

public class Jogo {
    private List<Fruta> frutas;
    private Scanner scanner;

    public Jogo() {
        this.scanner = new Scanner(System.in);
        this.frutas = Arrays.asList(Fruta.values());
    }

    public void jogar() {
        int pontos = 0;
        int dificuldade = obterOpcao("Digite a dificuldade que deseja:");
        List<Fruta> sorteios = new ArrayList<>();

        for (int i = 0; i < dificuldade; i++) {
            Fruta frutaSorteada = frutas.get((int) (Math.random() * frutas.size()));
            sorteios.add(frutaSorteada);
            pontos += frutaSorteada.getPontos();
            System.out.print(frutaSorteada.getNome() + " | ");
        }

        if (todasIguais(sorteios)) {
            pontos += sorteios.get(0).getPontos() * dificuldade * 10; // Bônus
        }

        System.out.println("\nPontos obtidos: " + pontos);
    }

    private boolean todasIguais(List<Fruta> sorteios) {
        String nomePrimeiro = sorteios.get(0).getNome();
        for (Fruta fruta : sorteios) {
            if (!fruta.getNome().equals(nomePrimeiro)) {
                return false;
            }
        }
        return true;
    }

    private int obterOpcao(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextInt();
    }
}
