/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.servlet;

import br.senac.sp.dao.RelatorioDAO;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RelatorioProdutoServlet", urlPatterns = {"/RelatorioProdutoServlet"})
public class RelatorioProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();

        PrintWriter rs = response.getWriter();
        List relatorio = RelatorioDAO.gerarRelatorioProduto();
        if (relatorio != null) {
            String json = gson.toJson(relatorio);
            rs.print(json);
        }else{
            rs.print(false);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// 

}
