import java.time.LocalDate;

class Diretor extends Pessoa {
    private Integer quantidadeDeFilmes;


    public Diretor(String nome, LocalDate dataNascimento, Integer quantidadeDeFilmes, Genero genero) {
        super(nome, dataNascimento, genero);
        this.quantidadeDeFilmes = quantidadeDeFilmes;

    }



}