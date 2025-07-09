package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import project.entity.CitizenPlan;
import project.serviceImpl.ReportServiceImpl;

@RestController
public class ReportController {

	@Autowired
	private ReportServiceImpl service;

	@GetMapping("/planName")
	public List<String> getDistinctPlanName() {

		return service.planName();
	}

	@GetMapping("/search")
	public List<CitizenPlan> getAllPlanName() {

		return service.searchAll();
	}

	@GetMapping("/planStatus")
	public List<String> getDistinctPlanStatus() {

		return service.planStatus();
	}
	
	@GetMapping("/exportexcel")
	public void exportExcel() {
		
		
	}

}
