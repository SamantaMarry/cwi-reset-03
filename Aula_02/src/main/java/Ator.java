public class Ator {

    private String nome;
    private  Integer idade;
    private  Integer quantidadeDeOscarsVencidos;
    private Genero genero;

    public Ator(String nome, Integer idade, Integer quantidadeDeOscarsVencidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeOscarsVencidos = quantidadeDeOscarsVencidos;
        this.genero = genero;
    }

    public void imprimircaracteristicas(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + genero.getDescricao());
    }

}
