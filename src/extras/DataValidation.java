/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author galacxter infnity
 */
public class DataValidation {
    /**
     * Este método no permite que se ingresen otros caracteres que no sean letras a el JTextField indicado
     * @param a 
     */
    @SuppressWarnings("unchecked")
        public void Sletras(JTextField a){
        a.addKeyListener(new KeyAdapter (){
        public void keyTyped(KeyEvent e){
            char c=e.getKeyChar();
            if(Character.isDigit(c)){
                e.consume();
            }
            }    
        });
    }
}
