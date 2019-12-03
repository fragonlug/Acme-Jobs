<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="notauditor.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="notauditor.job.form.label.title" path="title"/>
	<acme:form-moment code="notauditor.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="notauditor.job.form.label.salary" path="salary"/>
	<acme:form-money code="notauditor.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textbox code="notauditor.job.form.label.descriptor" path="descriptorDescription"/>
	
	<acme:form-return code="notauditor.job.form.label.button.return"/>
</acme:form>