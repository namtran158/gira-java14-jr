package cybersoft.javabackend.girajava14jr.role.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDTO {
	private long id;
	@NotBlank(message = "Role name can not be blank.")
	private String name;
	@NotBlank(message = "Role code can not be blank.")
	private String code;
	@NotBlank(message = "Role description can not be blank.")
	private String description;
}
