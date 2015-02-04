package org.adesis.prueba01.model;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

public class ReservationResponse {
	
	private List<Reservation> reservations;
	private String errorMsg;	
	private boolean success=true;
	
	public List<Reservation> getReservations(){
		return reservations;
	}
	
	public void setReservations (List<Reservation> reservations){
		this.reservations=reservations;
	}
	
	public Boolean isSuccess(){
		return success;
	}
	
	public void setSuccess (boolean success){
		this.success=success;
	}
	
	public String getErrorMsg(){
		return errorMsg;
	}
	
	public void setErrorMsg(String errorMsg){
		this.errorMsg=errorMsg;
	}

}
