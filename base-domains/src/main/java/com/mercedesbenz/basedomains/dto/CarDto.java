package com.mercedesbenz.basedomains.dto;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CarDto {
    private UUID id;
    private String brand;
    private String model;
    private String license;
    private Long costPerDay;
    private List<AvailabilityDto> availabilities;
}
