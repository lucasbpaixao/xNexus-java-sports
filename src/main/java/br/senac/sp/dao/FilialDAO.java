package br.senac.sp.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.senac.sp.db.ConexaoDB;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.entidade.Filial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilialDAO {

    public static boolean cadastrarFilial(Filial filial) {
        boolean cadastrou = false;
        Connection connection;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "insert into filial values (default,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, filial.getNome());
            preparedStatement.setString(2, filial.getBairro());
            preparedStatement.setString(3, filial.getCep());
            preparedStatement.setString(4, filial.getPais());
            preparedStatement.setString(5, filial.getRua());
            preparedStatement.setString(6, filial.getComplemento());
            preparedStatement.setString(7, filial.getNumero());
            preparedStatement.setString(8, filial.getUf());
            preparedStatement.setString(9, filial.getCidade());

            preparedStatement.execute();
            cadastrou = true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadastrou;
    }
    
    public static List<Filial> listarFilial() {

        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = ConexaoDB.getConexao();

            pstmt = connection.prepareStatement(

             
                    "SELECT * FROM filial ORDER BY ID_FILIAL");


            rs = pstmt.executeQuery();

            List lista = new ArrayList<>();

            while (rs.next()) {

                Filial Filial = new Filial();


                Filial.setId(rs.getInt("ID_FILIAL"));

                Filial.setNome(rs.getString("nome"));
                Filial.setBairro(rs.getString("bairro"));
                Filial.setCep(rs.getString("cep"));
                Filial.setPais(rs.getString("pais"));
                Filial.setRua(rs.getString("rua"));
                Filial.setComplemento(rs.getString("complemento"));
                Filial.setNumero(rs.getString("numero"));
                Filial.setUf(rs.getString("uf"));
                Filial.setCidade(rs.getString("cidade"));

                lista.add(Filial);
            }
            return lista;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
    }
    
    public static boolean excluirFilial(int id) {
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        boolean excluiu = false;
        try {
            connection = ConexaoDB.getConexao();

            String sql = "delete from filial where ID_FILIAL = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            excluiu = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return excluiu;

    }
    
     public static boolean alterarFilial(Filial filial, int Id) {
        boolean alterou = false;
        Connection connection;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "update filial set nome = ?, bairro = ?, cep = ?, pais = ?, rua = ?,complemento = ?, numero = ?, uf = ?, cidade = ? where ID_FILIAL = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, filial.getNome());
            preparedStatement.setString(2, filial.getBairro());
            preparedStatement.setString(3, filial.getCep());
            preparedStatement.setString(4, filial.getPais());
            preparedStatement.setString(5, filial.getRua());
            preparedStatement.setString(6, filial.getComplemento());
            preparedStatement.setString(7, filial.getNumero());
            preparedStatement.setString(8, filial.getUf());
            preparedStatement.setString(9, filial.getCidade());
            preparedStatement.setInt(10, Id);

            preparedStatement.execute();
            alterou = true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alterou;
    }

}
