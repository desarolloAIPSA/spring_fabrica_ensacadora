package com.paramonga.ssff.repositories;

import com.paramonga.ssff.entities.EnsacadoraMaestro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnsacadoraMaestroRepository extends JpaRepository<EnsacadoraMaestro,String> {

}
