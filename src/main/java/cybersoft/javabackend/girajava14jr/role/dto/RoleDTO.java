package cybersoft.javabackend.girajava14jr.role.dto;

import javax.validation.constraints.NotBlank;

import cybersoft.javabackend.girajava14jr.role.validation.annotation.UniqueRoleCode;
import cybersoft.javabackend.girajava14jr.role.validation.annotation.UniqueRoleName;
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
	
	@NotBlank(message = "{role.name.not-blank}")
	@UniqueRoleName(message = "This role name can not be used.")
	private String name;
	
	@NotBlank(message = "{role.code.not-blank}")
	@UniqueRoleCode(message = "This role code can not be used.")
	private String code;
	
	@NotBlank(message = "{role.description.not-blank}")
	private String description;
}
