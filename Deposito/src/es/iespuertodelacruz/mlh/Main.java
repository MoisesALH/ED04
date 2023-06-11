package es.iespuertodelacruz.mlh;

import es.iespuertodelacruz.mlh.Entity.CCuenta;

public class Main {
    
    public static String sacarDinero(CCuenta cuenta, double saldo) throws Exception{
        String respuesta = null;        
        try {
            cuenta.retirar(2300);
            respuesta = saldo + "€ se han retirado de la cuenta: " + cuenta.getCuenta();
        } catch (Exception e) {
            e.printStackTrace();            
        }        
        return respuesta;
    }
    
    public static String ingresarDinero(CCuenta cuenta, double cantidad) throws Exception{
        String respuesta = null;
        try {
            cuenta.ingresar(695);
            respuesta = cantidad + "€ se han ingresados en la cuenta: " + cuenta.getCuenta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    public static void main(String[] args) {
        CCuenta cuenta1;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);        
        System.out.println("El saldo actual es" + cuenta1.estado() );

        try {
            System.out.println(sacarDinero(cuenta1, 2300));
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println(ingresarDinero(cuenta1, 695));
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
