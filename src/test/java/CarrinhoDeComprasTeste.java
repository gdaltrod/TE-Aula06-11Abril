import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarrinhoDeComprasTeste {

    @Test
    public void DeveCalcularTotalComDoisProdutos(){
        // cenário
        Produto produto1 = new Produto("queijo",10);
        Produto produto2 = new Produto("presunto",30);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarProduto(produto1);
        carrinho.AdicionarProduto(produto2);

        // ação
        double resultado = carrinho.CalcularValorTotalASerPago();

        // verificação
        Assertions.assertEquals(40,resultado);

    }

    @Test
    public void DeveCalcularValorTotalASerPagoQuandoOCarrinhoEstaVazio(){
        // cenário
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // ação
        double resultado = carrinho.CalcularValorTotalASerPago();

        // validação
        Assertions.assertEquals(0,resultado);
    }

    @Test
    public void DeveCalcularValorTotalQuandoUmItemForCancelado(){

        // cenário
        Produto produto1 = new Produto("queijo",10);
        Produto produto2 = new Produto("presunto",30);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarProduto(produto1);
        carrinho.AdicionarProduto(produto2);

        // ação
        double resultado = carrinho.CalcularValorTotalASerPago();

        //verificação
        Assertions.assertEquals(40,resultado);

        // ação
        carrinho.RemoverProduto(produto2);
        double resultadoAposRemocao = carrinho.CalcularValorTotalASerPago();

        //verificação
        Assertions.assertEquals(10,resultadoAposRemocao);
    }
}
