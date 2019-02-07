/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class OlaMundo {
 public static void main(String args[]) {
     

        String nome;
        double n1, n2, trabalho, media;
        int peso1, peso2, peso3, totalpeso;
        try {

            nome = JOptionPane.showInputDialog("informe seu nome");

            n1 = Double.parseDouble(JOptionPane.showInputDialog("digite primeira nota"));
            peso1 = Integer.parseInt(JOptionPane.showInputDialog("digite peso da 1º nota"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("digite segunda nota"));
            peso2 = Integer.parseInt(JOptionPane.showInputDialog("digite peso da 2º nota"));
            trabalho = Double.parseDouble(JOptionPane.showInputDialog("digite nota do trabalho"));
            peso3 = Integer.parseInt(JOptionPane.showInputDialog("digite o peso trabalho"));

            totalpeso = peso1 + peso2 + peso3;

            if (totalpeso < 10 || totalpeso > 10) {

                JOptionPane.showMessageDialog(null, "peso deve ser igual a 10");
            } else {
                
                media = ((n1*peso1) + (n2*peso2) + (trabalho*peso3)) / 10;
                
                String mensagem = " ";
                
                 
                if(media>=7){
                    
                  mensagem = "Aprovado";  
                    
                }else if(media<7 && media>=4){
                    
                    mensagem = "exame";
                }else{
                    
                    mensagem = "reprovado";
                    
                }

                JOptionPane.showMessageDialog(null, nome + " sua média é: " + media+ " Situação: "+mensagem);
                
               
                
            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "erro conversão", "informe somente numeros validos ",
                    +TrayIcon.MessageType.ERROR.ordinal());
            ex.printStackTrace();

        } finally {

            System.err.println("Saindo");
            System.exit(0);

        }
    }
   
}
