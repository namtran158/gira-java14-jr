package cybersoft.javabackend.girajava14jr.role.dto;

import java.util.UUID;

public interface GroupProjection {
	UUID getId();
	String getName();
	String getCode();
	String getDescription();
	UUID   getUserId();
	String getUsername();
	String getEmail();
	String getFullname();
}
