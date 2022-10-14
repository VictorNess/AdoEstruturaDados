public class Parenteses {

    public static void main(String[] args) {

        Pilha p1 = new Pilha();

        String texto = "(())";

        String[] aux = texto.split("");

        for (int i = 0; i < texto.length(); i++) {

            p1.push(aux[i]);

            if (aux[i].equals(")") && p1.tamanho() >= 2) {
                p1.pop();
                p1.pop();
            }
        }

        System.out.println(texto + (p1.isVazia() ? " OK" : " Erro"));

    }
}
