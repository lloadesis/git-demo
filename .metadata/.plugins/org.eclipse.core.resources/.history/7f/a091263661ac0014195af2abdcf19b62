package org.adesis.prueba01.manager;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import org.adesis.prueba01.model.ReservationRequest;
import org.adesis.prueba01.model.ReservationResponse;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * @author luis.lopez
 * Estoy en la rama develop
 */
public interface ReservationManager {
	
	/*Las excepciones de los bean Validation se recubrirían y se lanzaría un dto genérico
	 * de error que indicara lo que ha ocurrido.
	 */
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/searchReservation/{a}")
	public ReservationResponse searchReservation(
	@PathParam ("a")
	@Pattern(regexp = "[0-9]+", message = "El id de la reserva debe ser un valor numerico.")
	int id);
	
	@GET
	@Produces("application/json")
	@Path("/showAll/")	
	public ReservationResponse showAll();	
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/addReservation/")
	@NotNull(message="No puede haber campos nulos.")
	@NotEmpty(message="No puede haber campos vacios.")
	@Valid
	public ReservationResponse addReservation( @Valid ReservationRequest request);
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/changeReservation/")
	@NotNull(message="No puede haber campos nulos.")
	@NotEmpty(message="No puede haber campos vacios.")
	@Valid
	public ReservationResponse changeReservation(ReservationRequest request);
	
	@DELETE
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/cancelReservation/{a}")
	public ReservationResponse cancelReservation(
	@PathParam ("a")		
	@Pattern(regexp = "[0-9]+", message = "El id de la reserva debe ser un valor numerico.")
	int id);

}
