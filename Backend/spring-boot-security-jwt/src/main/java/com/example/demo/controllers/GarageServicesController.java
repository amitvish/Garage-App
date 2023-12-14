package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.repository.GarageServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.GarageServices;
import com.example.demo.payload.request.NewServiceRequest;
import com.example.demo.payload.response.MessageResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class GarageServicesController {
	
	@Autowired
	GarageServicesRepository garageServicesRepository;
	
	//create new garage service
	@PostMapping("/services")
	public ResponseEntity<?> newService(@Valid @RequestBody NewServiceRequest newServiceRequest){
		
		String serviceName = newServiceRequest.getServiceName();
		String serviceDescription = newServiceRequest.getServiceDescription();
		int price = newServiceRequest.getPrice();
		
		GarageServices garageServices = new GarageServices(serviceName,serviceDescription,price);
		
		garageServicesRepository.save(garageServices);
		
		return ResponseEntity.ok(new MessageResponse("new service added"));
	}
	
	//get services
	@GetMapping("/services")
	public ResponseEntity<?> getServices(){
		List<GarageServices> services = garageServicesRepository.findAll();
		return ResponseEntity.ok(services);
	}
	//delete service
	@DeleteMapping("/services/{id}")
	public ResponseEntity<?> deleteService(@PathVariable("id") int id){
		garageServicesRepository.deleteById(id);
		return ResponseEntity.ok(new MessageResponse("delete successful"));
	}
}
