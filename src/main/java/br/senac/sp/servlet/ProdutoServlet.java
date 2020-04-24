/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.dao.ProdutoDao;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raul
 */
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Empty
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Esse metódo será chamado já que você usou o Post para o formulário. Aqui você deve passar todos os parametros de seu Model. 
        // Importante resaltar que aqui só aceita String
        
        //--------------Aqui é apenas teste
        //response.setContentType("text/html; charset=UTF=8");
        //response.setCharacterEncoding("UTF-8");
        String codigo = request.getParameter("Código");
        String nomeProduto = request.getParameter("Nome do produto");
        String marca = request.getParameter("Marca");
        String preco = request.getParameter("Preço");
        String quantidade = request.getParameter("Quantidade");
        

        Produto produto = new Produto(Integer.parseInt(codigo),nomeProduto,marca, Double.parseDouble(preco),Integer.parseInt(quantidade));
        
        //Aqui já vai chamar o DAO para cadastrar
        boolean ok = ProdutoDao.cadastrarProduto(produto);
        PrintWriter out = response.getWriter();

        String url = "";
        if (ok) {
            url = "deu bom";
        } else {
            url = "deu ruim";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
