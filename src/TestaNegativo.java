public class TestaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);

        conta.saca(50);
        // proibido
        // conta.saldo = conta.saldo-101;
        System.out.println(conta.pegaSaldo());


    }
}
