package packageMotors;

public class Caminhao extends Veiculo {
    private int quantidadeDeRodas;
    private String tipoDeCabine;

    public Caminhao(String marca, String nome, double valor, double tabelaFipe, int ano, int kms, int quantidadeDeRodas, String tipoDeCabine) {
        super(marca, nome, valor, tabelaFipe, ano, kms);
        this.tipoDeCabine = tipoDeCabine;
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public String getTipoDeCabine() {
        return tipoDeCabine;
    }

    public void setTipoDeCabine(String tipoDeCabine) {
        this.tipoDeCabine = tipoDeCabine;
    }

    @Override
    public String calcularIPVA(){
        String valorFormat = String.format("%.2f",this.getTabelaFipe() * 0.015);
        return valorFormat; // % do IPVA do Caminhão
    }

    @Override
    public void exibirFichaTecnica(){
        System.out.println("\n========== CAMINHÃO ==========");
        super.exibirFichaTecnica();
        System.out.println("Qtd. de Rodas: "+this.quantidadeDeRodas+
                "\nTipo de Cabine: "+this.tipoDeCabine);
    }
}
