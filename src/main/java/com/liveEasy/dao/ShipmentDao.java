package com.liveEasy.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.liveEasy.entities.ship;

@Repository
public class ShipmentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable()
	{
		String query="CREATE TABLE IF NOT EXISTS shipments( loadingPoint VARCHAR(255), unloadingPoint VARCHAR(255), productType VARCHAR(255),truckType VARCHAR(255),noOfTrucks INT,weight INT, comment VARCHAR(255), shipperId VARCHAR(255), Date DATE, PRIMARY KEY (shipperId))";
		int i=this.jdbcTemplate.update(query);
		System.out.println("Constructor Called " + i);
	}

	//post /load
	public void insert_data(ship data)
	{
		String query="INSERT INTO shipments(loadingPoint,unloadingPoint,productType,truckType,noOfTrucks,weight,comment,shipperId,Date) VALUES(?,?,?,?,?,?,?,?,?)";
		try {
		this.jdbcTemplate.update(query,data.getLoadingPoint(),data.getUnloadingPoint(),data.getProductType(),data.getTruckType(),data.getNoOfTrucks(),data.getWeight(),data.getComment(),data.getShipperId().toString(),data.getDATE());
		}
		catch(DataAccessException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
		}
	}
	
	public List<ship> display()
	{
		String query = "SELECT * FROM shipments";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(ship.class));
	}
	
	public ship display(String loadid)
	{
		String query="SELECT * FROM shipments where shipperId=?";
		
//		return jdbcTemplate.queryForObject(query, new Object[]{loadid}, new BeanPropertyRowMapper<>(ship.class));
	}
	
	public void update_data(ship data)
	{
		String query="UPDATE shipments SET loadingPoint=?, unloadingPoint=?, productType=?, truckType=?, noOfTrucks=?, weight=?, comment=?,Date=? where shipperId=?";
		try {
		jdbcTemplate.update(query,data.getLoadingPoint(),data.getUnloadingPoint(),data.getProductType(),data.getTruckType(),data.getNoOfTrucks(),data.getWeight(),data.getComment(),data.getDATE(),data.getShipperId());
		}
		catch(DataAccessException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
			
		}
	}
	
	public void delete_data(String load_id)
	{
		String query="DELETE from shipments where shipperId=?";
		jdbcTemplate.update(query,load_id);
		return ;
	}

}


