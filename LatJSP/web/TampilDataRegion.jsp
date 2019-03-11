<%-- 
    Document   : indexRegion
    Created on : Mar 11, 2019, 2:44:33 PM
    Author     : FES
--%>

<%@page import="controllers.RegionController"%>
<%@page import="controllers.RegionControllerInterface"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tampil data Region</title>
        <%
            SessionFactory factory = HibernateUtil.getSessionFactory();
            RegionControllerInterface c = new RegionController(factory);
        %>
    </head>
    <body>
        <h1>Tampil Data</h1>
    </body>
</html>
