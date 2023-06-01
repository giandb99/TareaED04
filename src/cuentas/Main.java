package cuentas;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(525.6f);
    }
    
    /**
     * Realiza la operativa de una cuenta bancaria.
     *
     * @param cantidad la cantidad con la que se realizará la operativa
     */
    public static void operativa_cuenta(float cantidad){
        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar!");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar!");
        }
    }
}