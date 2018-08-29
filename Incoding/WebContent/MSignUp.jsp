<% request.setCharacterEncoding("UTF-8"); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <%!
        String mName;
        String mNick;
        %>
        
        <%
        mName = request.getParameter("mName");
        mNick = request.getParameter("mNick");
        %>
        
		이름 : <%=mName %> <br>
    	별명 : <%=mNick %> <br>
    </body>
</html>