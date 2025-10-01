package br.com.pdv.service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import br.com.pdv.dto.LoginDTO;
import br.com.pdv.dto.RegisterDTO;
import br.com.pdv.model.UserModel;
import br.com.pdv.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public ResponseEntity<String> register(RegisterDTO dto) {
		
		UserModel user = new UserModel();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setStore(dto.getStore());
		
		userRepository.save(user);
		
		return ResponseEntity.ok("Cadastro realizado com sucesso.");
	}
	
	public ResponseEntity<String> login(LoginDTO dto) {
		Optional<UserModel> user = userRepository.findByUsername(dto.getUsername());
		
		if(user.isPresent() && user.get().getPassword().equals(dto.getPassword())) {
			return ResponseEntity.ok("Login realizado.");
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário ou senha incorretos.");
	}
}
