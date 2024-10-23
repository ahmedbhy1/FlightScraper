package application.mapper;

import application.dto.CreateFlightDto;
import application.model.Flight;

public class FlightMapper {

    public static Flight toCreateEntity(CreateFlightDto dto) {
        Flight flight = new Flight();
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
