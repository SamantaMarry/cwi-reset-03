public class EstoquePadaria {

    public static int estoquePao;
    public static int estoqueFatiasTorta;
    public static int estoqueSanduiche;
    public static int estoqueLeite;
    public static int estoqueCafe;

    public static int verificaEstoque (String item, int quantidade){
        if ("pao".equals(item)) {
            return estoquePao;
        }

        if ("torta".equals(item)) {
            return estoqueFatiasTorta;
        }

        if ("sanduiche".equals(item)) {
            return estoqueSanduiche;
        }

        if ("cafe".equals(item)) {
            return estoqueCafe;
        }

        if ("leite".equals(item)) {
            return estoqueLeite;
        }else {
            System.out.println("Item indisponível");
        }

        return 0;
    }

    public static int baixarEstoque(String item, int quantidade){
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
        }else {
            System.out.println("Item indisponível");
        }


        return quantidade;
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
        }else {
            System.out.println("Item indisponível");
        }

    }


}
