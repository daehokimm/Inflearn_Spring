<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="EUC-KR">
        <title>Insert title here</title>
    </head>
    <body>
    	
    	<%
    	if(session.getAttribute("memberId") != null){
    		response.sendRedirect("loginOk.jsp");
    	}
    	%>
    	
        <form action="loginConf" method="post">
        	ID : <input type="text" name="mID">
        	PW : <input type="password" name="mPW">
        	<input type="submit" value="login">
        </form>
    </body>
</html>