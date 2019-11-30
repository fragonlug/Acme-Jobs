<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="employer.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="employer.job.form.label.title" path="title"/>
	<acme:form-moment code="employer.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="employer.job.form.label.salary" path="salary"/>
	<acme:form-money code="employer.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textbox code="employer.job.form.label.description" path="description"/>
	
	<acme:menu-bar code="employer.job">
		<acme:menu-option code="employer.job.auditrecord" action="/employer/job/auditrecord/list_mine">
	</acme:menu-option></acme:menu-bar>

	<acme:form-return code="employer.job.form.label.button.return"/>
</acme:form>