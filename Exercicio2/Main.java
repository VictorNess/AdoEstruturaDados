public class Main {

    public static void main(String[] args) {

        Pilha estacionamento = new Pilha();
        Carro carro1 = new Carro("Carro1");
        Carro carro2 = new Carro("Carro2");
        Carro carro3 = new Carro("Carro3");
        Carro carro4 = new Carro("Carro4");
        Carro carro5 = new Carro("Carro5");
        Carro carro6 = new Carro("Carro6");
        Carro carro7 = new Carro("Carro7");
        Carro carro8 = new Carro("Carro8");
        Carro carro9 = new Carro("Carro9");
        Carro carro10 = new Carro("Carro10");
        
        estacionamento.push(carro1, false);
        estacionamento.push(carro2, false);
        estacionamento.push(carro3, false);
        estacionamento.push(carro4, false);
        estacionamento.push(carro5, false);
        estacionamento.push(carro6, false);
        estacionamento.push(carro7, false);
        estacionamento.push(carro8, false);
        estacionamento.push(carro9, false);
        estacionamento.push(carro10, false);

        estacionamento.saidaCarro(4);
        estacionamento.saidaCarro(6);
        estacionamento.saidaCarro(7);

        estacionamento.listar();

    }

}
