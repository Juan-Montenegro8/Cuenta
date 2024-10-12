package Modelo;

/**
 *
 */
public class CuentaBancaria {
    
    //Propiedades
    public String titular;

    public Double saldo;

    public CuentaBancaria (String titular, Double saldo){
        this.saldo = saldo;
        this.titular = titular;
    }

    //Funciones
    public void Depositar(Double cantidad){
        this.saldo += cantidad;
    }

    public void Retirar (Double Cantidad){
        if (this.saldo >= Cantidad) 
            this.saldo -= Cantidad;
        else System.out.println("no se puede retirar");
    }
    
    public void MostrarDatos (){
        System.out.println("Titular: " + this.titular +"\n Saldo: "+ this.saldo);
    }
}
