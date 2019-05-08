/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import DAO.clienteDAO;
import DAO.filmeDAO;
import DAO.generoDao;
import DAO.locacaoDAO;
import model.modelCliente;
import model.modelFilme;
import model.modelLocacao;

/**
 *
 * @author Anderson
 */
public class Teste {
    public static void main(String[] args) {
        locacaoDAO ld = new locacaoDAO();
        modelLocacao l = new modelLocacao();
        generoDao fd = new generoDao();
        modelFilme mf = new modelFilme();
        System.out.println(ld.PegaIdloc());;
        System.out.println(fd.pegaID("terror"));
            
        
        
        
    }
}
