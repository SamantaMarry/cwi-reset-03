public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("pao".equals(item)) {
            return EstoquePadaria.estoquePao < 10;
        }

        if ("torta".equals(item)) {
            return EstoquePadaria.estoqueFatiasTorta < 10;
        }

        if ("sanduiche".equals(item)) {
            return EstoquePadaria.estoqueSanduiche <= 1;
        }

        if ("cafe".equals(item)) {
            return EstoquePadaria.estoqueCafe < 12;
        }

        if ("leite".equals(item)) {
            return EstoquePadaria.estoqueLeite < 12;
        }

        return false;
    }
}
