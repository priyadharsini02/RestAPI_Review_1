package com.example.inventorycrud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventorycrud1.model.InventoryEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer>{
	

}