# Servlet Mapping
Servlet을 외부에서 요청하기 쉽도록 특정 문자를 이용해서 맵힝하는 방법에 대해 학습  
1. Servlet Mapping 이란?
2. web.xml 파일을 이용한 Mapping
3. Java Annotation을 이용한 Mapping  

## Servlet Mapping 이란?
요청에 따른 특정한 Servlet을 지정해주는 것.  
여러 개의 Servlet에서 특정 Servlet을 구분하는 방법이 있다.  
* full path
`http://localhost:8090/lec08oht001/Servlet/com.servlet.ServletEx`  
보안에 취약하고, 복잡한 URL을 가진다.
* mapping path
`http://localhost:8090/lec08oht001/SE`  
훨씬 간결하고 보안성을 가진다.  

Servlet을 Mapping 하는 방법은 두 가지가 있다.
1. web.xml 파일을 이용
2. Java Annotation을 이용 (추천)  


# Servlet request, response
사용자의 요청과 웹서버의 응답을 담당하는 객체에 대해서 학습한다.
1. HttpServlet
1. HttpServletRequest
1. HttpServletResponse
