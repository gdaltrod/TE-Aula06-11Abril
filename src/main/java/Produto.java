public class Produto {

    private double valor;
    private String nome;

    public Produto (String nome, double valor)
    {
        this.valor = valor;
        this.nome = nome;
    }

    public String GetNome(){
        return nome;
    }

    public double GetValor(){
        return valor;
    }
}
