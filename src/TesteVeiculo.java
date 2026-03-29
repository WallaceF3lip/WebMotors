import packageMotors.Moto;
import packageMotors.Carro;
import packageMotors.Caminhao;

public class TesteVeiculo {
    public static void main(String[] args){
        Moto m = new Moto("Yamaha",
                "Yzf R3 Abs",
                18000.00,
                19685.00,
                2016,
                23750,
                300,
                "Elétrica");

        m.exibirFichaTecnica();

        Carro car = new Carro("Chevrolet",
                "Celta",
                19500.00,
                23298.00,
                2012,
                197095,
                78,
                2);

        car.exibirFichaTecnica();

        Caminhao cam = new Caminhao("Volvo",
                "Fh 540 - 8x4",
                900000,
                1000000,
                2026,
                0,
                12,
                "Globetrotter XL");

        cam.exibirFichaTecnica();
    }
}
