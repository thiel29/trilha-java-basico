public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();
        
        // Testando funcionalidades do Reprodutor Musical
        System.out.println("\n=== REPRODUTOR MUSICAL ===");
        meuIPhone.selecionarMusica("Tina Turner - Simply The Best");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        // Testando funcionalidades do Aparelho Telefônico
        System.out.println("\n=== APARELHO TELEFÔNICO ===");
        meuIPhone.ligar("123-4567");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Testando funcionalidades do Navegador na Internet
        System.out.println("\n=== NAVEGADOR NA INTERNET ===");
        meuIPhone.exibirPagina("http://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}