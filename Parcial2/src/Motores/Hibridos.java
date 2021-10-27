package Motor;

public class Hibridos extends Motor {

    private int numhoras;
    private int numKilovatios;
    private int tamañoCmCubicos;
    private double tipoGasolina;

    public Hibridos(int numKilovatios, int tamañoCmCubicos, double tipoGasolina, int numSerial, String Marca) {
        super(numSerial, Marca);
        this.numKilovatios = numKilovatios;
        this.tamañoCmCubicos = tamañoCmCubicos;
        this.tipoGasolina = tipoGasolina;
    }

    public int getNumKilovatios() {
        return numKilovatios;
    }

    public int getTamañoCmCubicos() {
        return tamañoCmCubicos;
    }

    public double getTipoGasolina() {
        return tipoGasolina;
    }

    public void setNumKilovatios(int numKilovatios) {
        this.numKilovatios = numKilovatios;
    }

    public void setTamañoCmCubicos(int tamañoCmCubicos) {
        this.tamañoCmCubicos = tamañoCmCubicos;
    }

    public void setTipoGasolina(double tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    @Override
    public double getImporteMotor() {
        return this.numKilovatios * 1500;
    }

    @Override
    public String getDatosTipoMotor() {
        return "Numero de horas: " + this.numhoras + "\nNumero de Klovatios: " + this.numKilovatios
                + "\ntamaño en cm cubicos" + this.tamañoCmCubicos + "Tipo de gasolina: " + this.tipoGasolina;
    }
}