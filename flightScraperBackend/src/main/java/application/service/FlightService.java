package application.service;

import java.util.List;
import application.dto.CreateFlightDto;
import application.mapper.FlightMapper;
import application.model.Flight;
import application.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();

    }

    public Flight getFlightById(Long id) {
        return flightRepository.getOne(id);
    }

    public Flight addFlight(CreateFlightDto flightDto) {
        Flight newFlight = FlightMapper.toCreateEntity(flightDto,new Flight());
        return flightRepository.save(newFlight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
