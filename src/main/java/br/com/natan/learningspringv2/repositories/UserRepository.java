package br.com.natan.learningspringv2.repositories;

import br.com.natan.learningspringv2.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
