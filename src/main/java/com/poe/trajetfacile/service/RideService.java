package com.poe.trajetfacile.service;

import com.poe.trajetfacile.domain.Ride;
import com.poe.trajetfacile.domain.User;
import com.poe.trajetfacile.repository.RideRepository;
import com.poe.trajetfacile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    @Autowired
    private UserRepository userRepository;

    public void offerARide(Date startDate, String fromCity, String toCity, Double cost, Short seats, Long userWhoProposed) {

        // TODO ...contrôles métiers

        Ride ride = new Ride();
        ride.setStartDate(startDate);
        ride.setFromCity(fromCity);
        ride.setToCity(toCity);
        ride.setCost(cost);
        ride.setSeats(seats);

        User user = userRepository.findOne(userWhoProposed);
        ride.setUserWhoProposed(user);
        rideRepository.save(ride);
    }

}