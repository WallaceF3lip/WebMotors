package packageMotors;

public class Veiculo {
    private String marca;
    private String nome;
    private double valor;
    private double tabelaFipe;
    private int ano;
    private int kms;

    public Veiculo(String marca, String nome, double valor, double tabelaFipe, int ano, int kms) {
        this.marca = marca;
        this.nome = nome;
        this.valor = valor;
        this.tabelaFipe = tabelaFipe;
        this.ano = ano;
        this.kms = kms;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public double getTabelaFipe() {
        return tabelaFipe;
    }

    public void setTabelaFipe(double tabelaFipe) {
        this.tabelaFipe = tabelaFipe;
    }

    public String calcularIPVA(){
        String valorFormat = String.format("%.2f",this.tabelaFipe * 0.04);
        return valorFormat; // % do IPVA do Carro
    }

    public void exibirFichaTecnica(){
        System.out.println("Marca: "+this.marca+
                "\nNome: "+this.nome+
                "\nAno: "+this.ano+
                "\nKm's: "+this.kms+
                "\nValor: R$"+this.valor+
                "\nTabela Fipe: R$"+this.tabelaFipe+
                "\nIPVA: ~R$"+calcularIPVA());
    }
}
