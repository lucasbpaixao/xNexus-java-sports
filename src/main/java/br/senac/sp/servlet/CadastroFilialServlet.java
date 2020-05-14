package br.senac.sp.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.dao.FilialDAO;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.entidade.Filial;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas
 */
@WebServlet(name = "CadastroFilialServlet", urlPatterns = {"/CadastroFilialServlet"})
public class CadastroFilialServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        forward = "filial.jsp";

        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("listarfilial")) {
            forward = "/filial.jsp";

            List<Filial> lista = FilialDAO.listarFilial();
            request.setAttribute("filiais", lista);

            RequestDispatcher view = request.getRequestDispatcher(forward);
            view.forward(request, response);
        }

        if (action.equalsIgnoreCase("excluir")) {
            forward = "/filial.jsp";
            int id = Integer.parseInt(request.getParameter("id"));
            boolean excliu = FilialDAO.excluirFilial(id);
            String url = "";
            if (excliu) {
                request.setAttribute("msgSucesso", "Filial excluida com sucesso.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
                url = "/sucesso.jsp";
            } else {
                url = "/erro.jsp";
                request.setAttribute("msgErro", "Não foi possivel excluir a filial.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("alterar")) {
            
            String id = request.getParameter("Id");
            String nome = request.getParameter("NomeFilial");
            String cep = request.getParameter("CEP");
            String pais = request.getParameter("Pais");
            String cidade = request.getParameter("Cidade");
            String uf = request.getParameter("UF");
            String bairro = request.getParameter("Bairro");
            String rua = request.getParameter("Rua");
            String numero = request.getParameter("Numero");
            String complemento = request.getParameter("Complemento");

            Filial filial = new Filial(nome, cep, pais,cidade,uf,bairro,rua,numero,complemento);

            boolean cadastrou = FilialDAO.alterarFilial(filial, Integer.parseInt(id));
            PrintWriter out = response.getWriter();

            String url = "";
            if (cadastrou) {
                request.setAttribute("msgSucesso", "Filial alterada com sucesso.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
                url = "/sucesso.jsp";
            } else {
                url = "/erro.jsp";
                request.setAttribute("msgErro", "Não foi possivel alterar a filial.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
            
        } else if (action.equalsIgnoreCase("")) {

            String nome = request.getParameter("NomeFilial");
            String cep = request.getParameter("CEP");
            String pais = request.getParameter("Pais");
            String cidade = request.getParameter("Cidade");
            String uf = request.getParameter("UF");
            String bairro = request.getParameter("Bairro");
            String rua = request.getParameter("Rua");
            String numero = request.getParameter("Numero");
            String Complemento = request.getParameter("Complemento");

            Filial filial = new Filial();

            filial.setNome(nome);
            filial.setBairro(bairro);
            filial.setCep(cep);
            filial.setCidade(cidade);
            filial.setComplemento(Complemento);
            filial.setNumero(numero);
            filial.setRua(rua);
            filial.setUf(uf);
            filial.setPais(pais);

            boolean cadastrou = FilialDAO.cadastrarFilial(filial);
            PrintWriter out = response.getWriter();

            String url = "";
            if (cadastrou) {
                request.setAttribute("msgSucesso", "Filial cadastrada com sucesso.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
                url = "/sucesso.jsp";
            } else {
                url = "/erro.jsp";
                request.setAttribute("msgErro", "Não foi possivel cadastrar a filial.");
                request.setAttribute("forward", "CadastroFilialServlet?action=listarFilial");
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
