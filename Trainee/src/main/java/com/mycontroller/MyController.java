package com.mycontroller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Trainee;
import com.service.TraineeService;


@RestController
public class MyController {
	
	@Autowired
	TraineeService service;
	
	int id;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody Trainee trainee) {
		service.register(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@GetMapping("/login")
	public void login(@RequestBody Trainee trainee) {
		id=service.login(trainee);
		}
	
	
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		service.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody Trainee trainee) {
		service.updateTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int tId) {
		service.deleteTrainee(tId);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public ResponseEntity getByPid(@RequestBody int tId) {
	Trainee trainee=service.getByTid(tId);
	if(trainee==null) {
		return null;
	}
	else
	return new ResponseEntity(trainee,HttpStatus.OK);
	}


	@GetMapping("/getAll")
	public ArrayList<Trainee> getAllProducts(){
		ArrayList<Trainee> trainee = service.getAll();
		return trainee;
	}
}
