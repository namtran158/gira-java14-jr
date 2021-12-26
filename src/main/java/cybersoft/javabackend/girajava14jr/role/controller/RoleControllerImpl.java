package cybersoft.javabackend.girajava14jr.role.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.girajava14jr.common.ResponseHandler;
import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;
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
			return ResponseHandler.getResponse(bindingResult, HttpStatus.BAD_REQUEST);
		}
		
		RoleDTO createdRole = service.create(dto);
		return ResponseHandler.getResponse(createdRole, HttpStatus.OK);
	}

}
