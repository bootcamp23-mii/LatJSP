<%-- 
    Document   : indexRegion
    Created on : Mar 11, 2019, 2:44:33 PM
    Author     : FES
--%>

<%@page import="models.Region"%>
<%@page import="java.util.List"%>
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
            List<Region> listRegion = c.getAll();
        %>
    </head>
    <body>
        <h1>Tampil Data</h1>
        <table>
            <tr>
                <th>No.</th>
                <th>ID</th>
                <th>Name</th>
            </tr>
            <%
                for (int i = 0; i < listRegion.size(); i++) {
            %>
            <tr>
                <td><%=i+1%></td>
                <td><%=listRegion.get(i).getId()%></td>
                <td><%=listRegion.get(i).getName()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <table>
            <tr>
                <th>No.</th>
                <th>ID</th>
                <th>Name</th>
            </tr>
            <%
                int index = 0;
                for (Region data : listRegion) {
            %>
            <tr>
                <td><%=index+1%></td>
                <td><%=data.getId()%></td>
                <td ><%=data.getName()%></td>
            </tr>
            <%
                index++;
                }
            %>
        </table>
    </body>
</html>
