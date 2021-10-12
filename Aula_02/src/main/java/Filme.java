public class Filme {

    private String nome;
    private String descrição;
    private Integer duraçao;
    private Integer anoDeLançamento;
    private Double notaDeAvaliação;
    private Diretor diretor;

    public Filme(String nome, String descrição, Integer duraçao, Integer anoDeLançamento, Double notaDeAvaliaçãoDoFilme, Diretor diretor) throws AvaliacãoForaDoPadraoException {
        if(anoDeLançamento > 5 || anoDeLançamento < 1){
            throw new AvaliacãoForaDoPadraoException();
        }
        this.nome = nome;
        this.descrição = descrição;
        this.duraçao = duraçao;
        this.anoDeLançamento = anoDeLançamento;
        this.notaDeAvaliação = notaDeAvaliaçãoDoFilme;
        this.diretor = diretor;
    }

    public void reproduzirOFilme(){
        System.out.println("O nome do filme: " + this.nome);
        System.out.println("Descrição:  " + this.descrição);
        System.out.println("Duração: " + this.duraçao);
        System.out.println("Nome do Diretor: " + diretor.getNome());
    }


}
