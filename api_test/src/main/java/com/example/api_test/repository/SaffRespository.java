package com.example.api_test.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_test.entity.Saff;
@Repository
public interface SaffRespository extends JpaRepository<Saff, Integer>{

}
