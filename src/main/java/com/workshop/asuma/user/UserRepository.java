package com.workshop.asuma.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Person,Integer> {

    Optional<Person> findByEmail(String email);

}
