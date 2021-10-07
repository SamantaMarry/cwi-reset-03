public class EstoquePadaria {


    public static int estoquePao = 60;
    public static int estoqueFatiasTorta = 64;
    public static int estoqueSanduiche = 20;
    public static int estoqueLeite = 50;
    public static int estoqueCafe = 50;


    public static boolean verificaEstoque(String item, int quantidade){

        boolean temEstoque = true;

        if ("pao".equals(item) && quantidade > estoquePao) {
            temEstoque = false;
        }


        if ("torta".equals(item) && quantidade > estoqueFatiasTorta) {
            temEstoque = false;
        }

        if ("sanduiche".equals(item) && quantidade > estoqueSanduiche) {
            temEstoque = false;
        }

        if ("cafe".equals(item) && quantidade > estoqueCafe) {
            temEstoque = false;
        }

        if ("leite".equals(item) && quantidade > estoqueLeite) {
            temEstoque = false;
        }
        if (temEstoque){
                baixarEstoque(item, quantidade);
        }


        return temEstoque;

    }

    public static void baixarEstoque(String item, int quantidade){

        if ("pao".equals(item)) {
            estoquePao -= quantidade;
        }

        if ("torta".equals(item)) {
            estoqueFatiasTorta -= quantidade;
        }

        if ("sanduiche".equals(item)) {
            estoqueSanduiche -= quantidade;
        }

        if ("cafe".equals(item)) {
            estoqueCafe -= quantidade;
        }

        if ("leite".equals(item)) {
            estoqueLeite -= quantidade;
        }

    }

    public static void reporEstoque(String item, int quantidade){
        if ("pao".equals(item)) {
            estoquePao += quantidade;

        }

        if ("torta".equals(item)) {
            estoqueFatiasTorta += quantidade;
        }

        if ("sanduiche".equals(item)) {
            estoqueSanduiche += quantidade;

        }

        if ("cafe".equals(item)) {
            estoqueCafe += quantidade;
        }

        if ("leite".equals(item)) {
            estoqueLeite += quantidade;
        }

    }


}
