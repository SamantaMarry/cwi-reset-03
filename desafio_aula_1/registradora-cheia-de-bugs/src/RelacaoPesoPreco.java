public class RelacaoPesoPreco {

    public static double retornaPrecoProduto(String item, int qtd) {
        double precoTotal = 0;

        if ("pao".equals(item)) {
            precoTotal = 0.765 * qtd;
        }

        if ("torta".equals(item)) {
            precoTotal = 6.00 * qtd;
        }

        if ("leite".equals(item)) {
            precoTotal = 4.48 * qtd;
        }

        if ("cafe".equals(item)) {
            precoTotal = 9.56 * qtd;
        }

        if ("sanduiche".equals(item)) {
            precoTotal = 4.5 * qtd;
        }


        return precoTotal;
    }

}

