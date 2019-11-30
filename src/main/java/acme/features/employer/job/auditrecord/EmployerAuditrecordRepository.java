
package acme.features.employer.job.auditrecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.auditrecords.Auditrecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface EmployerAuditrecordRepository extends AbstractRepository {

	@Query("select at from Auditrecord at where at.id = ?1")
	Auditrecord findOneAuditrecordById(int id);

	@Query("select at from Auditrecord at where at.job.id = ?1")
	Collection<Auditrecord> findManyByJobId(int jobId);
}
