package packageMotors;

public class Carro extends Veiculo {
    private int cavalos;
    private int quantidadeDePortas;

    public Carro(String marca, String nome, double valor, double tabelaFipe, int ano, int kms, int cavalos, int quantidadeDePortas) {
        super(marca, nome, valor, tabelaFipe, ano, kms);
        this.cavalos = cavalos;
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirFichaTecnica(){
        System.out.println("\n========== CARRO ==========");
        super.exibirFichaTecnica();
        System.out.println("Qtd. de Cavlos: "+this.cavalos+
                "\nQtd. de Portas: "+this.quantidadeDePortas);
    }
}
