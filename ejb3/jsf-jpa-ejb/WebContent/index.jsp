<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>GlassFish JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
  </body>
  
  
  <%
	HttpSession httpSession = request.getSession();
	out.println("Session ID: " + httpSession.getId()+ "<br />");
	 
	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");
	String created = formatter.format(httpSession.getCreationTime());
	out.println("Session created: " + created + "<br />");
	 
	String lastAccess = formatter.format(httpSession.getLastAccessedTime());
	out.println("Session last access: " + lastAccess + "<br />");
	 
	out.println("Server Request: " + request.getServerName() + "<br />");
	out.println("Server Instance executing: " + System.getProperty("com.sun.aas.instanceName") + "(" + java.net.InetAddress.getLocalHost().getHostName() + ")" +"<br />");
	 
	%>
  
</html> 
