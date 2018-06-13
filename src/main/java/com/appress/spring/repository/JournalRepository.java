package com.appress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appress.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {
	
}
