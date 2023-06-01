package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

     /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nom   el nombre del titular de la cuenta
     * @param cue   el número de cuenta
     * @param sal   el saldo inicial de la cuenta
     * @param tipo  el tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     /**
     * Obtiene el número de cuenta.
     *
     * @return el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta el número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldo el saldo actual de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

     /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés el tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

     /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad la cantidad a ingresar
     * @throws Exception si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad la cantidad a retirar
     * @throws Exception si se intenta retirar una cantidad negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo -= cantidad;
    }
}