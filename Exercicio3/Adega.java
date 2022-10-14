import java.util.Scanner;

public class Adega {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pilha estoque = new Pilha();
        Vinho vinho1 = new Vinho("Malbec", 1990);
        Vinho vinho2 = new Vinho("Pinot Noir", 1980);
        Vinho vinho3 = new Vinho("Syrah", 1975);

        int escolha;

        estoque.push(vinho1);
        estoque.push(vinho2);
        estoque.push(vinho3);

        do {
            System.out.println();
            System.out.println("Informe uma das opções abaixo: ");
            System.out.println("1. Listar todos os vinhos da adega");
            System.out.println("2. Adicionar vinho");
            System.out.println("3. Tomar último vinho comprado");
            System.out.println("0. Sair");
            escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    estoque.listar();
                    break;
                case 2:
                    System.out.print("Informe o nome do vinho: ");
                    String nome = teclado.nextLine();
                    System.out.print("Informe o ano da safra: ");
                    int safra = teclado.nextInt();
                    teclado.nextLine();

                    estoque.push(new Vinho(nome, safra));
                    break;
                case 3:
                    if (estoque.isVazia()) {
                        System.out.println("Estoque está vazio.");
                    } else {
                        System.out.println("Você está tomando o vinho: " + estoque.pop());
                    }
                    break;
                default:
                    break;
            }

        } while (escolha != 0);

        teclado.close();
    }
}
