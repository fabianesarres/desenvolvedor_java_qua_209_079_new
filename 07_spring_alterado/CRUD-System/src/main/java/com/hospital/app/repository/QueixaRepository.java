package com.hospital.app.repository;

import com.hospital.app.model.Queixa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueixaRepository extends JpaRepository<Queixa, Long> {
}
