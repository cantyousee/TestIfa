package com.example.ServerIf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ServerIf.domain.ServerIf;

@Repository
public interface ServerIfRespository extends JpaRepository<ServerIf, Long> {
	List<ServerIf> findByUserid(Long userid);
	}
