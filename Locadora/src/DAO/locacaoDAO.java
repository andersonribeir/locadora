package DAO;

import Connection.BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelLocacao;



public class locacaoDAO {
  private Connection con = null;
  public void locar(modelLocacao c){
      con = BD.getConexaoMySQL();
      PreparedStatement stm = null;
      
      try {
          stm = con.prepareStatement("INSERT INTO locacao "
                  + "(idLocacao,ValorLocacao,DataLocacao,DataDevolucao,Cliente_idCliente) "
                  + "VALUES "
                  + "(?,?,?,?,?)");
          stm.setInt(1,c.getIdLocacao());
          stm.setDouble(2,c.getValor());
          stm.setString(3,c.getDataLocacao());
          stm.setString(4,c.getDataDevolucao());
          stm.setInt(5,c.getIdCliente());
          
          
          stm.execute();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
          BD.FecharConexao();
      }
      
              
  }
  public int PegaIdloc(){
      Connection con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;
            modelLocacao c2 = new modelLocacao();

        try {
            stm = con.prepareStatement("SELECT max(idLocacao) as idlocacao FROM locacao ");
            rs = stm.executeQuery();
            rs.next();
            c2.setIdLocacao(rs.getInt("idLocacao"));
        } catch (SQLException ex) {
            Logger.getLogger(generoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            BD.FecharConexao();
        }
        return c2.getIdLocacao();
  }
}