<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="EUC-KR">
        <title>Insert title here</title>
    </head>
    <body>
        <%!
        String adminId;
        String adminPw;
        
        String imgDir;
        String testServerIP;
        String realServerIP;
        String connectedIP;
        
        String str;
        %>
        
        <%-- application setting --%>
        <%
        application.setAttribute("connectedIP", "12.34.56.78");
        %>
        
        <%
        adminId = config.getInitParameter("adminId");
      	adminPw = config.getInitParameter("adminPw");
        
      	imgDir = application.getInitParameter("imgDir");
      	testServerIP = application.getInitParameter("testServerIP");
      	realServerIP = application.getInitParameter("realServerIP");
        
      	connectedIP = (String)application.getAttribute("connectedIP");
        %>
        

        
        <p>adminId : <%=adminId %></p>
        <p>adminPw : <%=adminPw %></p>
        
        <p>imgDir : <%=imgDir %></p>
        <p>testServerIP : <%=testServerIP %></p>
        <p>realServerIP : <%=realServerIP %></p>
        <p>connectedIP : <%=connectedIP %></p>
        
        <%-- 
        <%
        	out.print(str.toString());
        %>
        --%>
    </body>
</html>