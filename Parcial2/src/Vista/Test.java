package Test;
import Motor.*;
import Interfaces.*;
public class Test {

public class RegistroP {
    public static void main(String[] args) {
        Motor catalogo = new Motor();
            
            Motor motorD=new Electrico(127544, "Yoriel", 26);
            catalogo.alquilarMotor(motorD);
            
            Motor motorE = mew Mecanico(156548, "Fernando", 48, "Gasolina");
            catalogo.alquilar(motorE);
            
            Motor motorF = new Hibrido(5488476, "Saul", 7, 2.5, "Gas");
            catalogo.aqluilarMotor(motorF);
            
            System.out.println("** CATALOGO DE MOTORES **");
            for(Motor m : catalogo.getmotor()){
                System.out.println(m.getinfoMotor());
            }
           
        }
    }
}
