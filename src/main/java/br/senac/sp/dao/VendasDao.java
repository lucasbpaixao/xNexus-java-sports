/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.sp.db.ConexaoDB;
import br.senac.sp.dto.ItemCarrinhoDto;
import br.senac.sp.dto.VendaDetalhadaDto;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.entidade.Produto;
import br.senac.sp.entidade.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class VendasDao {

    public List<Produto> getProdutos() {

        List<Produto> produtos = new ArrayList<>();
        Connection conexao;
        try {
            conexao = ConexaoDB.getConexao();
            String sql = "SELECT * FROM PRODUTO";
            PreparedStatement st = conexao.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto(rs.getString("NOME"), rs.getString("MARCA"), rs.getDouble("PRECO"), rs.getInt("QUANTIDADE"));

                produto.setCodigo(rs.getInt("ID_PRODUTO"));

                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    public List<Venda> getVendas() {

        List<Venda> vendas = new ArrayList<>();
        Connection conexao;
        try {
            conexao = ConexaoDB.getConexao();
            String sql = "SELECT * FROM VENDA";
            PreparedStatement st = conexao.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();

                venda.setId(rs.getLong("ID_VENDA"));
                venda.setIdCliente(rs.getLong("ID_CLIENTE"));
                venda.setIdFilial(rs.getLong("ID_FILIAL"));
                venda.setValorTotal(rs.getDouble("TOTAL"));
                venda.setDataVenda(rs.getDate("DATA_VENDA"));

                venda.addProdutos(this.getCarrinho(venda.getId()));

                vendas.add(venda);

            }

        } catch (SQLException ex) {
            Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;
    }
    public VendaDetalhadaDto detalharVenda(int id){
        Connection conexao;
        VendaDetalhadaDto vendaDetalhada = new VendaDetalhadaDto();
        try {
            conexao = ConexaoDB.getConexao();
            
            String sql = "SELECT V.ID_VENDA, C.NOME, C.SOBRENOME, F.NOME, V.DATA_VENDA, V.TOTAL FROM VENDA AS V INNER JOIN CLIENTE AS C ON(C.ID_CLIENTE = V.ID_CLIENTE) INNER JOIN FILIAL AS F ON (V.ID_FILIAL = F.ID_FILIAL) WHERE V.ID_VENDA = ?";
        
            PreparedStatement st = conexao.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
              vendaDetalhada.setIdVenda(rs.getInt(1));
              vendaDetalhada.setNomeCliente(String.format("%s %s", rs.getString(2), rs.getString(3)));
              vendaDetalhada.setNomeFilial(rs.getString(4));
              vendaDetalhada.setDataVenda(rs.getDate(5));
              vendaDetalhada.setValorTotal(rs.getDouble(6));
              vendaDetalhada.setCarrinho(getCarrinho(id));
            }
            
            System.err.println(vendaDetalhada);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return vendaDetalhada;
    }

    private List<ItemCarrinhoDto> getCarrinho(long idVenda) {
        List<ItemCarrinhoDto> itensCarrinho = new ArrayList<>();
        Connection conexao;
        try {
            conexao = ConexaoDB.getConexao();
            String sql = "SELECT C.ID_CARRINHO, C.ID_PRODUTO, P.NOME, P.MARCA, C.QUANTIDADE,  P.PRECO, P.ID_PRODUTO FROM CARRINHO AS C INNER JOIN PRODUTO AS P ON (C.ID_PRODUTO = P.ID_PRODUTO) WHERE ID_VENDA = ?";
            PreparedStatement st = conexao.prepareStatement(sql);

            st.setLong(1, idVenda);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ItemCarrinhoDto item = new ItemCarrinhoDto(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));

                itensCarrinho.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itensCarrinho;
    }

    public boolean salvarVenda(Venda venda) {

        Connection conexao;
        try {
            conexao = ConexaoDB.getConexao();
            String sql = "INSERT INTO VENDA (ID_CLIENTE, ID_FILIAL, TOTAL, DATA_VENDA) VALUES (?,?,?,CURRENT_TIMESTAMP)";

            PreparedStatement st = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, venda.getIdCliente());
            st.setLong(2, venda.getIdFilial());
            st.setDouble(3, venda.getValorTotal());

            int linhasAfetadas = st.executeUpdate();

            int id = 0;
            if (linhasAfetadas > 0) {

                System.out.println(st.getGeneratedKeys());
                ResultSet generatedKeys = st.getGeneratedKeys();
                if (generatedKeys.next()) {
                    id = generatedKeys.getInt(1);
                }
            }

            for (ItemCarrinhoDto item : venda.getProdutosVendidos()) {
                st = conexao.prepareStatement("INSERT INTO CARRINHO (ID_VENDA, ID_PRODUTO, QUANTIDADE) VALUES (?,?,?)");

                st.setInt(1, id);
                st.setInt(2, item.getIdProduto());
                st.setInt(3, item.getQuantidade());

                st.execute();
            }

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public static List<Cliente> getClientes() {
        
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            connection = ConexaoDB.getConexao();
            
            pstmt = connection.prepareStatement(
                    "SELECT * FROM cliente ORDER BY id_cliente");
            
            rs = pstmt.executeQuery();
            
            List clientes = new ArrayList<>();
            
            while (rs.next()) {
                
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setDataNascimento(rs.getString("dataNascimento"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setSexo(rs.getString("sexo"));
                
                clientes.add(cliente);
                
            }
            
            return clientes;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
            
        }
    }

}
