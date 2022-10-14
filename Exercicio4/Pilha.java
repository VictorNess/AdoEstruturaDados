import java.util.ArrayList;

public class Pilha {

    private ArrayList<Float> oPilha;

    public Pilha() {
        oPilha = new ArrayList<>();
    }

    public void push(Float numero) {
        oPilha.add(numero);
    }

    public boolean isVazia() {
        return oPilha.isEmpty();
    }

    public int tamanho() {
        return oPilha.size();
    }

    public Float pop() {
        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);
    }

    public void listar (){
        oPilha.forEach(System.out::println);
    }

}
