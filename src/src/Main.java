public class Main {
    public static void main(String[] args) {
        // Construir balão
        Balao b1 = new Balao();
        // Acionar voo da balão
        // Chamada do método voar()
        String resposta = b1.voar(new Combustival());
        // Apresentação do retorno
        System.out.println(resposta);
        Balao b2 = new Balao();
        Combustival alcool = new Combustival();
        System.out.println(b2.voar(alcool));


    }
}