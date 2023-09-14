package com.healthinsurance.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InsuranceRepository implements InsuranceInterfaceRepository  {
	
	@Autowired
	InsuranceInterfaceDAO insrdao;
	
	@Override
	public List<NetworkHospitals> getHospitals(){
		List<NetworkHospitals> list1 = insrdao.getHospitals();
		return list1;
	}
}




