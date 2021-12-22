package cybersoft.javabackend.girajava14jr.role.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;
import cybersoft.javabackend.girajava14jr.role.service.RoleService;

@RestController
public class RoleControllerImpl implements RoleController {
	
	private RoleService service;
	
	public RoleControllerImpl(RoleService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<List<RoleDTO>> getRoles() {
		List<RoleDTO> roles = service.findAllDTO();
		
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> createRoles(RoleDTO dto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
		}
		
		RoleDTO createdRole = service.create(dto);
		return new ResponseEntity<>(createdRole, HttpStatus.OK);
	}

}
