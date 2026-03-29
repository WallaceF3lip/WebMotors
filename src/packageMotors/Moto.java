package packageMotors;

public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoDePartida;

    public Moto(String marca, String nome, double valor, double tabelaFipe, int ano, int kms, int cilindradas, String tipoDePartida) {
        super(marca, nome, valor, tabelaFipe, ano, kms);
        this.cilindradas = cilindradas;
        this.tipoDePartida = tipoDePartida;
    }

    public String getTipoDePartida() {
        return tipoDePartida;
    }

    public void setTipoDePartida(String tipoDePartida) {
        this.tipoDePartida = tipoDePartida;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String calcularIPVA(){
        String valorFormat = String.format("%.2f",this.getTabelaFipe() * 0.01);
        return valorFormat; // % do IPVA da Moto
    }

    @Override
    public void exibirFichaTecnica(){
        System.out.println("\n========== MOTO ==========");
        super.exibirFichaTecnica();
        System.out.println("Cilindradas: "+this.cilindradas+
                "\nTipo de Partida: "+this.tipoDePartida);
    }


}
