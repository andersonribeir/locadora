/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;



public class modelFilme {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String nomeFilme;
    private String genero;
    private int estoquegeral;
    private int estoqueloja;
    private String disponibilidade;
    private String descricao;
    private String anolancamento;
    private String tempoduracao;

    public String getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(String anolancamento) {
        this.anolancamento = anolancamento;
    }
    
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoquegeral() {
        return estoquegeral;
    }

    public void setEstoquegeral(int estoquegeral) {
        this.estoquegeral = estoquegeral;
    }

    public int getEstoqueloja() {
        return estoqueloja;
    }

    public void setEstoqueloja(int estoqueloja) {
        this.estoqueloja = estoqueloja;
    }

    public String getTempoduracao() {
        return tempoduracao;
    }

    public void setTempoduracao(String tempoduracao) {
        this.tempoduracao = tempoduracao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
