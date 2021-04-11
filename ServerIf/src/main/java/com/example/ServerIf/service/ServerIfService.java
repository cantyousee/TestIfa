package com.example.ServerIf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ServerIf.domain.ServerIf;
import com.example.ServerIf.repository.ServerIfRespository;


@Service
public class ServerIfService {
	
	@Autowired
    private ServerIfRespository repo;
	
	public List<ServerIf> listAll() {
        return repo.findAll();
    }
     
    public void save(ServerIf std) {
        repo.save(std);
    }
     
    public ServerIf get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
    
    public List<ServerIf> findUserid(long userid) {
        return repo.findByUserid(userid);
    }

	
}
