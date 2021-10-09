class Diretor {

    private String nome;
    private Integer idade;
    private Integer quantidadeDeFilmes;
    private Genero genero;

    public Diretor(String nome, Integer idade, Integer quantidadeDeFilmes, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeFilmes = quantidadeDeFilmes;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }


    public void imprimircaracteristicas(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Genero: " + genero.getDescricao());
    }
}