import java.time.LocalDate;

public class Ator extends Pessoa {

    private  Integer quantidadeDeOscarsVencidos;


    public Ator(String nome, int dataNascimento, Integer quantidadeDeOscarsVencidos, Genero genero) {
        super(nome, dataNascimento, genero);
        this.quantidadeDeOscarsVencidos = quantidadeDeOscarsVencidos;

    }


}
