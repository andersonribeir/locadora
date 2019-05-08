/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.modelItensLocados;


public class itenslocadosDAO {
    private Connection con = null;
    public void GuardarItens(modelItensLocados il){
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("INSERT INTO itenslocados (idLocacao,idFilme) values (?,?) ");
            stm.setInt(1, il.getIdLocação());
            stm.setInt(2, il.getIdFilme());
            
            stm.execute();
            JOptionPane.showMessageDialog(null,"Locação efetuada com sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verifique se todos os campos foram preenchidos corretamente");
        } finally {
            BD.FecharConexao();
        }

    }
    }
    
