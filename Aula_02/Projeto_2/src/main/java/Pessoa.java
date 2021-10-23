import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    public LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void imprimircaracteristicas(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("Genero: " + genero.getDescricao());
    }

    public Integer calcularIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();

    }
}
