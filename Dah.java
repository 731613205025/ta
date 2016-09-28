/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dah;

/**
 *
 * @author Student
 */
public class Dah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             int i,j,k=0;
        for(j=0;j<50;j++){
        for(i=0;i<50;i++){
            if(i+j==25 && i-j==13){
                System.out.println(i+" "+j);
               k=i*j; 
            }
        }
    }
        System.out.println("product is:"+k);
}
}
    

