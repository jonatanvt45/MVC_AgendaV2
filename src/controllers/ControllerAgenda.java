/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewAgenda;
import models.ModelAgenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import extras.DataValidation;
/**
 *
 * @author galacxter infnity
 */
public class ControllerAgenda {
    ViewAgenda viewAgenda;
    ModelAgenda modelAgenda;
    DataValidation dataValidation;
    ActionListener ac = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jb_limpiar)
                    limpiar();
            else if(e.getSource() == viewAgenda.jb_guardar)
                guardar();
            else if(e.getSource() == viewAgenda.jb_primero)
                primero();
            else if (e.getSource() == viewAgenda.jb_anterior)
                anterior();
            else if (e.getSource() == viewAgenda.jb_siguiente)
                siguiente();
            else if (e.getSource() == viewAgenda.jb_ultimo)
                ultimo();
        }
    };
    public ControllerAgenda(ViewAgenda viewCvs, ModelAgenda modelCvs, DataValidation dataValidation) {
        this.viewAgenda = viewCvs;
        this.modelAgenda = modelCvs;
        this.viewAgenda.jb_guardar.addActionListener(ac);
        this.viewAgenda.jb_limpiar.addActionListener(ac);
        this.viewAgenda.jb_primero.addActionListener(ac);
        this.viewAgenda.jb_siguiente.addActionListener(ac);
        this.viewAgenda.jb_anterior.addActionListener(ac);
        this.viewAgenda.jb_ultimo.addActionListener(ac);
        dataValidation.Sletras(this.viewAgenda.jtf_nombre);
        initComponents();
    }
    public void obtener(){
        modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
        modelAgenda.setEmail(viewAgenda.jtf_email.getText());
    }
    
    public void mostrar(){
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
    }
    public void limpiar(){
        viewAgenda.jtf_nombre.setText("");
        viewAgenda.jtf_email.setText("");
    }
    
    public void guardar(){
        obtener();
        modelAgenda.writeFile();
    }
    
    public void primero(){
        modelAgenda.primero();
        mostrar();
        
    }
    
    public void ultimo(){
        modelAgenda.ultimo();
        mostrar();
    }
    
    public void siguiente(){
        modelAgenda.siguiente();
        mostrar();
    }
    public void anterior(){
        modelAgenda.anterior();
        mostrar();
    }
    
    private void initComponents(){
        viewAgenda.setVisible(true);
        modelAgenda.readFile();
        modelAgenda.primero();
        mostrar();
    }
    
}
