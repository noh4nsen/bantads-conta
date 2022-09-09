package com.bantads.conta.bantadsconta.data.CUD;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bantads.conta.bantadsconta.model.CUD.ContaC;

public interface ContaCRepository extends JpaRepository<ContaC, UUID> { 
	
	@Query(value = "SELECT COALESCE(Max(c.numero), 0) FROM ContaC c")
	int maxNumero();
}
