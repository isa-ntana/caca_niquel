public enum Fruta {
    BANANA(10),
    MORANGO(20),
    ESTRELA(40);

    private final int pontos;

    Fruta(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return this.name();
    }
}
