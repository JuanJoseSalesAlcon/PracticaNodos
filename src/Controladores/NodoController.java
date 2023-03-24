/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class NodoController implements ActionListener {
//LEVANTAR EL FORMULARIO PRINCIPAL
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public NodoController(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        //LEVANTAR VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregarNodo)
        {
            //ABRIR LA VISTA NODOS
                //PONER A LA ESCUCHA LOS BOTONES DELA VISTA NODOS
            this.VistaNodos.btnApilar.addActionListener(this);
            //LEVANTAR EL FORMULARIO VISTA NODOS
            this.VistaNodos.setLocationRelativeTo(null);
            this.VistaNodos.setVisible(true);
        }
        if(e.getSource()==this.VistaNodos.btnApilar)
        {
            
            this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
           
        }
    }
    
}
