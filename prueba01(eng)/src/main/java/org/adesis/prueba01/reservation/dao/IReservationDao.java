package org.adesis.prueba01.reservation.dao;

import java.util.List;

import org.adesis.prueba01.model.Reservation;

public interface IReservationDao {
	
	public Reservation searchReservation(int id);
	public List<Reservation> showAll();
	public void addReservation(Reservation reservation);
	public void changeReservation(Reservation reservation);
	public void cancelReservation (int id);
}
