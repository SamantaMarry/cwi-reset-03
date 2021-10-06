import java.util.Random;

public class ReposicaoFornecedor {

    static void reporItem(String item) {
        Random random = new Random();

        if ("leite".equals(item)) {
            EstoquePadaria.estoqueLeite = random.nextInt(40) + 10;
        }

        if ("cafe".equals(item)) {
            EstoquePadaria.estoqueCafe = random.nextInt(40) + 10;
        }
    }
}
