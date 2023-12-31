package com.company.hotelservice.helpers.dto;

import com.company.hotelservice.entity.Availability;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingAvailabilityDto {
    private Availability availabilityBookable;
    private Availability availabilityBeforeReservation;
    private Availability availabilityAfterReservation;
    private List<Availability> availabilitiesToSaveWithRoom;
}
