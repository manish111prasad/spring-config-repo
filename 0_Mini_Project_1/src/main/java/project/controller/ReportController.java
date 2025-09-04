package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import project.entity.CitizenPlan;
import project.request.SearchRequest;
import project.serviceImpl.ReportServiceImpl;

@Controller
public class ReportController {

	@Autowired
	private ReportServiceImpl service;

	@GetMapping("/")
	public String indexPage(Model model) {

		SearchRequest searchObj = new SearchRequest();

		model.addAttribute("search", searchObj);

		return "index";

	}

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
