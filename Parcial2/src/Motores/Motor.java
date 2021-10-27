package Motores;

public abstract class Motor {
    private int numSerial;
    private String Marca;
    
    public abstract double getImporteMotor();
    public abstract String getDatosTipoMotor();

    public Motor(int numSerial, String Marca) {
        this.numSerial = numSerial;
        this.Marca = Marca;
    }

    
    
    public String getDatosMotor(){
        return "num serial: " + this.numSerial + "\nMarca" + this.Marca + "\n" + this.getDatosMotor();
    }

    public int getNumSerial() {
        return numSerial;
    }

    public String getMarca() {
        return Marca;
    }
    public Motor() {
    }

    public void setNumSerial(int numSerial) {
        this.numSerial = numSerial;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
     
}
