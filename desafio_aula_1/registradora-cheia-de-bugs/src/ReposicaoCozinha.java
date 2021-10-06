public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("pao".equals(item)) {
            EstoquePadaria.estoquePao = 60;
        }
        if ("torta".equals(item)) {
            EstoquePadaria.estoqueFatiasTorta = 64;
        }
        if ("sanduiche".equals(item)) {
            EstoquePadaria.estoqueSanduiche = 20;
        }
    }
}
