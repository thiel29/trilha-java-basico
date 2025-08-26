public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    
    public IPhone() {
        this.modelo = "iPhone (1ª geração)";
        System.out.println("Bem-vindo ao " + this.modelo);
    }
    
    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    
    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}