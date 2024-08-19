public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String usuario;
    private String numeroSerie;
    private String numeroTelefone;


    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    public String getNumeroTelefone(){
        return numeroTelefone;
    }
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando no iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("musica " + musica + "selecionada no iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionada nova aba via iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
