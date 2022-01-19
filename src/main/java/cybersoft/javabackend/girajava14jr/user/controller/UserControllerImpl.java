package cybersoft.javabackend.girajava14jr.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.girajava14jr.common.ResponseHandler;
import cybersoft.javabackend.girajava14jr.user.dto.CreateUserDTO;
import cybersoft.javabackend.girajava14jr.user.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserControllerImpl implements UserController {
	
	@Autowired
	private UserService service;
	
	@Override
	public ResponseEntity<Object> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> createUser(@Valid CreateUserDTO dto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return ResponseHandler.getErrorResponse(bindingResult, HttpStatus.BAD_REQUEST);
		}
		log.debug("=====createUser=====");
		log.debug("=====START=====");
		log.debug("CreateUserDTO: {}", dto);
		
		CreateUserDTO createdUser = service.create(dto);
		
		log.debug("=====createUser=====");
		log.debug("=====END=====");
		log.debug("Result ==>> : {}", createdUser);
		
		return ResponseHandler.getResponse(createdUser, HttpStatus.OK);
	}

}
