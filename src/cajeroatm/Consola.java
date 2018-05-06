package cajeroatm;
// @author EnriqueCastillo

import javax.swing.JOptionPane;

public class Consola {

    private double saldo;
    private String nip;
    private String ncuenta;

    public Consola(double saldo, String nip, String ncuenta) {
        this.saldo = saldo;
        this.nip = nip;
        this.ncuenta = ncuenta;
    }

    public Consola() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void deposit(double deposito) {
        this.saldo = this.saldo + deposito;
        //System.out.println("Se han depósitado $"+deposito);
        //System.out.println("Su nuevo saldo es: "+this.saldo);
        JOptionPane.showMessageDialog(null, "Se han depositado: " + deposito + "\nSu nuevo saldo es: " + this.saldo);
    }

    public void showInfo() {
//        System.out.println("Su numero de cuenta: "+this.ncuenta);
//        System.out.println("Su saldo disponible: "+this.saldo);
        JOptionPane.showMessageDialog(null, "Su numero de cuenta: " + this.ncuenta + "\nSu saldo disponible: " + this.saldo);
    }

    public void depositoOtraCuenta(double depositoa, Consola Cliente2) {
        if (this.saldo >= depositoa) {
            this.saldo = this.saldo - depositoa;
            Cliente2.saldo = Cliente2.saldo + depositoa;
        } else {
            System.out.println("Fondos insuficientes");
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
    }

    public void retirar(double retirar) {
        if (this.saldo >= retirar) {
            this.saldo = this.saldo - retirar;
        } else {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        }
        //else System.out.println("Fondos insuficientes");

    }

    public void consultarSaldo() {
        //System.out.println("Su saldo actual es de $"+this.saldo);
        JOptionPane.showMessageDialog(null, "Su saldo es: " + this.saldo);
    }

}
