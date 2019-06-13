<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/7
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

    <base href="<%=basePath%>">

    <link rel="StyleSheet" href="css/jpetstore.css" type="text/css"
          media="screen" />

    <meta name="generator"
          content="HTML Tidy for Linux/x86 (vers 1st November 2002), see www.w3.org" />
    <title>JPetStore Demo</title>
    <meta content="text/html; charset=windows-1252"
          http-equiv="Content-Type" />
    <meta http-equiv="Cache-Control" content="max-age=0" />
    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT" />
    <meta http-equiv="Pragma" content="no-cache" />
</head>

<body>

<div id="Header">

    <div id="Logo">
        <div id="LogoContent">
            <a href="main"><img src="images/logo-topbar.gif" /></a>
        </div>
    </div>

    <div id="Menu">
        <div id="MenuContent">
            <a href="viewCart"><img align="middle" name="img_cart" src="images/cart.gif" /></a>
            <img align="middle" src="images/separator.gif" />
            <c:if test="${account==null}">
                <a href="viewSignon"><s:text name="sign" /></a>
                <img align="middle" src="images/separator.gif" />
            </c:if>
            <c:if test="${account!=null}">
                <a href="signoff">Sign out</a>
                <img align="middle" src="images/separator.gif" />
                <a href="viewAccount?username=${account.username}"><s:text name="myAccount" /></a>
                <img align="middle" src="images/separator.gif" />
            </c:if>
            <a href="help">?</a>
        </div>
    </div>

    <div id="Search">
        <div id="SearchContent">
            <form action="searchProducts" method="post">
                <input type="text" name="keyword" size="14" />
                <input type="submit" name="searchProducts" value="<s:text name="search" />"/>

                <s:i18n name="globalMessages">
                    <a href="main?request_locale=zh_CN"><span style="color: goldenrod; font-size: 15px;  position: absolute; right:150px "><s:text name="chinese"></s:text></span></a>
                    <a href="main?request_locale=en_US"><span style="color: goldenrod; font-size: 15px;  position: absolute; right:200px "><s:text name="english"></s:text></span></a>
                </s:i18n>

            </form>
        </div>
    </div>

    <div id="QuickLinks">
        <a href="viewCategory?categoryID=FISH">
            <img src="images/sm_fish.gif" />
        </a>
        <img src="images/separator.gif" />
        <a href="viewCategory?categoryID=DOGS">
            <img src="images/sm_dogs.gif" />
        </a>
        <img src="images/separator.gif" />
        <a href="viewCategory?categoryID=REPTILES">
            <img src="images/sm_reptiles.gif" />
        </a>
        <img src="images/separator.gif" />
        <a href="viewCategory?categoryID=CATS">
            <img src="images/sm_cats.gif" />
        </a>
        <img src="images/separator.gif" />
        <a href="viewCategory?categoryID=BIRDS">
            <img src="images/sm_birds.gif" />
        </a>
    </div>

</div>

<div id="Content">