package org.zerock.mapper.lecture;

import java.util.List;

public interface Mapper09 {
	
	String getCustomerNameById(int id);

	String getEmployeeFirstNAmeById(int id);
	
	List<String> getCustomerNameByCityAndCountry(String country,String city);
}
