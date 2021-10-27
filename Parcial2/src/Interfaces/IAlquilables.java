package Vista;

import Motores.*;


public class IAlquilables implements IReservable {
    private Motor[] lista;
    private int numMotor;
    private int tipoGasolina;

    public IAlquilable(Motor[] lista, int numMotor, int tipoGasolina) {
        this.lista = lista;
        this.numMotor = numMotor;
        this.tipoGasolina = tipoGasolina;
    }

    public Motor[] getLista() {
        return lista;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getTipoGasolina() {
        return tipoGasolina;
    }

    public void setLista(Motor[] lista) {
        this.lista = lista;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }
    
    @Override
    public boolean reservarMotor(Motor m){
        this.lista[this.numMotor] = m;
        this.tipoGasolina++;
        return true;
        
    }

    @Override
    public boolean alquilarMotor(Motor m) {
        return false;
      }

    @Override
    public int getTotalMotorReservado() {
        return 0;
       }

    @Override
    public int getTotalMotorAlquilado() {

    }
    
    
    
    
}
