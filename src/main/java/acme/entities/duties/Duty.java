
package acme.entities.duties;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.descriptor.Descriptor;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Duty extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@NotBlank
	private String				description;

	@NotNull
	private Double				percentage;

	/*
	 * @Transient
	 * public String getJobTitle() {
	 * return this.descriptor.getJob().getTitle();
	 * }
	 * 
	 * @Transient
	 * public String getJobId() {
	 * return this.descriptor.getJob().getTitle();
	 * }
	 */

	//relationships

	@NotNull
	@ManyToOne
	private Descriptor			descriptor;

}