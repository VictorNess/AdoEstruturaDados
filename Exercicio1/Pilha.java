import java.util.ArrayList;

public class Pilha {

    private ArrayList<String> oPilha;

    public Pilha () {
        oPilha = new ArrayList<>();
    }

    public void push(String elemento) {
        oPilha.add(elemento);
    }

    public boolean isVazia() {
        return oPilha.isEmpty();
    }

    public int tamanho() {
        return oPilha.size();
    }

    public String pop() {
        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);
    }

}
