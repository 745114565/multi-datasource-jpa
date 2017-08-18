package com.example.demo.repository.secondRepository;

import com.example.demo.domain.secondDomain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * sun on 2017/6/22.
 */
public interface MessageRepository extends JpaRepository<Message,Long>{
}
