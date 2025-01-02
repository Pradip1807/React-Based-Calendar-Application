package com.entnt.calendar.repository;


import com.entnt.calendar.entity.Communication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<Communication, Long> {}
