package com.spring.DataExport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.DataExport.entity.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
}