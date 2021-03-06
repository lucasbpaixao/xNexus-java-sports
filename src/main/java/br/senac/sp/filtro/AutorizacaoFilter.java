package br.senac.sp.filtro;

import br.senac.sp.entidade.Usuario;
import br.senac.sp.utils.PerfilEnum;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutorizacaoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        // 1) Verifica se usuario já está logado
        HttpSession sessao = httpRequest.getSession();
        if (sessao.getAttribute("usuario") == null) {
            // Usuario nao esta logado -> redirecionar para tela de login
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
            return;
        }
        
        // 2) Usuario esta logado -> Verifica se tem papel necessario para acesso
        Usuario usuario = (Usuario) sessao.getAttribute("usuario");
        
        if (verificarAcesso(usuario, httpRequest)) {
            // Usuario tem permissao de acesso -> Requisição pode seguir para servlet
            chain.doFilter(request, response);
        } else {
            // Mostra erro de acesso não autorizado
            
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/naoAutorizado.jsp");
        }

    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }
    
    private boolean verificarAcesso(Usuario usuario, HttpServletRequest httpRequest) {
        String urlAcessada = httpRequest.getRequestURI();
        
        if(urlAcessada.contains("admin")){
            if(usuario.isAdmin()){
                return true;
            }else{
                return false;
            }
        }else if(urlAcessada.contains("gerente")){
            if(usuario.isAdmin() || usuario.isGerente()){
                return true;
            }else{
                return false;
            }
        }else if(urlAcessada.contains("/protegido/funcionario/")) {
            if (usuario.isAdmin() || usuario.isGerente() || usuario.isFuncionario()) {
                return true;
            }
        } else {
             if (urlAcessada.contains("/protegido/")) {
                 return true;
             }
        }       
        return false;
    }

}