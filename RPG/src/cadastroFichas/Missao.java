package cadastroFichas;

public class Missao{
    private String nome;
    private String dificuldade;
    private String recompensa;
    private String descricao;

    public Missao(String nome, String dificuldade, String recompensa, String descricao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.recompensa = recompensa;
        this.descricao = descricao;
    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return this.dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getRecompensa() {
        return this.recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Recompensa: " + recompensa);
        System.out.println("Descrição: " + descricao);
    }

}