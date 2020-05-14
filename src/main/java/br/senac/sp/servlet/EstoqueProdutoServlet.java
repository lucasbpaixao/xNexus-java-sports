/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.servlet;

import br.senac.sp.dao.EstoqueDAO;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oz500
 */
@WebServlet(name = "EstoqueProdutoServlet", urlPatterns = {"/EstoqueProdutoServlet"})
public class EstoqueProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();

        PrintWriter rs = response.getWriter();
        List estoque = EstoqueDAO.listarEstoque();
        if (estoque != null) {
            String json = gson.toJson(estoque);
            rs.print(json);
        } else {
            rs.print(false);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();

        PrintWriter rs = response.getWriter();
        List estoque = EstoqueDAO.listarEstoque();
        String json = gson.toJson(estoque);

        rs.print(json);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// 

}
