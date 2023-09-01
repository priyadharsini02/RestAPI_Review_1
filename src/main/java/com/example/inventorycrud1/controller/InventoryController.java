package com.example.inventorycrud1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventorycrud1.model.InventoryEntity;
import com.example.inventorycrud1.service.InventoryService;


@RestController
public class InventoryController {
	@Autowired
	InventoryService is;
	
	@PostMapping("additems")
	public InventoryEntity add(@RequestBody InventoryEntity ie) {
		return is.saveinfo(ie);
	}
	@PostMapping("addnitems")
	public List<InventoryEntity> addndetails(@RequestBody List<InventoryEntity> ie){
		return is.savedetails(ie);
	}
	
	@GetMapping("showdetails")
	public List<InventoryEntity> show(){
		return is.showinfo();
		
	}
	//show by id
	@GetMapping("showdetbyid/{id}")
		public Optional<InventoryEntity> showid(@PathVariable int id){
			return is.showbyid(id);
		}
	
	@PutMapping("update")
	public InventoryEntity modify(@RequestBody InventoryEntity ie ) {
		return is.changeinfo(ie);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody InventoryEntity ie) {
		return is.updateinfobyid(id,ie);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody InventoryEntity ie) {
			is.deleteinfo(ie);
			return "Deleted successfully";
		}
	
	@DeleteMapping("deletealldetail")
	public String delall() {
		is.deleteall();
		return "Deleted all";
	}
	
	//pathvariable example
	@DeleteMapping("delid/{id}")
	public String deletemyid(@PathVariable int id) {
		is.deleteid(id);
		return "Deleted";
	}
	//req param example
	@DeleteMapping("delparamid")
	public String deletemyparamid (@RequestParam int id) {
		is.deletepid(id);
		return "Deleted";
	}
	}