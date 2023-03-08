public class testaConta {
    public static void main(String[] args) {

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(200);

        contaDaMarcela.saca(150);
        System.out.println(contaDaMarcela.pegaSaldo());

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);






    }
}
