/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverridinginheritancemethodoverloading;

/**
 *
 * @author tiago.lucas
 */
public class MethodOverridingInheritanceMethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b = new B(1,2,3);
        b.show("This is k: "); //this calls show() in B
        b.show(); //this calls show() in A
    }
    
}
