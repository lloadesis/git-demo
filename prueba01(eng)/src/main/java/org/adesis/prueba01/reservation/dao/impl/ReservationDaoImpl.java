package org.adesis.prueba01.reservation.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.adesis.prueba01.reservation.dao.IReservationDao;
import org.adesis.prueba01.model.Reservation;

public class ReservationDaoImpl implements IReservationDao {
	
	private static final AtomicInteger counter = new AtomicInteger();

	List<Reservation> reservations = new ArrayList<Reservation>();
	
	public Reservation searchReservation (int id){
		for (Reservation reservation : reservations){
			if (reservation.getId()==id){
				return reservation;
			}
		}
		
		throw new RuntimeException ("Reserva con el id " +id + " no encontrada!");
	}
	
	public List<Reservation> showAll(){
		return reservations;
	}
	
	public void addReservation (Reservation reservation){
		reservations.add(reservation);
		reservation.setId(counter.getAndIncrement());
		
	}
	
	public void changeReservation (Reservation reservation){
		Reservation reservationToChange = searchReservation(reservation.getId());
		
		reservationToChange.setId(reservation.getId());
		reservationToChange.setName(reservation.getName());
		reservationToChange.setPeople(reservation.getPeople());
	}
	
	public void cancelReservation(int id){
		Reservation reservationToCancel = searchReservation(id);		
		reservations.remove(reservationToCancel);
	}
}
