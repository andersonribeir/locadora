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
import model.modelFuncionario;

public class funcionarioDAO {

    private Connection con = null;

    public void CadastrarFunc(modelFuncionario f) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("INSERT INTO atendente (NomeAtendente,cpfatendente,LoginAtendente,SenhaAtendente,EmailAtendente,nascimento,salario,endereco) VALUES (?,?,?,?,?,?,?,?)");
            stm.setString(1, f.getNome());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getLogin());
            stm.setString(4, f.getSenha());
            stm.setString(5, f.getEmail());
            stm.setString(6, f.getNascimento());
            stm.setDouble(7, f.getSalario());
            stm.setString(8, f.getEndereco());

            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }

    }

    public void AlterarFunc(modelFuncionario f) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE atendente SET NomeAtendente = ? ,cpfatendente = ?,EmailAtendente = ?,nascimento = ?,salario = ?,endereco = ? WHERE idAtendente = ?");
            stm.setString(1, f.getNome());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getEmail());
            stm.setString(4, f.getNascimento());
            stm.setDouble(5, f.getSalario());
            stm.setString(6, f.getEndereco());
            stm.setInt(7, f.getId());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }
    }

    public void ExcluirFunc(modelFuncionario f) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("DELETE FROM atendente WHERE idAtendente = ?");
            stm.setInt(1, f.getId());
            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }
    }

    public void PesquisarPorCpfFunc(modelFuncionario pesq) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            String consulta = "SELECT * FROM atendente WHERE cpfatendente LIKE '%" + pesq.getCpf() + "%'";
          System.out.println(consulta);
          stm = con.prepareStatement(consulta);
          rs = stm.executeQuery();
          
          rs.next();
            modelFuncionario funcionario = new modelFuncionario();
            pesq.setId(rs.getInt("idAtendente"));
            pesq.setNome(rs.getString("NomeAtendente"));
            pesq.setCpf(rs.getString("cpfatendente"));
            pesq.setEndereco(rs.getString("LoginAtendente"));
            pesq.setTelefone(rs.getString("SenhaAtendente"));
            pesq.setEmail(rs.getString("EmailAtendente"));
            pesq.setNascimento(rs.getString("nascimento"));
            pesq.setSalario(rs.getDouble("salario"));
            pesq.setEndereco(rs.getString("endereco"));

        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }

    }

    public int pegaID(modelFuncionario f) {
        Connection con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            stm = con.prepareStatement("SELECT idAtendente FROM atendente WHERE cpfatendente LIKE '%" + f.getCpf() + "%'");
            rs = stm.executeQuery();
            rs.next();
            f.setId(rs.getInt("idAtendente"));
        } catch (SQLException ex) {
            Logger.getLogger(generoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }
        return f.getId();
    }
    
    public boolean checkLogin(String login,String senha){
        Connection con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        try {
            stm = con.prepareStatement("SELECT * FROM atendente WHERE LoginAtendente = ? and SenhaAtendente = ?");
            stm.setString(1,login);
            stm.setString(2,senha);
            rs = stm.executeQuery();
            
            if(rs.next()){
                check = true;


            }
            
        } catch (SQLException ex) {
            Logger.getLogger(funcionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            BD.FecharConexao();
        }
        
           return check; 
        }
    }

