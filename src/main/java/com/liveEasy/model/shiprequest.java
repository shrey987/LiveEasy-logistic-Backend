package com.liveEasy.model;

import lombok.Data;

@Data

public class shiprequest {
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private Integer noOfTrucks;
	private Integer weight;
	private String comment;
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
