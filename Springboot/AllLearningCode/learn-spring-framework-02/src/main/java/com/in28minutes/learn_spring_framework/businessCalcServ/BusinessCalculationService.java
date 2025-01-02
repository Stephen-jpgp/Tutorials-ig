package com.in28minutes.learn_spring_framework.businessCalcServ;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {
    private final DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
