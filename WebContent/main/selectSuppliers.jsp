<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select a Supplier</title>
</head>
<body>

<center>
<h1>Select the Supplier....</h1>
</center>

<f:view>
	<h:form>
		<h:selectOneMenu id="suppliers">
			<f:selectItems value="#{login.suppliers}" />
		</h:selectOneMenu>
		<h:commandButton value="Select" action="#{login.doSupplierSelected}" />
	</h:form>

	<hr />

	<h:dataTable border="1" value="#{login.suppliersVO}" var="supplier">
		<h:column>
			<f:facet name="header">
				<h:outputText value="ID" />
			</f:facet>
			<h:outputText value="#{supplier.id}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="Name" />
			</f:facet>
			<h:outputText value="#{supplier.name}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="City" />
			</f:facet>
			<h:outputText value="#{supplier.city}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="State" />
			</f:facet>
			<h:outputText value="#{supplier.state}" />
		</h:column>

		<h:column>
			<f:facet name="header">
				<h:outputText value="" />
			</f:facet>
		</h:column>
	</h:dataTable>

	<hr />



	<h:form>

	</h:form>


	<a4j:form ajaxSubmit="true" reRender="name">
			<h:panelGrid>
			<h:commandButton value="Select..." action="#{login.doConfirmSupplier}" />
			<h:outputText id="name" value="Name:#{login.username}" />
		</h:panelGrid>
	</a4j:form>



</f:view>


</body>
</html>