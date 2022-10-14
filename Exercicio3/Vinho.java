
public class Vinho {

    private String nome;
    private int safra;

    public Vinho(String nome, int safra) {
        this.nome = nome;
        this.safra = safra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    @Override
    public String toString() {
        return  nome + ", " + safra;
    }

    

}