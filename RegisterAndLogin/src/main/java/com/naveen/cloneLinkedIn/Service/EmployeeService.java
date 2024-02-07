package com.naveen.cloneLinkedIn.Service;

import com.naveen.cloneLinkedIn.Dto.EmployeeDTO;
import com.naveen.cloneLinkedIn.Dto.LoginDTO;
import com.naveen.cloneLinkedIn.LoginResponse.LoginMesage;


public interface EmployeeService 
      {

	    String addEmployee(EmployeeDTO employeeDTO);
	    LoginMesage loginEmployee(LoginDTO loginDTO);
	   }

