package com.bantads.conta.bantadsconta.data.R;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bantads.conta.bantadsconta.model.R.MovimentacaoR;


public interface MovimentacaoRRepository extends JpaRepository<MovimentacaoR, UUID> {

	List<MovimentacaoR> findByDataHoraBetween(Date startDate, Date endDate);
}
