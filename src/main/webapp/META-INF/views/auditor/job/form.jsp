<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="auditor.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="auditor.job.form.label.title" path="title"/>
	<acme:form-moment code="auditor.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="auditor.job.form.label.salary" path="salary"/>
	<acme:form-money code="auditor.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textbox code="auditor.job.form.label.descriptor" path="descriptorDescription"/>
	<jstl:set var="id" value="${id}"/>
	<h4><acme:menu-suboption code="auditor.auditrecord.form.label.listAuditrecord" action="/auditor/auditrecord/list_mine?id=${id}"/></h4>
	
	
	<acme:form-return code="auditor.job.form.label.button.return"/>
</acme:form>