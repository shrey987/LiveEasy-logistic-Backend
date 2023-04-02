package com.liveEasy.service;


import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.liveEasy.Utils.UuidGenerator;
import com.liveEasy.dao.ShipmentDao;
import com.liveEasy.entities.ship;
import com.liveEasy.model.shiprequest;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
@Service
public class shipmentservice {
	
	@Autowired
	private ShipmentDao shipment;
	@Autowired
	private UuidGenerator uuidgenerator;
	
	public ResponseEntity<?> addShipment(shiprequest dataReceive)
	{
		ship data = new ship(
			    dataReceive.getLoadingPoint(),
			    dataReceive.getUnloadingPoint(),
			    dataReceive.getProductType(),
			    dataReceive.getTruckType(),
			    dataReceive.getNoOfTrucks(),
			    dataReceive.getWeight(),
			    dataReceive.getComment(),
			    UuidGenerator.generateUuid(),
			    LocalDate.now()
			);
		shipment.insert_data(data);
		return new ResponseEntity<>("Loads Details Added Successfully",HttpStatus.OK);		
	}

	public ResponseEntity<?> displayShipment() {
		List<ship> shiftList=shipment.display();
		return new ResponseEntity<>(shiftList,HttpStatus.OK);
	}
	
	public ResponseEntity<?> displayShipment(String loadid)
	{
		return new ResponseEntity<>("Return",HttpStatus.OK);
	}

	public ResponseEntity<?> updateShipment(shiprequest dataReceive,String loadid) {
		// TODO Auto-generated method stub
		ship data = new ship(
			    dataReceive.getLoadingPoint(),
			    dataReceive.getUnloadingPoint(),
			    dataReceive.getProductType(),
			    dataReceive.getTruckType(),
			    dataReceive.getNoOfTrucks(),
			    dataReceive.getWeight(),
			    dataReceive.getComment(),
			    loadid,
			    LocalDate.now()
			);
		shipment.update_data(data);
		return new ResponseEntity<>("Updated Successfully",HttpStatus.OK);
	}
	
	public ResponseEntity<?> deleteShipment(String loadid)
	{
		shipment.delete_data(loadid);
		return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
	}
	

}
