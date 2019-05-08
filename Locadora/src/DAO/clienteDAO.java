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
import model.modelCliente;




public class clienteDAO {
  private Connection con = null;
  
  
  public void CadastrarCliente(modelCliente c){
      con = BD.getConexaoMySQL();
      PreparedStatement stm = null;
      
      try {
          stm = con.prepareStatement("INSERT INTO cliente (nomecliente,cpfcliente,EmailCliente,endereco,telefone,nascimento) VALUES (?,?,?,?,?,?)");
          stm.setString(1,c.getNome());
          stm.setString(2,c.getCpf());
          stm.setString(3,c.getEmail());
          stm.setString(4,c.getEndereco());
          stm.setString(5,c.getTelefone());
          stm.setString(6, c.getNascimento());
          
          stm.execute();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
          BD.FecharConexao();
      }
      
              
  }
  
  public void AlterarCliente(modelCliente c){
      con = BD.getConexaoMySQL();
      PreparedStatement stm = null;
      
      try {
          stm = con.prepareStatement("UPDATE cliente SET nomecliente = ? ,cpfcliente = ?,EmailCliente = ?,endereco = ?,telefone = ?, nascimento = ? WHERE idCliente = ?");
          stm.setString(1,c.getNome());
          stm.setString(2,c.getCpf());
          stm.setString(3,c.getEmail());
          stm.setString(4,c.getEndereco());
          stm.setString(5,c.getTelefone());
          stm.setString(6,c.getNascimento());
          stm.setInt(7, c.getId());
          stm.executeUpdate();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
          BD.FecharConexao();
      }
  }
  
  public void ExcluirCliente(modelCliente c){
      con = BD.getConexaoMySQL();
      PreparedStatement stm = null;
      
      try {
          stm = con.prepareStatement("DELETE FROM cliente WHERE idCliente = ?");
          stm.setInt(1,c.getId());
          stm.execute();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
          BD.FecharConexao();
      }
  }
  
  public void PesquisarPorcpfcliente(modelCliente pesq){
      con = BD.getConexaoMySQL();
      PreparedStatement stm = null;
      ResultSet rs = null;
      
      try{
          String consulta = "SELECT * FROM cliente WHERE cpfcliente LIKE '%" + pesq.getCpf() + "%'";
          
          stm = con.prepareStatement(consulta);
          rs = stm.executeQuery();
          
          rs.next();
              modelCliente cliente = new modelCliente();
              
              pesq.setId(rs.getInt("idCliente"));
              pesq.setNome(rs.getString("nomecliente"));
              pesq.setCpf(rs.getString("cpfcliente"));
              pesq.setEmail(rs.getString("EmailCLiente"));
              pesq.setEndereco(rs.getString("endereco"));
              pesq.setTelefone(rs.getString("telefone"));
              pesq.setNascimento(rs.getString("nascimento"));
              
              
             
          
          
          
      }catch (SQLException ex) {
          Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      finally{
          BD.FecharConexao();
      }
  }
  public int pegaID(modelCliente c) {
        Connection con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            stm = con.prepareStatement("SELECT idCliente FROM cliente WHERE cpfcliente LIKE '%" + c.getCpf()+ "%'");
            rs = stm.executeQuery();
            rs.next();
            c.setId(rs.getInt("idCliente"));
        } catch (SQLException ex) {
            Logger.getLogger(generoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            BD.FecharConexao();
        }
        return c.getId();
    }
    
}
