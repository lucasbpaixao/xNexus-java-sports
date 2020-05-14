/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.sp.db.ConexaoDB;
import br.senac.sp.entidade.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oz500
 */
public class EstoqueDAO {
    
    public static List listarEstoque(){
        
        Connection connection;
        PreparedStatement stmt;
        ResultSet resultSet;
        
        try {
           
            List produtoList = new ArrayList<>();
            
            connection = ConexaoDB.getConexao();
            
            stmt = connection.prepareStatement("SELECT * FROM produto ORDER BY ID_PRODUTO");
            
            resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                
                Estoque estoque = new Estoque();
                
                estoque.setIdProduto(resultSet.getInt("ID_PRODUTO"));
                estoque.setNomeProduto(resultSet.getString("nome"));
                estoque.setMarcaProduto(resultSet.getString("marca"));
                estoque.setPrecoProduto(resultSet.getDouble("preco"));
                estoque.setQuantidadeProduto(resultSet.getInt("quantidade"));
                
                produtoList.add(estoque);
            }
            
            
            return produtoList;
            
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
