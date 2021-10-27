package Motores;

public class Mecanicos extends Motor {
    private int tamañoCmCubicos;
    private double tipoGasolina;

    public Mecanicos(int tamañoCmCubicos, double tipoGasolina, int numSerial, String Marca) {
        super(numSerial, Marca);
        this.tamañoCmCubicos = tamañoCmCubicos;
        this.tipoGasolina = tipoGasolina;
    }

    public int getTamañoCmCubicos() {
        return tamañoCmCubicos;
    }

    public double getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTamañoCmCubicos(int tamañoCmCubicos) {
        this.tamañoCmCubicos = tamañoCmCubicos;
    }

    public void setTipoGasolina(double tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    
    @Override
    public double getImporteMotor() {
        return this.tamañoCmCubicos + this.tipoGasolina;
    }
    @Override
    public String getDatosTipoMotor(){
        return "Tamaño en cm cubicos: " + this.tamañoCmCubicos + "\nTipo de Gasolina" +
                this.tipoGasolina + this.getImporteMotor();
    }

    
    
    
    
    
    
    
}