
package acme.features.administrator.companyrecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.companyrecords.Companyrecord;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractCreateService;

@Service
public class AdministratorCompanyRecordsCreateService implements AbstractCreateService<Administrator, Companyrecord> {

	@Autowired
	AdministratorCompanyRecordsRepository repository;


	@Override
	public boolean authorise(final Request<Companyrecord> request) {
		assert request != null;
		boolean b = request.getPrincipal().hasRole(Administrator.class);
		return b;
	}

	@Override
	public void bind(final Request<Companyrecord> request, final Companyrecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Companyrecord> request, final Companyrecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "sector", "ceo", "description", "website", "phone", "email", "incorporated", "numberStars");
	}

	@Override
	public Companyrecord instantiate(final Request<Companyrecord> request) {
		Companyrecord result;
		result = new Companyrecord();
		return result;
	}

	@Override
	public void validate(final Request<Companyrecord> request, final Companyrecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Companyrecord> request, final Companyrecord entity) {
		this.repository.save(entity);
	}

}
