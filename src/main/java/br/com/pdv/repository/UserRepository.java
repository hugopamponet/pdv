package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pdv.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String>{

}