package Vista;
import Modelo.CuentaBancaria;    
import java.util.Scanner;

/**
 *
 * Crear clase CuentaBancaria
 * Propiedades
 *  titular
 *  saldo
 * Funciones
 *  depositar
 *  retirar
 *  mostrar datos
 * 
 */
public class Cuenta {
    public static void main(String[] args) {

        try (Scanner textoScanner=new Scanner(System.in)){
            System.out.println("Ingrese su nombre ");
            String titular = textoScanner.next();
            System.out.println("Ingrese su saldo bancario");
            double saldo = textoScanner.nextDouble();

            CuentaBancaria banco =new CuentaBancaria( titular , saldo);

            int eleccion;

            do {
                System.out.println("Elija una opcion: ");
                System.out.println("1: Depositar ");
                System.out.println("2: Retirar ");
                System.out.println("3: Mirar saldo ");        
                System.out.println("4: Salir ");
                eleccion = textoScanner.nextInt();
                if(eleccion==1){
                    System.out.println("Ingrese valor a depositar ");
                    double depositar = textoScanner.nextInt();
                    banco.Depositar(depositar);
                    System.out.println("Datos actualizados");
                    banco.MostrarDatos();
                }else{
                    if(eleccion==2){
                        System.out.println("Ingrese valor a retirar ");
                        double retirar = textoScanner.nextInt();
                        banco.Retirar(retirar);
                        System.out.println("Datos actualizados");
                        banco.MostrarDatos();
                    }else{
                        if(eleccion==3){
                            banco.MostrarDatos();
                        }else{
                            System.out.println("Numero ingresado no se enceuntra dentro de las opciones");
                        }
                    } 
                } 

            } while (eleccion!=4);
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e.getMessage());
        }

        

        
    }

}
