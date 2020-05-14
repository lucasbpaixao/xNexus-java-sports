<%-- 
    Document   : detalharVenda
    Created on : 10/05/2020, 19:21:50
    Author     : lucas
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                                        <div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
                                            <div class="header-top-menu tabl-d-n">

                                            </div>
                                        </div>
                                        <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
                                            <div class="header-right-info">
                                                <ul class="nav navbar-nav mai-top-nav header-right-menu">
                                                    <li class="nav-item dropdown">




                                                        <div role="menu" class="admintab-wrap menu-setting-wrap menu-setting-wrap-bg dropdown-menu animated zoomIn">


                                                            <div class="tab-content custom-bdr-nt">
                                                                <div id="Notes" class="tab-pane fade in active">
                                                                    <div class="notes-area-wrap">

                                                                        <div class="notes-list-area notes-menu-scrollbar">



                                                                        </div>
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
                                                                                            <h2>Detalhar Vendas</h2>

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

                                                        <div class="container ml-5 mr-5" id="workspace">
                                                            <div class="product-status mg-b-30">
                                                                <div class="container-fluid">
                                                                    <div class="row">
                                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                                            
                                                                            <div class="product-status-wrap" style="color:white">
                                                                                
                                                                                <h4>Informações da Venda</h4>

                                                                                <br>
                                                                                <p><b>Id da Venda: </b> ${vendaDetalhada.idVenda}</p>
                                                                                <p><b>Nome do Cliente: </b> ${vendaDetalhada.nomeCliente}</p>
                                                                                <p><b>Nome da Filial: </b> ${vendaDetalhada.nomeFilial}</p>
                                                                                <p><b>Data Venda: </b> ${vendaDetalhada.dataVenda}</p>
                                                                                <p><b>Valor Total: </b> R$ ${vendaDetalhada.valorTotal}</p>
                                                                            </div>                                                                                
                                                                        </div>                                                                            
                                                                    </div>
                                                                    
                                                                    <div class="row">
                                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                                            <div class="product-status-wrap">
                                                                                <h4>Produtos Vendidos</h4>

                                                                                <table>
                                                                                    <thead>
                                                                                        <tr>
                                                                                            <th>Id da Produto</th>
                                                                                            <th>Nome do Produto</th>
                                                                                            <th>Marca</th>
                                                                                            <th>Preço</th>
                                                                                            <th>Quantidade Vendida</th>
                                                                                            <th>Valor Total</th>
                                                                                       </tr>
                                                                                    </thead>


                                                                                    <tbody>
                                                                                        <c:forEach items="${carrinho}" var="item">
                                                                                            <tr>

                                                                                                <td><c:out value="${item.idProduto}"/></td>
                                                                                                <td><c:out value="${item.nome}"/></td>
                                                                                                <td><c:out value="${item.marca}"/></td>
                                                                                                <td><c:out value="${item.preco}"/></td>
                                                                                                <td><c:out value="${item.quantidade}"/></td>
                                                                                                <td><c:out value="${item.valorTotalItem}"/></td>
                                                                                            </tr>
                                                                                        </c:forEach>
                                                                                    </tbody>

                                                                                </table>

                                                                                <div class="row m-t-xl">
                                                                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 mt-5">
                                                                                        <div class="text-right custom-pro-edt-ds">
                                                                                            
                                                                                           
                                                                                                <a href="VendasServlet?action=listarVendas" class="btn btn-ctl-bt waves-effect waves-light m-r-10">Voltar</a>
                                                                                            
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
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

                                                        <script src="js/classes/VendasViewJS.js"></script>
                                                        <script>
                                                                                    let vendasViewJS = new VendasViewJS();
                                                        </script>
                                                        </body>
                                                        </html>
