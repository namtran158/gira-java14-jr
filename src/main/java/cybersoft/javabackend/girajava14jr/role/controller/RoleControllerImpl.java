package cybersoft.javabackend.girajava14jr.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.girajava14jr.common.ResponseHandler;
import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;
import cybersoft.javabackend.girajava14jr.role.dto.UpdateRoleDTO;
import cybersoft.javabackend.girajava14jr.role.service.RoleService;

@RestController
public class RoleControllerImpl implements RoleController {
	
	private RoleService service;
	
	public RoleControllerImpl(RoleService roleService) {
		this.service = roleService;
	}
	
	@Override
	public ResponseEntity<Object> getRoles() {
		List<RoleDTO> roles = service.findAllDTO();
		
		return ResponseHandler.getResponse(roles, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> createRole(RoleDTO dto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return ResponseHandler.getErrorResponse(bindingResult, HttpStatus.BAD_REQUEST);
		}
		
		RoleDTO createdRole = service.create(dto);
		
		return ResponseHandler.getResponse(createdRole, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> updateRole(long id, @Valid UpdateRoleDTO dto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return ResponseHandler.getErrorResponse(bindingResult, HttpStatus.BAD_REQUEST);
		}
		
		RoleDTO updateRole = service.updateRole(id, dto);
		
		return ResponseHandler.getResponse(updateRole, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> deleteRole(long id) {
		
		service.deleteRole(id);
		
		return ResponseHandler.getResponse("Deleted role successfully", HttpStatus.OK);
	}

}
