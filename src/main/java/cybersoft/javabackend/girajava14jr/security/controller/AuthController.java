package cybersoft.javabackend.girajava14jr.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface AuthController {
	
	@Operation(method = "post", description = "verify fake token")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "verify token successfully"),
			@ApiResponse(responseCode = "403", description = "do not have the correct authorization")
	})
	@PostMapping(value = "/api/verify-token", produces = "application/json")
	public ResponseEntity<Object> verifyFakeToken(@RequestBody String token);
}