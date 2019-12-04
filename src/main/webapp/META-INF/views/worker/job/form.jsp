<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="worker.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="worker.job.form.label.title" path="title"/>
	<acme:form-moment code="worker.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="worker.job.form.label.salary" path="salary"/>
	<acme:form-money code="worker.job.form.label.moreInfo" path="moreInfo"/>
	<jstl:set var="id" value="${id}"/>
	<h4><acme:menu-suboption code="worker.auditrecord.form.label.listAuditrecord" action="/worker/auditrecord/list_mine?id=${id}"/></h4>
	
	



	<acme:form-return code="worker.job.form.label.button.return"/>
</acme:form>