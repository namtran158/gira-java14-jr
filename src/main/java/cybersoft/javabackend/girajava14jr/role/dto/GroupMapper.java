package cybersoft.javabackend.girajava14jr.role.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.girajava14jr.role.model.GroupRole;

@Mapper
public interface GroupMapper {
	GroupMapper INSTANCE = Mappers.getMapper(GroupMapper.class);
	
	GroupDTO fromEntityToGroupDTO(GroupRole group);
}
