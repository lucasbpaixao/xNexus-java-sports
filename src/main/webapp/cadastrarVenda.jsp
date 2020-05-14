<%-- 
    Document   : cadastrarVenda
    Created on : 30/04/2020, 23:13:08
    Author     : lucas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8" lang="pt-br">
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
                            <a href="index.html"><img class="main-logo" src="img/logo/logo.png" alt="" /></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-advance-area">
                <div class="header-top-area">

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
                                                        <h2>Cadastrar Vendas</h2>

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
                <br/>
                <br/>
                <br/>
                <br/>
                <br/>
                <br/>

                <!-- Single pro tab start-->

                <div class="container ml-5 mr-5" id="workspace">
                    <div class="single-product-tab-area mg-b-30">
                        <!-- Single pro tab review Start-->
                        <div class="single-pro-review-area">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="review-tab-pro-inner">

                                            <form action="VendasServlet?action=adicionarAoCarrinho" method="post">
                                                <div id="myTabContent" class="tab-content custom-product-edit">
                                                    <div class="product-tab-list tab-pane fade active in" id="description">                                                               
                                                        <div class="row">
                                                            <ul id="myTab3" class="tab-review-design">
                                                                <li class="active"><a href="#description"><i class="icon nalika-edit" aria-hidden="true"></i> Informações Venda</a></li>

                                                            </ul>
                                                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                                <div class="review-content-section">


                                                                    <div class="input-group mg-b-pro-edt">
                                                                        <span class="input-group-addon"><i class="icon nalika-user" aria-hidden="true"></i></span>
                                                                        <input type="number" class="form-control" name="idFilial" placeholder="Id da filial" value="${idFilial}" required="true" min="1">
                                                                    </div>

                                                                    <div class="input-group mg-b-pro-edt">
                                                                        <span class="input-group-addon"><i class="icon nalika-edit" aria-hidden="true"></i></span>
                                                                        <input type="number" class="form-control" id="idCliente" name="cpfCliente" placeholder="CPF do cliente" value="${cpfCliente}" required="true" min="1">
                                                                    </div>

                                                                </div>

                                                            </div>
                                                        </div>


                                                    </div>

                                                    <br>

                                                </div>

                                                <div class="row">
                                                    <ul id="myTab3" class="tab-review-design">
                                                        <li class="active"><a href="#description"><i class="icon nalika-edit" aria-hidden="true"></i> Informações Produto</a></li>

                                                    </ul>
                                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                        <div class="review-content-section">

                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-edit" aria-hidden="true"></i></span>
                                                                <select name="idProduto" class="form-control pro-edt-select form-control-primary" required="true">
                                                                    <option value="">Selecione um produto</option>
                                                                    <c:forEach var="produto" items="${produtos}">
                                                                        <option value="${produto.codigo}">${produto.codigo} - ${produto.nomeProduto} - ${produto.marca}</option>

                                                                    </c:forEach>
                                                                </select>
                                                            </div>

                                                            <div class="input-group mg-b-pro-edt">
                                                                <span class="input-group-addon"><i class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                                <input type="number" class="form-control" name="quantidadeVendida" placeholder="Quantidade" required="true" min="1">
                                                            </div>

                                                            <div class="input-group mg-b-pro-edt">

                                                            </div>

                                                        </div>

                                                    </div>
                                                </div>

                                                <br>

                                                <div class="row">
                                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                        <div class="text-center custom-pro-edt-ds">
                                                            <button type="submit" class="btn btn-ctl-bt waves-effect waves-light m-r-10">Adicionar no carrinho 
                                                            </button>
                                                            <button type="button" class="btn btn-ctl-bt waves-effect waves-light">Limpar
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                                <form/>
                                        </div>

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
                                        <h4>Lista de produtos adicionado no carrinho </h4>

                                        <table>

                                            <thead>
                                                <tr>
                                                    <th>Id</th>
                                                    <th>Nome do produto</th>
                                                    <th>Marca</th>
                                                    <th>Preço</th>
                                                    <th>Quantidade do produto</th>
                                                    <th>Retirar Item</th>

                                                </tr>
                                            </thead>

                                            <tbody>
                                                <c:forEach items="${carrinho}" var="item">
                                                    <tr id="${item.idItemCarrinho}">

                                                        <td name="codigo${item.idItemCarrinho}"><c:out value="${item.idProduto}"/></td>

                                                        <td name="nome${item.idItemCarrinho}"><c:out value="${item.nome}"/></td>
                                                        <td name="nome${item.idItemCarrinho}"><c:out value="${item.marca}"/></td>
                                                        <td name="preco${item.idItemCarrinho}"><c:out value="R$ ${item.preco}"/></td>
                                                        <td name="quantidade${item.idItemCarrinho}"><c:out value="${item.quantidade}"/></td>

                                                        <td>
                                                                <!--<button data-toggle="tooltip" title="Trash" class="pd-setting-ed" type="submit"><i class="fa fa-trash-o" aria-hidden="true"></i></button>-->
                                                                <a data-toggle="tooltip" title="Trash" class="pd-setting-ed" href="VendasServlet?id=${item.idItemCarrinho}&action=excluir"><i class="fa fa-trash-o" aria-hidden="true"></i></a>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            <br/>
                                            <tr>
                                            <h4 style="color:white">Valor Total: R$ ${valorTotal}</h4>
                                            </tr>
                                            </tbody>
                                        </table>

                                        <br/>
                                        <div class="row">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="text-center custom-pro-edt-ds">
                                                    <form action="VendasServlet?action=salvarVenda" method="post">

                                                        <a href="VendasServlet?action=salvarVenda"class="btn btn-ctl-bt waves-effect waves-light m-r-10">Salvar Venda
                                                        </a>
                                                    </form>
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
