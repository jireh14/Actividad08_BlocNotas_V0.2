
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelBloc;
import views.ViewBloc;

public class ControllerBloc implements ActionListener{
    ModelBloc modelBloc;
    ViewBloc viewBloc;
    
    public ControllerBloc(ModelBloc modelBloc, ViewBloc viewBloc) {
        this.modelBloc = modelBloc;
        this.viewBloc = viewBloc;
        this.viewBloc.jMI_abrir.addActionListener(this);
        this.viewBloc.jMI_guardar.addActionListener(this);
        initComponets();
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewBloc.jMI_abrir){
            jMI_abrir_action_performed();
    }
        if(e.getSource() == viewBloc.jMI_guardar){
            jMI_guardar_action_performed();
        }
    }
    
    private void jMI_abrir_action_performed(){
        modelBloc.setTexto(String.valueOf(viewBloc.jTA_area.getText()));
        modelBloc.readFile();
        
    }
    private void jMI_guardar_action_performed(){
        modelBloc.setTexto(String.valueOf(viewBloc.jTA_area.getText()));
        modelBloc.writeFile();
        
    }
    public void initComponets(){
        viewBloc.setVisible(true);
        viewBloc.jTA_area.setText(String.valueOf(modelBloc.getTexto()));
        
    }
}
    
    

