<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:loadBundle basename="br.com.neb.resource.MessageResources" var="msg" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<f:view>
	<h:form>
		<h:outputLabel value="#{msg.login_username}"/>: <h:inputText value="#{loginHandler.user.username}"/> <br>
		<h:outputLabel value="#{msg.login_password}"/>: <h:inputSecret value="#{loginHandler.user.password}" /> <br>
		<h:commandButton value="#{msg.button_ok}" action="#{loginHandler.doAuthentication}" />
	</h:form>
</f:view>


</body>
</html>