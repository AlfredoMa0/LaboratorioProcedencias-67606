/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprocedencias.pkg67606;

import java.util.Scanner;
public class Practica4{
public static void main(String[] args){
 //PRIMERA PARTE : PRECEDENCIA DE OPERACIONES 
double x = 9 + 10 / 2 * 6 % 2;
    System.out.println("EL VALOR DE X ES:" + x);
    x = (9 + 10 / 2) * (6 % 2);
    System.out.println("EL NUEVO VALOR DE X ES:" + x);
//SEGUNDA PARTE - EJERCICIOS
Scanner leer = new Scanner(System.in);
x = 9 / 2 *2;
    System.out.println("x = 9 / 2 * 2");
    System.out.println("¿CUAL ES EL VALOR DE X? :");
    leer.nextLine();
    System.out.println("EL VALOR DE X ES: = " + x);
    
    boolean b= (6 * 6 >(5 + 10)+ 20);
    System.out.println("b = (6 * 6 >(5 + 10)+ 20) ");
    System.out.println("¿CUAL ES EL VALOR DE B ? :");
    leer.nextLine();
    System.out.println("EL VALOR DE B ES: " + b);
    
    int[] arreglo ={4 , 4};
    int i=1;
    arreglo[i]= i =0;
    System.out.println("arreglo ={4 , 4}");
    System.out.println("arreglo[i]= i =0" );
    System.out.println("¿QUE POSICION DEL ARREGLO SE MODIFICO ?" + 
            "¿Y CON QUE VALOR ?");
    leer.nextLine();
    System.out.println("EL ARREGLO QUEDO ASI : {" + arreglo[0] + " , "
    + arreglo[1] + "}");
    
    b = !(2* (3+3)/8-2 > 0) && (6+(2*2)>(3*3));
    System.out.println("b = !(2* (3+3)/8-2 > 0)" + "&& (6+(2*2)>(3*3))");
    System.out.println("¿CUAL ES EL VALOR DE B? : ");
    leer.nextLine();
    System.out.println("EL VALOR DE B ES : " + b);
    
    
    
    
    
    }
    
}
