package dio.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping
	public String welcome() {
		return "Seja Bem-Vindo ao Boot Web API";
	}
	
	
	@GetMapping("/users")
	//@PreAuthorize("hasAnyRole('managers', 'users')")
	public String users() {
		return "Acesso Autorizado ao Usuário";
	}
	
	@GetMapping("/managers")
	//@PreAuthorize("hasAnyRole('managers')")
	public String managers() {
		return "Acesso Autorizado ao Managers";
	}
	

}
