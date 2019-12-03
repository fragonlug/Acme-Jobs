<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textarea code="authenticated.job.form.label.reference" path="reference"/>
	<acme:form-textbox code="authenticated.job.form.label.title" path="title"/>
	<acme:form-moment code="authenticated.job.form.label.deadline" path="deadline"/>
	<acme:form-money code="authenticated.job.form.label.salary" path="salary"/>
	<acme:form-money code="authenticated.job.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textbox code="authenticated.job.form.label.descriptor" path="descriptorDescription"/>
	<jstl:set var="id" value="${descriptorId}"/>
	<jstl:set var="idJob" value="${id}"/>
	<h4><acme:menu-suboption code="authenticated.job.form.label.duties" action="/authenticated/duty/list?id=${id}"/></h4>
  	<h4><acme:menu-suboption code="authenticated.job.form.label.auditRecords" action="/authenticated/auditrecord/list_mine?id=${idJob}"/></h4>
	



	<acme:form-return code="authenticated.job.form.label.button.return"/>
</acme:form>