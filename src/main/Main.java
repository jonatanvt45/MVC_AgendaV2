/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewAgenda;
import models.ModelAgenda;
import controllers.ControllerAgenda;
import extras.DataValidation;
/**
 *
 * @author galacxter infnity
 */
public class Main {

   
    public static void main(String[] args) {
        ViewAgenda viewCvs = new ViewAgenda();
        ModelAgenda modelCvs = new ModelAgenda();
        DataValidation dataValidation = new DataValidation();
        ControllerAgenda controllerCvs = new ControllerAgenda(viewCvs,modelCvs,dataValidation);
    }
    
}
