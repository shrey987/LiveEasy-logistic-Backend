package com.liveEasy.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liveEasy.model.shiprequest;
import com.liveEasy.service.shipmentservice;

@RestController
@RequestMapping("/api")
public class applicationController {
	
	@Autowired
	private shipmentservice shipservice;
	@PostMapping("/load")
	public ResponseEntity<?> insertShift(@RequestBody shiprequest shipmentreceive)
	{
		return shipservice.addShipment(shipmentreceive);
	}
	
	@GetMapping("/load")
	public ResponseEntity<?> display()
	{
		return shipservice.displayShipment();
	}
	
	@GetMapping("/load/{loadid}")
	public ResponseEntity<?> display_load(@PathVariable String loadid)
	{
		return shipservice.displayShipment(loadid);
	}
	
	@PutMapping("/load/{loadid}")
	public ResponseEntity<?> updateShift(@RequestBody shiprequest shipmentreceive,@PathVariable String loadid)
	{
		return shipservice.updateShipment(shipmentreceive,loadid);
	}
	
	@DeleteMapping("/load/{loadid}")
	public ResponseEntity<?> deleteShift(@PathVariable String loadid)
	{
		return shipservice.deleteShipment(loadid);
	}
	

}