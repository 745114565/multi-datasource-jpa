package com.example.demo.repository.primaryRepository;

import com.example.demo.domain.primaryDomain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * sun on 2017/6/22.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
