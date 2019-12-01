
package acme.entities.descriptor;

import java.beans.Transient;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.duties.Duty;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				description;

	@NotNull
	@OneToMany
	private Collection<Duty>	duties;


	@Transient
	private String getDuties() {
		return this.duties.toString();
	}
}