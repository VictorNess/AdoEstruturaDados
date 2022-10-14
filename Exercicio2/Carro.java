
public class Carro {

    private String nome;
    private int qtdManobra;

    public Carro(String nome) {
        this.nome = nome;
        this.qtdManobra = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdManobra() {
        return qtdManobra;
    }

    public void manobrar() {
        qtdManobra++;
    }

    @Override
    public String toString() {
        return nome + ", manobrou " + qtdManobra + " vezes";
    }

}