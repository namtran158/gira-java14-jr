package cybersoft.javabackend.girajava14jr.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter {
	
	@Autowired
	private JwtUtils utils;
	
	@Autowired
	private UserDetailsService service;

	@Override
	protected void doFilterInternal(HttpServletRequest request, 
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			String token = utils.getJwtTokenFromRequest(request);
			
			if(token != null && utils.validateJwtToken(token)) {
				String username = utils.getUsernameFromToken(token);
				
				UserDetails user = service.loadUserByUsername(username);
				Authentication auth = new UsernamePasswordAuthenticationToken(username, null, user.getAuthorities());
			
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		} catch(UsernameNotFoundException e) {
			logger.debug("Có xâm nhập bất hợp lệ !!!! {}", e);
		}
		
		filterChain.doFilter(request, response);
	}

}
