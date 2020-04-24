/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.db.ConexaoDB;
import br.senac.sp.entidade.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.senac.sp.entidade.Produto;

/**
 *
 * @author Raul
 */
public class ProdutoDao {
   
     public static boolean cadastrarProduto(Produto produto) {
        boolean ok = false;
        Connection con;
        try {
            con = ConexaoDB.getConexao();
            String sql = "INSERT INTO produto VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNomeProduto());
            ps.setString(2, produto.getMarca());
            ps.setLong(3, (long) produto.getPreco());
            ps.setInt(4, (int) produto.getQuantidade()); 
            ps.execute();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return ok;
    }
}
