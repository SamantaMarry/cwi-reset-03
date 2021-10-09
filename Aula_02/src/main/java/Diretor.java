class Diretor extends Pessoa {
    private Integer quantidadeDeFilmes;


    public Diretor(String nome, Integer idade, Integer quantidadeDeFilmes, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeDeFilmes = quantidadeDeFilmes;

    }



}