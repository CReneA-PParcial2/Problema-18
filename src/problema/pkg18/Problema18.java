/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg18;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULO DEL MINIMO COMUN MULTIPLO DE TRES NUMEROS
        int numero1, numero2, numero3, maximo, minimo;
        numero1 = solicitarNumero("primer numero:");
        numero2 = solicitarNumero("segundo numero:");
        numero3 = solicitarNumero("tercer numero:");
        maximo = calcularMaximo(numero1, numero2, numero3);
        minimo = calcularMinimo(numero1, numero2, numero3, maximo);
        mostrarResultado(minimo);
    
}
    
    //ESCANEO DE CADA UNO DE LOS TRES NUMEROS INGRESADOS POR EL USUARIO
    public static int solicitarNumero(String linea){
      int numero;
        System.out.println("Ingresa el " + linea);
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    /*CALCULO E IMPRESION DEL MINIMO COMUN MULTIPLO DE LOS
    TRES NUMEROS INGRESADOS POR EL USUARIO
    */
    public static int calcularMaximo(int numero1, int numero2, int numero3){
        int maximo = 0;
        if(numero1>numero2 && numero1>numero3){
            maximo = numero1;
    }else{
            if(numero2>numero1 && numero2>numero3){
                maximo = numero2;
            }else{
                if (numero3>numero1 && numero3>numero2){
                    maximo = numero3;
                }
            }
        }
        return maximo;
    }
    
    public static int calcularMinimo(int numero1, int numero2, int numero3, int maximo){
        int minimo = 1, i;
        for (i=2; i<=maximo; i++){
            if(numero1%i==0 || numero2%i==0 || numero3%i==0)
                minimo = minimo*i;
            if(numero1%i==0){
                numero1 = numero1/i;
            }if(numero2%i==0){
                numero2 = numero2/i;
            }if (numero3%i==0){
                numero3 = numero3/i;
            }
        }
        return minimo;
    }
    public static void mostrarResultado(int minimo){
        System.out.println("El minimo comun multiplo de los tres numeros ingresados es: " + minimo);
    }
}