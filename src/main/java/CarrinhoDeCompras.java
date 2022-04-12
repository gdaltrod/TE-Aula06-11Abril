import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<Produto>();
    }

    public void AdicionarProduto(Produto produtoASerAdicionado){
        produtos.add(produtoASerAdicionado);
    }

    public void RemoverProduto(Produto produtoASerRemovido){
        produtos.remove(produtoASerRemovido);
    }

    public double CalcularValorTotalASerPago(){
        double total = 0;
        for (Produto produto: produtos) {
            double valor = produto.GetValor();
            total = total + valor;
        }
        return  total;
    }
}
