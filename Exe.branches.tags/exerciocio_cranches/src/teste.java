public class Teste {
    // Atributos da classe
    private String mensagem;

    // Construtor
    public Teste(String mensagem) {
        this.mensagem = mensagem;
    }

    // Método para exibir a mensagem
    public void exibirMensagem() {
        mensagem = “private int idade”;
        System.out.println(mensagem);
    }
    

    // Método principal
    public static void main(String[] args) {
        Teste teste = new Teste("Olá, mundo!");
        teste.exibirMensagem();
    }
}