
public class Registradora {

    public static void main(String[] args) {
        System.out.println("Primeiro Bug");
        primeiroBug();
        System.out.println("------------------------------------------");
        System.out.println("segundo Bug");
        segundoBug();
        System.out.println("------------------------------------------");
        System.out.println("terceiro Bug");
        terceiroBug();
        System.out.println("------------------------------------------");
        System.out.println("quarto Bug");
        quartoBug();
        System.out.println("------------------------------------------");
        System.out.println("quinto Bug");
        quintoBug();
        System.out.println("------------------------------------------");
        System.out.println("sexto Bug");
        sextoBug();


    }



    private static double registrarItem(String item, int quantidade) {
        boolean temEstoque = EstoquePadaria.verificaEstoque(item, quantidade);
        double precoItem = 0;
        if (!temEstoque) {

            if (QuantidadeMinimaItem.precisaReposicao(item)) {
                if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                    if (!DataProjeto.cozinhaEmFuncionamento()) {
                        System.out.println("Cozinha fechada! Item indisponível no momento!");

                    }
                    else {
                        ReposicaoCozinha.reporItem(item);
                        precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
                        return precoItem;
                    }


                }

                if ("leite".equals(item) || "cafe".equals(item)) {
                    ReposicaoFornecedor.reporItem(item);


                }
            }else {System.out.println("Não possuimos estoque do produto");}


        } else {
            precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
            return precoItem;
        }

       return precoItem;

    }

    private static void primeiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void segundoBug() {
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void quartoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

    private static void quintoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "pao";
        int quantidade = 10;
        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void sextoBug() {
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

}
