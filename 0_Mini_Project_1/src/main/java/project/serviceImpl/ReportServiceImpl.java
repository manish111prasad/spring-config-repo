package project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.CitizenPlan;
import project.repo.CitizenPlanRepository;
import project.request.SearchRequest;
import project.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private CitizenPlanRepository repo;

	public List<CitizenPlan> searchAll() {

		return repo.findAll();
	}

	public List<String> planName() {

		return repo.getPlanNames();
	}
	
	public List<String> planStatus() {

		return repo.getPlanStatus();
	}
	
	
	public List<CitizenPlan> search(SearchRequest request){
		
		
		return null;
	}
	
	
	public boolean exportExcel() {
		
		
		return false;
	}
	
	public boolean exportPdf() {
		
		
		return false;	
	}
	
	
}
