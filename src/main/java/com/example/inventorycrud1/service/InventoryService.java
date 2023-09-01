package com.example.inventorycrud1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorycrud1.model.InventoryEntity;
import com.example.inventorycrud1.repository.InventoryRepository;

@Service
public class InventoryService {
	@Autowired
	InventoryRepository ir;
	
	//post
	public InventoryEntity saveinfo(InventoryEntity ie) {
		return ir.save(ie);
	}
	
	public List<InventoryEntity> savedetails(List<InventoryEntity> ie){
		return (List<InventoryEntity>)ir.saveAll(ie);
	}
	
	//get
	public List<InventoryEntity> showinfo(){
		return ir.findAll();
	}
	public Optional<InventoryEntity> showinfo(int id){
		return ir.findById(id);
	}
	//get by id
	public Optional<InventoryEntity> showbyid(int id){
		return ir.findById(id);
	}
	
	//update
	public InventoryEntity changeinfo(InventoryEntity ie) {
		return ir.saveAndFlush(ie);
	}
	
	public String updateinfobyid(int id,InventoryEntity ie) {
		ir.saveAndFlush(ie);
		if(ir.existsById(id)) {
			return "UPDATED";
		}
		else {
			return "Enter valid id";
		}
	}
	
	//delete
	public void deleteinfo(InventoryEntity ie) {
		ir.delete(ie);
	}
	
	//deleteAll
	public void deleteall() {
		ir.deleteAll();
	}
	
	//delete by id pathvariable
	public void deleteid(int id) {
		ir.deleteById(id);
	}
	//request par
	public void deletepid(int id) {
		ir.deleteById(id);
	}

	
}
