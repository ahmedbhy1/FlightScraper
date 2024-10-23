package application.controller;

import application.dto.CreateFlightDto;
import application.dto.GetFlightDto;
import application.model.Flight;
import application.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/flight")

@RequiredArgsConstructor

public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/getall")
    public List<Flight> getAllFlightInfo() {
        return flightService.getAllFlights();
    }

    @GetMapping("/get/{id}")
    public Flight getFlight(@PathVariable("id)") Long flightid) {
        return flightService.getFlightById(flightid);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable("id") Long flightid) {
        flightService.deleteFlight(flightid);
    }

    @PostMapping("/add")
    public void addFlight(@RequestBody CreateFlightDto flight) {
        flightService.addFlight(flight);
    }

}
