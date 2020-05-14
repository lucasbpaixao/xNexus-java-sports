package br.senac.sp.servlet;

import br.senac.sp.dao.ClienteDAO;
import br.senac.sp.entidade.Cliente;
import br.senac.sp.entidade.Venda;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastroClienteServlet", urlPatterns = {"/CadastroClienteServlet"})
public class CadastroClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        forward = "cliente.jsp";

        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("excluir")) {
            forward = "/cliente.jsp";
            int id = Integer.parseInt(request.getParameter("id"));
            boolean excliu = ClienteDAO.excluirCliente(id);
            String url = "";
            if (excliu) {
                url = "/sucesso.jsp";
            } else {
                url = "/erro.jsp";
            }
            request.setAttribute("msgSucesso", "Cliente Excluido com sucesso");
            request.setAttribute("forward", "/xNexus-java-sports/CadastroClienteServlet?action=listarCliente");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

        if (action.equalsIgnoreCase("listarCliente")) {
            forward = "cliente.jsp";
            List<Cliente> lista = ClienteDAO.listarCliente();
            request.setAttribute("clientes", lista);
            RequestDispatcher view = request.getRequestDispatcher(forward);
            view.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
      
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("alterar")) {
            
            forward = "cliente.jsp";
            int id = Integer.parseInt(request.getParameter("id").trim());
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String dataNascimento = request.getParameter("dataNascimento");
            String cpf = request.getParameter("cpf");
            String telefone = request.getParameter("telefone");
            String sexo = request.getParameter("sexo");

            Cliente cliente = new Cliente();
            
            
            cliente.setId(id);
            cliente.setNome(nome);
            cliente.setSobrenome(sobrenome);
            cliente.setDataNascimento(dataNascimento);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setSexo(sexo);

            boolean alterou = ClienteDAO.alterarCliente(cliente);
            PrintWriter out = response.getWriter();

            String url = "";
            if (alterou) {
                url = "/sucesso.jsp";
            } else {
                url = "/erro.jsp";
            }
            request.setAttribute("msgSucesso", "Cliente Alterado com Sucesso");
            request.setAttribute("forward", "/xNexus-java-sports/CadastroClienteServlet?action=listarCliente");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }else{
        
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String dataNascimento = request.getParameter("dataNascimento");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String sexo = request.getParameter("sexo");

        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setSobrenome(sobrenome);
        cliente.setDataNascimento(dataNascimento);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setSexo(sexo);

        boolean cadastrou = ClienteDAO.cadastrarCliente(cliente);
        PrintWriter out = response.getWriter();

        String url = "";
        if (cadastrou) {
            url = "/sucesso.jsp";
        } else {
            url = "/erro.jsp";
        }
        request.setAttribute("msgSucesso", "Cliente Cadastrado com Sucesso");
        request.setAttribute("forward", "/xNexus-java-sports/CadastroClienteServlet?action=listarCliente");
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
