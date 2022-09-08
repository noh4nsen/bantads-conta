package com.bantads.conta.bantadsconta.data.R;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bantads.conta.bantadsconta.model.R.GerenteConta;

public interface GerenteContaRepository extends JpaRepository<GerenteConta, UUID> {

}
