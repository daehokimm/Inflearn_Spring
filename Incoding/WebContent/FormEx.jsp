<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="EUC-KR">
        <title>Insert title here</title>
    </head>
    <body>
        <form action="MSignUp.jsp" method="post">
        	이름 : <input type="text" name="mName"><br>
        	별명 : <input type="text" name="mNick"><br>
        	<input type="submit" value="Sign up">
        </form>
        
        <form action="MSignUp.jsp" method="get">
        	이름 : <input type="text" name="mName"><br>
        	별명 : <input type="text" name="mNick"><br>
        	<input type="submit" value="Sign up">
        </form>
    </body>
</html>