package com.techprimers.springbatchexemple.repository;

import com.techprimers.springbatchexemple.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {


}
