package Motores;

public class Electricos extends Motor {

    private int numhoras;
    private int numKilovatios;

    public Electricos() {
    }

    public Electricos(int numKilovatios, int numSerial, String Marca, int numhoras) {
        super(numSerial, Marca);
        this.numKilovatios = numKilovatios;
        this.numhoras = numhoras;
    }

    @Override
    public double getImporteMotor() {

        return (this.numKilovatios * 1500);

    }

    public int getNumKilovatios() {
        return numKilovatios;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumKilovatios(int numKilovatios) {
        this.numKilovatios = numKilovatios;
    }

    @Override
    public String getDatosTipoMotor() {
        return "numero Kilobatios: " + this.numKilovatios + "\n" + this.getImporteMotor();

    }
}
