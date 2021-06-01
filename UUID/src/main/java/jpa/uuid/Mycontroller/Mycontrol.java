package jpa.uuid.Mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jpa.uuid.Dao.UuuidRepository;
import jpa.uuid.model.Person;

@RestController
public class Mycontrol {
	@Autowired
	UuuidRepository rs;
	@GetMapping("/")
	public String test()
	{
		return "OK";
	}
	@PostMapping("/add")
	public String add(@RequestBody Person per)
	{
		
		rs.save(per);
		return "DOne";
	}

}
