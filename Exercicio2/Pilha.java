import java.util.ArrayList;

public class Pilha {

    private ArrayList<Carro> oPilha;
    private final int LIMITE = 10;

    public Pilha() {
        oPilha = new ArrayList<>();
    }

    public void push(Carro carro, boolean manobrando) {
        if (tamanho() == LIMITE) {
            System.out.println("Estacionamento cheio, sem vagas disponíveis.");
        } else {
            if (!manobrando) {
                System.out.println("Carro entrando no estacionamento: " + carro.getNome());
            }
            oPilha.add(carro);
        }

    }

    public boolean isVazia() {
        return oPilha.isEmpty();
    }

    public int tamanho() {
        return oPilha.size();
    }

    public Carro pop() {
        return isVazia() ? null : oPilha.remove(oPilha.size() - 1);
    }

    public void saidaCarro(int indice) {
        Pilha oPilhaAux = new Pilha();
        while (indice != tamanho() - 1) {
            oPilhaAux.push(pop(), true);
            oPilhaAux.primeiro().manobrar();
        }

        System.out.println("Carro saindo do estacionamento: " + pop());

        while (!oPilhaAux.isVazia()) {
            push(oPilhaAux.pop(), true);
            primeiro().manobrar();
        }
    }

    public void listar() {
        oPilha.forEach(System.out::println);
    }

    public Carro primeiro() {
        return isVazia() ? null : oPilha.get(oPilha.size() - 1);
    }

}
