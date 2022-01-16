package cybersoft.javabackend.girajava14jr.security;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cybersoft.javabackend.girajava14jr.security.dto.CustomUserDetails;
import cybersoft.javabackend.girajava14jr.security.jwt.JwtUtils;

@SpringBootTest
public class JwtUtilsTest {

	@Autowired
	private JwtUtils utils;
	
	private Authentication validAuth;
	private Authentication invalidAuth;
	
	@PostConstruct
	public void setupTest() {
		List<GrantedAuthority>  authorities = new ArrayList<GrantedAuthority>();
		UserDetails user = new CustomUserDetails("testadmin", "testadmin", authorities);
		
		validAuth = new UsernamePasswordAuthenticationToken(
				user,
				null,
				null);
		
		invalidAuth = new UsernamePasswordAuthenticationToken(
				null,
				null,
				null);
	}
	
	@Test
	public void shouldInjectJwtUtilsSuccessfully() {
		assertNotEquals(utils, null);
	}
	
	@Test
	public void shouldGenerateJwtTokenSuccessfully() {
		String token = utils.generateJwtToken(validAuth);
		
		assertNotEquals(token, null);
	}
	
	@Test
	public void shouldThrowExceptionWhileGeneratingJwtToken() {
		
		assertThrows(NullPointerException.class, () -> {
			utils.generateJwtToken(invalidAuth);
		});
	}
	
	@Test
	public void shouldValidateCorrectToken() {
		String token = utils.generateJwtToken(validAuth);
		
		assertEquals(utils.validateJwtToken(token), true);
	}
	
	@Test
	public void shouldValidateInCorrectToken() {
		String token = "Anh Nam đẹp trai";
		
		assertEquals(utils.validateJwtToken(token), false);
	}
	
//	@Test
//	public void shouldNotPassValidateToken() {
//		String token = utils.generateJwtToken(invalidAuth);
//		
//		assertNotEquals(utils.validateJwtToken(token), false);
//	}
}
