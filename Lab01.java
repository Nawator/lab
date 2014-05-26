/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.lang.Math.*;

public class Lab01 {

   double a = 3.2;  
   double b = 17.5;
   double x = -4.8; 
   
   double calcY(double a,double b,double x){
    
        return b*Math.tan(x)*Math.tan(x)-(a/((Math.sin(x)*Math.sin(x))/a));
     }   
    
   double calcD(double a,double b,double x){
    return a*Math.exp(-Math.sqrt(a))*Math.cos((b*x)/a);
   }

   public void run(){
   System.out.printf("Y: %.2f\n",calcY(a,b,x));
   System.out.printf("D: %.2f\n",calcD(a,b,x));
   }
   
   public static void main(String[] args) {
     Lab01 prog= new Lab01();
     prog.run();
    }
}
