package cajeroatm;

import java.util.Scanner;
import javax.swing.JOptionPane;

// @author EnriqueCastillo
public class CajeroATM {
    

    public static void main(String[] args) {
        //int S;
        Consola c1 = new Consola(2000, "2141", "1818 1818 1818 1818");
        Consola c2 = new Consola(3500, "1818", "2141 2141 2141 2141");
       
        Consola Clientes[] = new Consola[2];
        Clientes[0] = c1;
        Clientes[1] = c2;
        Scanner leer = new Scanner(System.in);
        Interfaz interfaz=new Interfaz();
        //System.out.println("DIGITE PIN");
        //String pinin = leer.next();
        String pinin = JOptionPane.showInputDialog("Introduzca PIN");
        for (Consola Cliente1 : Clientes) {
            if (Cliente1.getNip().equals(pinin)) {
                //System.out.println("Aprobado");
                //System.out.println("\nSELECCIONE OPCIÓN");
                //System.out.print("1. Depositar. \n2. Mostrar informacion. \n3. Depositar a otras cuentas. \n4. Retirar.\n5. Consultar saldo.\n");

                String[] options = {"Depositar", "Mostrar informacion", "Depositar a otra cuenta", "Retirar", "Consultar saldo"};
                int S = JOptionPane.showOptionDialog(null, "Seleccione una accion", "Cajero", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                S++;
                ///S = leer.nextInt();
                switch (S) {
                    case 1:
                        //System.out.println("Depositar");
                        //ystem.out.println("INTRODUZCA EL DEPOSITO: ");
                        //double deposito= leer.nextDouble();
                        double deposito = Float.parseFloat(JOptionPane.showInputDialog("Introduzca deposito"));
                        Cliente1.deposit(deposito);
                        break;
                    case 2:
                        //System.out.println("Mostrar información");
                        Cliente1.showInfo();
                        break;
                    case 3:
                        //System.out.println("Depositar a otras cuentas");
                        String busq = JOptionPane.showInputDialog("Introduzca numero de cuenta beneficiaria");
                        for (Consola Cliente : Clientes) {
                            if (Cliente.getNcuenta().equals(busq)) {
                                c2 = Cliente;
                            }
                        }       double monto = Float.parseFloat(JOptionPane.showInputDialog("Monto a depositar"));
                        Cliente1.depositoOtraCuenta(monto, c2);
                        // Para verificar que el deposito(transferencia) si se hizo
                        c1.consultarSaldo();
                        c2.consultarSaldo();
                        break;
                    case 4:
                        //System.out.println("Retirar");
                        //System.out.println("INTRODUZCA EL MONTO A RETIRAR: ");
                        double retiro = Float.parseFloat(JOptionPane.showInputDialog("Introduzca monto a retirar"));
                        //double retiro = leer.nextDouble();
                        Cliente1.retirar(retiro);
                        break;
                    case 5:
                        //System.out.println("Consultar saldo");
                        Cliente1.consultarSaldo();
                        break;
                    default:
                        //System.out.println("Introduzca opcion valida");
                        break;
                }
            }
        }
    }

}
