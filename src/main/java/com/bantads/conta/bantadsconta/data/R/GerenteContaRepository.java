package com.bantads.conta.bantadsconta.data.R;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bantads.conta.bantadsconta.model.R.GerenteConta;

public interface GerenteContaRepository extends JpaRepository<GerenteConta, UUID> {

	@Query(value="select * from gerenteconta gc order by gc.quantidadecontas desc limit 5", nativeQuery=true)
	List<GerenteConta> obtemTopCinco();
}
