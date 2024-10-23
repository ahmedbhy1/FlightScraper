package application.mapper;

import application.dto.CreateFlightDto;
import application.model.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightMapper {

    // Constructor for dependency injection
    public FlightMapper() {
        // Any setup or initialization if needed
    }

    public Flight toCreateEntity(CreateFlightDto dto, Flight flight) {
        flight.setPrice(dto.getPrice());
        flight.setCurrency(dto.getCurrency());
        flight.setIsDirectFlight(dto.getIsDirectFlight());
        flight.setFlightDuration(dto.getFlightDuration());
        flight.setName(dto.getName());
        flight.setArrivalAirport(dto.getArrivalAirport());
        flight.setDepartureAirport(dto.getDepartureAirport());
        flight.setDepartureDateTime(dto.getDepartureDateTime());
        flight.setArrivalDateTime(dto.getArrivalDateTime());
        return flight;
    }
}