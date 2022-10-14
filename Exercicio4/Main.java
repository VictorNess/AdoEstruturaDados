public class Main {

    public static void main(String[] args) {

        Pilha p1 = new Pilha();
        Pilha p2 = new Pilha();
        Pilha p3 = new Pilha();

        p1.push(2.5f);
        p1.push(7.8f);
        p1.push(5.9f);

        p2.push(6.8f);
        p2.push(4.7f);

        while (!p2.isVazia()) {
            p3.push(p2.pop());
        }

        while (!p3.isVazia()) {
            p1.push(p3.pop());

        }

        p1.listar();
    }
}
