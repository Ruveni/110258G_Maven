<%-- 
    Document   : result
    Created on : Sep 7, 2013, 7:34:45 PM
    Author     : Ruveni
--%>
<%@page import="nicApp.CalValues"%>
<%@page import="nicApp.NicException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MyResults</title>
    </head>
    <body>
        <h1><b>Result of the Nic interpretation </b></h1>
        <%
            CalValues cal=new CalValues();
            String nic=request.getParameter("Nic");
            String res=cal.calValue(nic);
            out.println(res);
        %>
    </body>
</html>
