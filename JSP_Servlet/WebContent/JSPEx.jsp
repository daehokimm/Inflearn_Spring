<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="EUC-KR">
        <title>Insert title here</title>
    </head>
    <body>
    
    	<!--  HTML 주석 -->
		<%-- JSP 주석 --%>
	
		<%-- 지시어 --%>
		<%@include file="header.jsp" %>
			
        <%!
        int num = 10;
       	String str = "I Hate Mosiquito!!!";
       	ArrayList<String> list = new ArrayList<String>();
       	
       	public void jspMethod(){
       		System.out.println(str);
       	}
        
        %>
    
    	<%-- 스크립트릿 태그 --%>
    	<%
    	if(num>0){
       	%>
       	<p> num > 0 </p>
       	<%
       	}else{ 
       	%>
       	<p> num <= 0 </p>
       	<%
       	}
       	%>
       	
       	<%-- 표현식 태그 --%>
       	<p>num is <%=num %></p>
       	
       	<%@include file="footer.jsp" %>	
       	
    </body>
</html>