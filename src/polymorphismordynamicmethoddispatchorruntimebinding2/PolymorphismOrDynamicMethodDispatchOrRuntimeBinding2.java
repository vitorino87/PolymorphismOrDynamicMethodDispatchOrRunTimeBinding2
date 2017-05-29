/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismordynamicmethoddispatchorruntimebinding2;

/**
 *
 * @author tiago.lucas
 */
public class PolymorphismOrDynamicMethodDispatchOrRuntimeBinding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Can't instantiate Shape Class
        //Shape s = new Shape();
        //s.draw();
        
        Shape s;
        
        
        Rectangle r = new Rectangle();
        s=r;
        s.draw();
        
        Triangle t = new Triangle();
        s=t;
        s.draw();
        
    }
    
}
