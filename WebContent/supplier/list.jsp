<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<f:subview id="view_list_supplier">
	<h:dataTable border="1" value="#{supplierHandler.suppliers}" var="sup">
		<h:column>
			<f:facet name="header">
				<h:outputText value="ID" />
			</f:facet>
			<h:outputText value="#{sup.id}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Name" />
			</f:facet>
			<h:outputText value="#{sup.name}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="City" />
			</f:facet>
			<h:outputText value="#{sup.city}" />
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Credit Card" />
			</f:facet>
			<h:outputText value="#{sup.cc.number}" />
		</h:column>		
		<h:column>
			<f:facet name="header">
				<h:outputText value="Action" />
			</f:facet>
			<h:form>
				<h:commandButton value="Remove" actionListener="#{supplierHandler.doRemove}">
					<f:param id="_id_supplier_remove" value="#{sup.id}" />
				</h:commandButton>
			</h:form>
		</h:column>
		<h:column>
			<f:facet name="header">
				<h:outputText value="Edit" />
			</f:facet>
			<h:form>
				<h:commandLink actionListener="#{supplierHandler.doLoad}" value="Edit">
					<f:param id="_id_supplier_edit" name="_id_supplier_edit" value="#{sup.id}" />
				</h:commandLink>
			</h:form>
		</h:column>
	</h:dataTable>

</f:subview>