package com.example.FirstSpringJPAProject.DAO;

import com.example.FirstSpringJPAProject.model.Baller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallerDAO extends JpaRepository<Baller,Integer> {
}
