package com.fse.assignment.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.assignment.springboot.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
