/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {
    
public static void CalcM(int a,String n){
    int m = (a*12);
    JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);
}

public static int CalcD(int a,String n){
    int d = (a*365);
    JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
    return d;
}


public static void main(String[] args) {
String n;
String e;


int h;
int a;

n = JOptionPane.showInputDialog ("Escriba su nombre: ");
e = JOptionPane.showInputDialog ("Escriba su edad: ");
 
a = Integer.parseInt (e);
 


h = (d*24);
 
 
CalcM(a,n);
int aux=CalcD(a,n);



 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
