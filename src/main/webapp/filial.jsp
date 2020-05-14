<%-- 
    Document   : filialjsp
    Created on : 07/05/2020, 19:02:57
    Author     : Lucas
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Xnexus</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- favicon
                    ============================================ -->
        <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
        <!-- Google Fonts
                    ============================================ -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
        <!-- Bootstrap CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Bootstrap CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <!-- nalika Icon CSS
                ============================================ -->
        <link rel="stylesheet" href="css/nalika-icon.css">
        <!-- owl.carousel CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" href="css/owl.transitions.css">
        <!-- animate CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- normalize CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/normalize.css">
        <!-- meanmenu icon CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/meanmenu.min.css">
        <!-- main CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/main.css">
        <!-- morrisjs CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/morrisjs/morris.css">
        <!-- mCustomScrollbar CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/scrollbar/jquery.mCustomScrollbar.min.css">
        <!-- metisMenu CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/metisMenu/metisMenu.min.css">
        <link rel="stylesheet" href="css/metisMenu/metisMenu-vertical.css">
        <!-- calendar CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/calendar/fullcalendar.min.css">
        <link rel="stylesheet" href="css/calendar/fullcalendar.print.min.css">
        <!-- style CSS
                    ============================================ -->
        <link rel="stylesheet" href="style.css">
        <!-- responsive CSS
                    ============================================ -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- modernizr JS
                    ============================================ -->
        <script src="js/vendor/modernizr-2.8.3.min.js"></script>
    </head>

    <body>
        <!--[if lt IE 8]>
                <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->

        <div class="left-sidebar-pro">
            <nav id="sidebar" class="">
                <div class="sidebar-header">

                </div>
                <div class="nalika-profile">
                    <div class="profile-dtl">
                        <a href="index.jsp"><h2>Java Sports</h2></a>
                        
                    </div>
                </div>
                <div class="left-custom-menu-adp-wrap comment-scrollbar">
                    <nav class="sidebar-nav left-sidebar-menu-pro">
                        <ul class="metismenu" id="menu1">
                            <li class="active">
                                <a class="has-arrow" href="index.jsp">
                                    <i class="icon nalika-home icon-wrap"></i>
                                    <span class="mini-click-non">Cadastros</span>
                                </a>
                                <ul class="submenu-angle" aria-expanded="true">
                                    <li><a title="Cadastrar Clientes" href="CadastroClienteServlet?action=listarCliente"><span class="mini-sub-pro">Cadastrar Clientes</span></a></li>
                                    <li><a title="Cadastrar Produto" href="CadastroProdutoServlet?action=listarProduto"><span class="mini-sub-pro">Cadastrar Produtos</span></a></li>
                                    <li><a title="Cadastrar Vendas" href="VendasServlet?action=listarVendas"><span class="mini-sub-pro">Cadastrar Vendas</span></a></li>
                                    <li><a title="Cadastrar Filiais" href="CadastroFilialServlet?action=listarFilial"><span class="mini-sub-pro">Cadastrar Filiais</span></a></li>

                                </ul>
                            </li>

                            <li id="removable">
                                 <a class="has-arrow" href="estoque.jsp" aria-expanded="false"><i class="icon nalika-new-file icon-wrap"></i> <span class="mini-click-non">Estoque</span></a>

                            </li>
                        </ul>
                    </nav>
                </div>
            </nav>
        </div>
        <!-- Start Welcome area -->
        <div class="all-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="logo-pro">

                        </div>
                    </div>
                </div>
            </div>
            <div class="header-advance-area">
                <div class="header-top-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="header-top-wraper">
                                    <div class="row">
                                        <div class="col-lg-1 col-md-0 col-sm-1 col-xs-12">

                                        </div>

                                        <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
                                            <div class="header-right-info">
                                                <ul class="nav navbar-nav mai-top-nav header-right-menu">
                                                    <li class="nav-item dropdown">




                                                        <div role="menu" class="admintab-wrap menu-setting-wrap menu-setting-wrap-bg dropdown-menu animated zoomIn">



                                                        </div>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="breadcome-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="breadcome-list">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                                            <div class="breadcomb-wp">
                                                <div class="breadcomb-icon">
                                                    <i class="icon nalika-home"></i>
                                                </div>
                                                <div class="breadcomb-ctn">
                                                    <h2>Cadastrar Filiais</h2>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single pro tab start-->
            <div class="single-product-tab-area mg-b-30">
                <!-- Single pro tab review Start-->
                <div class="single-pro-review-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="review-tab-pro-inner">
                                    <ul id="myTab3" class="tab-review-design">
                                        <li class="active"><a href="#description"><i class="icon nalika-edit" aria-hidden="true"></i> Cadastro</a></li>

                                    </ul>
                                    <form name = "cadastro filial" action='CadastroFilialServlet' method='post'>
                                        <div id="myTabContent" class="tab-content custom-product-edit">
                                            <div class="product-tab-list tab-pane fade active in" id="description">
                                                <div class="row">
                                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                        <div class="review-content-section">
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-user" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Id da filial" name="Id" readonly="true" id="ID">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-edit" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Nome da filial" name="NomeFilial" id="NOME" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-edit" aria-hidden="true"></i></span>
                                                                <input type="Number" class="form-control" placeholder="Cep" name="CEP" id="CEP" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="fa fa-usd" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Pais" name="Pais" id="PAIS" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Cidade" name="Cidade" id="CIDADE"  required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Uf" name="UF" id="UF" required="true" maxlength="2">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Bairro" name="Bairro" id="BAIRRO" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Rua" name="Rua" id="RUA" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Número" name="Numero" id="NUMERO" required="true">
                                                            </div>
                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="text" class="form-control" placeholder="Complemento" name="Complemento" id="COMPLEMENTO">
                                                            </div>
                                                            <input type="text" name="action" id="action" hidden="true">

                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                            <div class="text-center custom-pro-edt-ds">
                                                                <button type="submit" class="btn btn-ctl-bt waves-effect waves-light m-r-10">Salvar</button>
                                                                
                                                                <button type="submit" class="btn btn-ctl-bt waves-effect waves-light">Alterar</button>
                                                                <button type="button" onClick="limpar()"
                                                        class="btn btn-ctl-bt waves-effect waves-light">Limpar</button>
                                                            </div>

                                                        </div>
                                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                            <div class="review-content-section">


                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>


                                            </div>
                                        </div>
                                    </form>



                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="product-status mg-b-30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="product-status-wrap">
                                    <h4>Lista de filiais cadastradas</h4>

                                    <table onload="CadastroFilialServlet" method="GET">
                                                <thead>
                                                <tr>
                                                    <th>Id</th>
                                                    <th>Nome</th>
                                                    <th>bairro</th>
                                                    <th>cep</th>
                                                    <th>pais</th>
                                                    <th>rua</th>
                                                    <th>complemento</th>
                                                    <th>numero</th>
                                                    <th>uf</th>
                                                    <th>cidade</th>
                                                </tr>
                                                </thead>
                                                
                                                
                                                <tbody>
                                                    <c:forEach items="${filiais}" var="filial">
                                                        <tr id="${filial.id}">

                                                            <td id="id${filial.id}"><c:out value="${filial.id}"/></td>
                                                            <td id="nome${filial.id}"><c:out value="${filial.nome}"/></td>
                                                            <td id="bairro${filial.id}"><c:out value="${filial.bairro}"/></td>
                                                            <td id="cep${filial.id}"><c:out value="${filial.cep}"/></td>
                                                            <td id="pais${filial.id}"><c:out value="${filial.pais}"/></td>
                                                            <td id="rua${filial.id}"><c:out value="${filial.rua}"/></td>
                                                            <td id="complemento${filial.id}"><c:out value="${filial.complemento}"/></td>
                                                            <td id="numero${filial.id}"><c:out value="${filial.numero}"/></td>
                                                            <td id="uf${filial.id}"><c:out value="${filial.uf}"/></td>
                                                            <td id="cidade${filial.id}"><c:out value="${filial.cidade}"/></td>
                                                            <td>
                                                                <button data-toggle="tooltip" title="Preencher" onclick="preencher(${filial.id})"class="pd-setting-ed"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button>
                                                                <button data-toggle="tooltip" title="Excluir" onclick = "javascript:window.location='CadastroFilialServlet?action=excluir&id=${filial.id}'"class="pd-setting-ed"><i class="fa fa-trash-o" aria-hidden="true"></i></button>
                                                            </td>

                                                        </tr>
                                                    </c:forEach>
                                                </tbody>

                                            </table>
                                    
                                    <script>
                                                function preencher(id2){
                                                   
                                                    let id = document.getElementById("id"+id2);
                                                    let nome = document.getElementById("nome"+id2);
                                                    let bairro = document.getElementById("bairro"+id2);
                                                    let cep = document.getElementById("cep"+id2);
                                                    let pais = document.getElementById("pais"+id2);
                                                    let rua = document.getElementById("rua"+id2);
                                                    let complemento = document.getElementById("complemento"+id2);
                                                    let numero = document.getElementById("numero"+id2);
                                                    let uf = document.getElementById("uf"+id2);
                                                    let cidade = document.getElementById("cidade"+id2);
                                                    
                                                    document.getElementById("ID").value = id.textContent;
                                                    document.getElementById("NOME").value = nome.textContent.trim();
                                                    document.getElementById("BAIRRO").value = bairro.textContent.trim();
                                                    document.getElementById("CEP").value = cep.textContent.trim();
                                                    document.getElementById("PAIS").value = pais.textContent.trim();
                                                    document.getElementById("RUA").value = rua.textContent.trim();
                                                    document.getElementById("COMPLEMENTO").value = complemento.textContent.trim();
                                                    document.getElementById("NUMERO").value = numero.textContent.trim();
                                                    document.getElementById("UF").value = uf.textContent.trim();
                                                    document.getElementById("CIDADE").value = cidade.textContent.trim();
                                                    
                                                    document.getElementById("action").value = "alterar";
                                                }
                    
                                            </script>
                                            
                                            <script>
                                                    function limpar() {

                                                    document.getElementById("ID").value = "";
                                                    document.getElementById("NOME").value = "";
                                                    document.getElementById("BAIRRO").value = "";
                                                    document.getElementById("CEP").value = "";
                                                    document.getElementById("PAIS").value = "";
                                                    document.getElementById("RUA").value = "";
                                                    document.getElementById("COMPLEMENTO").value = "";
                                                    document.getElementById("NUMERO").value = "";
                                                    document.getElementById("UF").value = "";
                                                    document.getElementById("CIDADE").value = "";


                                                    }
                                                </script>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="footer-copyright-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="footer-copy-right">
                                    <p>JavaSports desenvolvido por Xnexus</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- jquery
                        ============================================ -->
            <script src="js/vendor/jquery-1.12.4.min.js"></script>
            <!-- bootstrap JS
                        ============================================ -->
            <script src="js/bootstrap.min.js"></script>
            <!-- wow JS
                        ============================================ -->
            <script src="js/wow.min.js"></script>
            <!-- price-slider JS
                        ============================================ -->
            <script src="js/jquery-price-slider.js"></script>
            <!-- meanmenu JS
                        ============================================ -->
            <script src="js/jquery.meanmenu.js"></script>
            <!-- owl.carousel JS
                        ============================================ -->
            <script src="js/owl.carousel.min.js"></script>
            <!-- sticky JS
                        ============================================ -->
            <script src="js/jquery.sticky.js"></script>
            <!-- scrollUp JS
                        ============================================ -->
            <script src="js/jquery.scrollUp.min.js"></script>
            <!-- mCustomScrollbar JS
                        ============================================ -->
            <script src="js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
            <script src="js/scrollbar/mCustomScrollbar-active.js"></script>
            <!-- metisMenu JS
                        ============================================ -->
            <script src="js/metisMenu/metisMenu.min.js"></script>
            <script src="js/metisMenu/metisMenu-active.js"></script>
            <!-- morrisjs JS
                        ============================================ -->
            <script src="js/sparkline/jquery.sparkline.min.js"></script>
            <script src="js/sparkline/jquery.charts-sparkline.js"></script>
            <!-- calendar JS
                        ============================================ -->
            <script src="js/calendar/moment.min.js"></script>
            <script src="js/calendar/fullcalendar.min.js"></script>
            <script src="js/calendar/fullcalendar-active.js"></script>
            <!-- tab JS
                        ============================================ -->
            <script src="js/tab.js"></script>
            <!-- plugins JS
                        ============================================ -->
            <script src="js/plugins.js"></script>
            <!-- main JS
                        ============================================ -->
            <script src="js/main.js"></script>
    </body>

</html>
