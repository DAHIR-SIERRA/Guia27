/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion;


/**
 *
 * @author User
 */
public class ObtenerSumaMultiplos {
    
    public void SumaMultiplosDeCinco (){
  
        int RResultado = SumaMultiplosTres(3,1000);
        int Respuesta = SumarmultiplosCuatro(4, 1000);
        int resultado = sumaMultiplos(5, 1000);
        
        
        System.out.println("La suma de los multiplos de 3 entre 0 y 1000 es: " + RResultado);
         System.out.println("La suma de los multiplos de 4 entre 0 y 1000 es: " + Respuesta);
        System.out.println("La suma de los multiplos de 5 entre 0 y 1000 es: " + resultado);
        
       
    }

    public static int sumaMultiplos(int divisor, int limite) {
        int suma = 0;
        for (int i = 0; i < limite; i++) {
            if (i % divisor == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static int SumaMultiplosTres(int divisor,int limite){
        int suma = 0;
        for (int i = 0; i < limite; i++) {
            if (i % divisor == 0){
                suma += i;
            }
            
        }
        return suma;
        
    }
    public static int SumarmultiplosCuatro (int divisor ,int limite){
        int sumar = 0;
        for (int i = 0; i < limite; i++) {
            if (i % divisor == 0){
               sumar += i ;
            }
           
        }
        return sumar;
        
       
    }
}


        
        
    
    
