public enum Genero {

    MASCULINO ("Masculino"),
    FEMININO("Feminino"),
    NAO_BINARIO("Não Binário");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    Genero(String descricao) {
        this.descricao = descricao;



    }
}
