package ej2;

public class Client {
    public static void main(String[] args) {
        InstalacionAgua a = new InstalacionAgua(250.50, "residencial", 500, new TransferenciaBancaria());
        InstalacionAlcantarillado al = new InstalacionAlcantarillado(450, "privado", 640, new Efectivo());
        InstalacionElectrica e = new InstalacionElectrica(580.90, "publico", 390, new TigoMoney());

        a.instalar();
        al.instalar();
        e.instalar();

        a.setFormaPago(new AplicacionEmpresa());
        a.instalar();
    }
}
