<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
	<h:form>
		<h:outputLabel value="#{msg.login_username}"/>: <h:inputText value="#{loginHandler.user.username}"/> <br>
		<h:outputLabel value="#{msg.login_password}"/>: <h:inputSecret value="#{loginHandler.user.password}" /> <br>
		<h:commandButton value="#{msg.button_ok}" action="#{loginHandler.doAuthentication}" />
	</h:form>
</f:view>