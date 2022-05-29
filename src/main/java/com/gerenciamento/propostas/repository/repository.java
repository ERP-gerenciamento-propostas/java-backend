package com.gerenciamento.propostas.repository;

import com.gerenciamento.propostas.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<Test, Long> {

}
