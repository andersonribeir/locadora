/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.modelFilme;

public class filmeDAO {

    private Connection con = null;

    public void CadastrarFilme(modelFilme c) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("INSERT INTO filmes (NomeFilme,AnoLancamento,Descricao,TempoDuracao,GeneroFilme_idGeneroFilme,estoqueGeral, estoqueEmLoja) VALUES (?,?,?,?,?,?,?)");
            stm.setString(1, c.getNomeFilme());
            stm.setString(2, c.getAnolancamento());
            stm.setString(3, c.getDescricao());
            stm.setString(4, c.getTempoduracao());
            stm.setString(5, c.getGenero());
            stm.setInt(6, c.getEstoquegeral());
            stm.setInt(7, c.getEstoqueloja());

            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }

    }

    public void AlterarFilme(modelFilme c) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE filmes SET NomeFilme = ? ,AnoLancamento = ?,Descricao = ?,TempoDuracao = ?,GeneroFilme_idGeneroFilme = ?,estoqueGeral = ?, estoqueEmLoja = ? WHERE idFilmes = ?");
            stm.setString(1, c.getNomeFilme());
            stm.setString(2, c.getAnolancamento());
            stm.setString(3, c.getDescricao());
            stm.setString(4, c.getTempoduracao());
            stm.setString(5, c.getGenero());
            stm.setInt(6, c.getEstoquegeral());
            stm.setInt(7, c.getEstoqueloja());
            stm.setInt(8, c.getId());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }
    }

    public void ExcluirFilme(modelFilme c) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("DELETE FROM filmes WHERE idFilme = ?");
            stm.setInt(1, c.getId());
            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }
    }

    public void PesquisarPorNome(modelFilme pesq) {
        con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            String consulta1 = "SELECT * FROM filmes WHERE NomeFilme LIKE '%" + pesq.getNomeFilme() + "%'";
            stm = con.prepareStatement(consulta1);
            rs = stm.executeQuery();

            rs.next();
                modelFilme filme = new modelFilme();
                
            pesq.setId(rs.getInt("idFilmes"));
            pesq.setNomeFilme(rs.getString("NomeFilme"));
            pesq.setAnolancamento(rs.getString("AnoLancamento"));
            pesq.setDescricao(rs.getString("Descricao"));
            pesq.setTempoduracao(rs.getString("TempoDuracao"));
            pesq.setGenero(rs.getString("GeneroFilme_idGeneroFilme"));
            pesq.setEstoquegeral(rs.getInt("estoqueGeral"));
            pesq.setEstoqueloja(rs.getInt("estoqueEmLoja"));

        } catch (SQLException ex) {
            Logger.getLogger(filmeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }

    }

}
