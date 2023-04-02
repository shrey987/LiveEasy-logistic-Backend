package com.liveEasy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;


@Data
@NoArgsConstructor



public class ship {
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public Date getDATE() {
		return DATE;
	}
	public void setDATE(Date dATE) {
		DATE = dATE;
	}
	private String truckType;
	private Integer noOfTrucks;
	private Integer weight;
	private String comment;
	private String shipperId;
	private Date DATE;
	public ship(String lp,String up,String pt,String tt,Integer no_trucks,Integer weight,String cmt,String id,LocalDate localDate)
	{
		this.loadingPoint=lp;
		this.unloadingPoint=up;
		this.comment=cmt;
		this.productType=pt;
		this.DATE=Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		this.noOfTrucks=no_trucks;
		this.weight=weight;
		this.shipperId=id;
		this.truckType=tt;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	

}
