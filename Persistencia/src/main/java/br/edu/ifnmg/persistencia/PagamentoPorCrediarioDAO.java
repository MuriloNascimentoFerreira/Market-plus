/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaAplicacao.PagamentoPorCrediario;
import br.edu.ifnmg.logicaAplicacao.PagamentoPorCrediarioRepositorio;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class PagamentoPorCrediarioDAO 
        extends DataAccessObject<PagamentoPorCrediario> 
        implements PagamentoPorCrediarioRepositorio{

    public PagamentoPorCrediarioDAO() {
        super(PagamentoPorCrediario.class);
    }

    @Override
    public List<PagamentoPorCrediario> Buscar(PagamentoPorCrediario obj) {
        return null;
    }
    
}
