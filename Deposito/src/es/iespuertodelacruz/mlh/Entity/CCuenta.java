package es.iespuertodelacruz.mlh.Entity;
/**
 * 
 * @author moises
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Contructor con todos los parametros
     * @param nombre Nombre de la cuenta
     * @param cuenta Numero de la cuenta
     * @param salario Salario de la cuenta
     * @param tipoInteres Tipo de interes de la cuenta
     */
    public CCuenta(String nombre, String cuenta, double salario, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = salario;
        this.tipoInterés = tipoInteres;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return double saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta, siempre que no sea un una cantidad negativa
     * @param cantidad Cantidad que se ingresará
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira el dinero de la cuenta si es posible
     * @param cantidad Cantidad que se retirará de la cuenta
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
