package com.bantads.conta.bantadsconta.data.R;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bantads.conta.bantadsconta.model.R.ContaR;

import java.util.UUID;

public interface ContaRRepository extends JpaRepository<ContaR, UUID> {
}
