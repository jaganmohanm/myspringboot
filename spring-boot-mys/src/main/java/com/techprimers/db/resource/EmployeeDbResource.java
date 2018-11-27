package com.techprimers.db.resource;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.db.model.EmployeeDb;
import com.techprimers.db.repository.EmployeeDbRepository;

@RestController
@RequestMapping(value="/rest/users")
public class EmployeeDbResource {
	@Autowired
	EmployeeDbRepository re;
	
	@GetMapping(value="/all")
	//Display all employee existing
	public List<EmployeeDb> getAll()
	{
		return re.findAll();
	}
	@PostMapping(value="/load")
	//insert values into db
	//RequestBody is where our obj is gng 2 go
	//if empdb has that emp that it returnseverything about emp
	public List<EmployeeDb> persist(@RequestBody final EmployeeDb emp)
	{
		re.save(emp);
		//saves all the emp details
		return re.findAll();
	}
	

}
