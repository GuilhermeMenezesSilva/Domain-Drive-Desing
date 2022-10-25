public class Jogador {

    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    // construtor padrão
    public Jogador() {
        this.xp = 0;
        this.hp = 100;
        this.envenenado = false;
    }

    // Sobrecarga de método construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.xp = 0;
        this.hp = 100;
        this.envenenado = false;
    }

    // métodos de acesso
    public int getXp() { // assinatura do método
        return this.xp;
    }

    public int getHp() {
        return this.hp;
    }

    public boolean isEnvenenado() {
        return this.envenenado;
    }

    // métodos de ação / trabalhos / workers
    public void receberDano(int pontos) {
        if (pontos > 0)
            this.hp -= pontos;
    }

    public void receberCura(int pontos) {
        if (pontos > 0)
            this.hp += pontos;
    }

    public void ganhaExperiencia(int pontos) {
        if (pontos > 0)
            this.xp += pontos;
    }

    public void receberAntidoto() {
        if (envenenado) {
            envenenado = false;
        } else {
            envenenado = true;
        }
    }
}