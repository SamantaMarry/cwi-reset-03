public class Aplicação {

    public static void main(String[] args) {
        Diretor diretor = new Diretor("Peter Jackson", 58, 17, Genero.MASCULINO);
        diretor.imprimircaracteristicas();




        Filme oSenhordosAnéis = new Filme(" O Senhor dos Anéis ", "Em uma terra fantástica e única, um hobbit recebe de presente de seu tio um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso, o hobbit Frodo tem um caminho árduo pela frente, onde encontra perigo, medo e seres bizarros. Ao seu lado para o cumprimento desta jornada, ele aos poucos pode contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando nove seres que formam a Sociedade do Anel.",
                120, 2001, 5.0, diretor);
        Filme oHobbit = new Filme("O Hobbit", "Como a maioria dos hobbits, Bilbo Bolseiro leva uma vida tranquila até o dia em que recebe uma missão do mago Gandalf. Acompanhado por um grupo de anões, ele parte numa jornada até a Montanha Solitária para libertar o Reino de Erebor do dragão Smaug.",
                120, 2012, 4.0, diretor);


        oSenhordosAnéis.reproduzirOFilme();
        oHobbit.reproduzirOFilme();

    }
}
