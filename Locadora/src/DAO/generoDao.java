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
import model.modelGenero;

public class generoDao {

    private Connection con = null;

    public List<modelGenero> LerGenero() {
        con = BD.getConexaoMySQL();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<modelGenero> generos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM gênerofilme");
            rs = stmt.executeQuery();

            while (rs.next()) {

                modelGenero genero = new modelGenero();

                genero.setIdGenero(rs.getInt("idGeneroFilme"));
                genero.setGenero(rs.getString("Gênero"));
                generos.add(genero);
            }

        } catch (SQLException ex) {
            Logger.getLogger(modelGenero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BD.FecharConexao();
        }

        return generos;

    }

    public int pegaID(String g) {
        Connection con = BD.getConexaoMySQL();
        PreparedStatement stm = null;
        ResultSet rs = null;
        modelGenero x = new modelGenero();

        try {
            stm = con.prepareStatement("SELECT idGeneroFilme FROM gênerofilme WHERE Gênero LIKE '%" + g + "%'");
            rs = stm.executeQuery();
            rs.next();
            x.setIdGenero(rs.getInt("idGeneroFilme"));
        } catch (SQLException ex) {
            Logger.getLogger(generoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            BD.FecharConexao();
        }
        return x.getIdGenero();
    }

}
