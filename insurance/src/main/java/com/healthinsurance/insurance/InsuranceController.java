package com.healthinsurance.insurance;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {
	
	@Autowired
	InsuranceInterfaceRepository insrip;
	
	@GetMapping(value="/networkhospitals")
	public ArrayList<NetworkHospitals> getHospitals(){
		ArrayList<NetworkHospitals> list = (ArrayList<NetworkHospitals>) insrip.getHospitals();
		return list;
	}
	
}

