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
public class GroupDTO {
	
	@NotBlank(message = "{group.name.not-blank}")
	@UniqueRoleName(message = "This group role name can not be used.")
	private String name;
	
	@NotBlank(message = "{group.code.not-blank}")
	@UniqueRoleCode(message = "This group role code can not be used.")
	private String code;
	
	@NotBlank(message = "{group.description.not-blank}")
	private String description;
}
