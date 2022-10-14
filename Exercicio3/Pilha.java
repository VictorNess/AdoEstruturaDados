import java.util.ArrayList;

public class Pilha {

    private ArrayList<Vinho> oPilha;

    public Pilha() {
        oPilha = new ArrayList<>();
    }

    public void push(Vinho vinho) {
        oPilha.add(vinho);
    }

    public boolean isVazia() {
        return oPilha.isEmpty();
    }

    public int tamanho() {
        return oPilha.size();
    }

    public Vinho pop() {
        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);
    }

    public void listar (){
        oPilha.forEach(System.out::println);
    }

}
