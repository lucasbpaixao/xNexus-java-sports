package br.senac.sp.dao;

import br.senac.sp.db.ConexaoDB;
import br.senac.sp.entidade.Cliente;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ederson_Souza
 */
public class ClienteDAO {
    
    public static boolean cadastrarCliente(Cliente cliente) {
        boolean cadastrou = false;
        Connection connection;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "insert into cliente values (default,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSobrenome());
            preparedStatement.setString(3, cliente.getDataNascimento());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getSexo());
            preparedStatement.execute();
            cadastrou = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadastrou;
    }
    
    public static List<Cliente> listarCliente() {
        
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            connection = ConexaoDB.getConexao();
            
            pstmt = connection.prepareStatement(
                    "SELECT * FROM cliente ORDER BY id_cliente");
            
            rs = pstmt.executeQuery();
            
            List lista = new ArrayList<>();
            
            while (rs.next()) {
                
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setDataNascimento(rs.getString("dataNascimento"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setSexo(rs.getString("sexo"));
                
                lista.add(cliente);
                
            }
            
            return lista;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
            
        }
    }
    
    public static boolean excluirCliente(int id) {
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean excluiu = false;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "delete  from cliente where ID_CLIENTE = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            excluiu = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return excluiu;
        
    }

    public static boolean alterarCliente(Cliente cliente) {
          boolean alterou = false;
        Connection connection;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "update cliente set nome = ?, sobrenome = ?, dataNascimento = ?,cpf = ?,telefone = ?, sexo = ? where ID_CLIENTE = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSobrenome());
            preparedStatement.setString(3, cliente.getDataNascimento());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getTelefone());
            preparedStatement.setString(6, cliente.getSexo());
            preparedStatement.setInt(7, cliente.getId());
            preparedStatement.executeUpdate();
            alterou = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alterou;
    }
    
    
}
