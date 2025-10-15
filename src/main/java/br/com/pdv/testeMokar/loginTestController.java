package br.com.pdv.testeMokar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class loginTestController {

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody loginTestModel test) {
		if("admin".equals(test.getUsername()) && "123".equals(test.getPassword())) {
			return ResponseEntity.ok("Login realizado com sucesso!");
		}else {
			return ResponseEntity.status(401).body("Usuário ou senha inválidos!");
		}
	}
}