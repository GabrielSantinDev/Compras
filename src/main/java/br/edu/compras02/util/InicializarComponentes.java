/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.compras02.util;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class InicializarComponentes {
    public void configuraTextField(JTextField campo, String texto){
        campo.setText(texto);
        campo.setForeground(Color.gray);
        
        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if(campo.getText().equals(texto)){
                    campo.setText("");
                    campo.setForeground(Color.black);
                }   
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(campo.getText().equals("")){
                    campo.setText(texto);
                    campo.setForeground(Color.gray);
                }
            }
            
            
            
        
        });
    }
}
