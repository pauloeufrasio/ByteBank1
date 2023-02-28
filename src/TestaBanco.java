public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente(); // Instaciando classe

        paulo.nome = "Paulo silveira ";
        paulo.cpf = "123.456.789-10";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        // associa o cliente a conta contaDoPaulo
        contaDoPaulo.titular = paulo; // Ligando os atributos da classe (Conta) a partir Dos atributos da classe (Cliente)
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);


    }
}
