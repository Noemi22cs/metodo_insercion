package ordeniamiento_interno;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Noemi
 */
public class Insercion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner boid = new Scanner(System.in);       
         
        int arreglo[],elementos,pos,aux;         
        
        elementos= Integer.parseInt(JOptionPane.showInputDialog("introduzca una cantidad de elementos para el arreglo"));
        arreglo= new int [elementos];
        System.out.println("digite el arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println((i+1)+ " introduzca un numero ");
            arreglo[i]= boid.nextInt();  
        }
         // inserción
         for (int i = 0; i <elementos; i++) {
            pos = i;
            aux=arreglo[i];
            
            while(pos>0 && (arreglo[pos-1]>aux)){
            arreglo[pos]= arreglo[pos-1];
            pos--;
            }            
            arreglo[pos]=aux;
        }         
         System.out.println("ordenado ascendentes ");
         for (int i = 0; i < elementos; i++) {
             System.out.print(arreglo[i]+ " -> ");            
        }
         System.out.println("");       
         System.out.println("orden dscendente ");
         for (int i = (elementos-1); i >0; i--) {
             System.out.print(arreglo[i]+ "<-");                         
        }
         System.out.println("");
    }    
}
