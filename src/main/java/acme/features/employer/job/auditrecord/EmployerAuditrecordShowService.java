
package acme.features.employer.job.auditrecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditrecords.Auditrecord;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class EmployerAuditrecordShowService implements AbstractShowService<Employer, Auditrecord> {

	@Autowired
	EmployerAuditrecordRepository repository;


	@Override
	public boolean authorise(final Request<Auditrecord> request) {
		assert request != null;

		boolean result;
		int AuditrecordId;
		Auditrecord Auditrecord;
		Employer employer;
		Principal principal;

		AuditrecordId = request.getModel().getInteger("id");
		Auditrecord = this.repository.findOneAuditrecordById(AuditrecordId);
		employer = Auditrecord.getJob().getEmployer();
		principal = request.getPrincipal();
		result = Auditrecord.getJob().isFinalMode() || !Auditrecord.getJob().isFinalMode() && employer.getId() == principal.getActiveRoleId();
		return result;
	}

	@Override
	public void unbind(final Request<Auditrecord> request, final Auditrecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "status", "moment", "body", "job");
	}

	@Override
	public Auditrecord findOne(final Request<Auditrecord> request) {
		assert request != null;

		Auditrecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneAuditrecordById(id);
		return result;
	}

}
