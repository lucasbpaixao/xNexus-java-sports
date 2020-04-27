/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.servlet;

import br.senac.sp.dao.ProdutoDao;
import br.senac.sp.entidade.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raul
 */
public class ExcluirProduto extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Empty
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("Código");       

        boolean excluiu = ProdutoDao.excluirProduto(Integer.parseInt(codigo));
        PrintWriter out = response.getWriter();

        String url = "";
        if (excluiu) {
            url = "/sucesso.jsp";
        } else {
            url = "/erro.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
