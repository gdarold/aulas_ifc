/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exe6 {

    public static void main(String args[]) {

        try {

            String nome = "aluno";

            String senha = "ifcfraiburgo";
            senha = criptografar(senha);

            String login = JOptionPane.showInputDialog("digite nome");

            String senhaNova = JOptionPane.showInputDialog("digite e sua senha");

            senhaNova = criptografar(senhaNova);

            if (login.equals(nome) && senha.equals(senhaNova)) {

                JOptionPane.showMessageDialog(null, "Bem vindo");

            } else {

                JOptionPane.showMessageDialog(null, "usuario ou senha errados");

            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    public static String criptografar(String senha) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(senha.getBytes(), 0, senha.length());

        String resultado = new BigInteger(1, md.digest()).toString(16);
        return resultado;
    }

}
