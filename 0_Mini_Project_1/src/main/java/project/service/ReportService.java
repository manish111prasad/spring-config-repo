package project.service;

import java.util.List;

import project.entity.CitizenPlan;
import project.request.SearchRequest;

public interface ReportService {

	public List<CitizenPlan> searchAll();
	
	public List<String> planName();
	
	public List<String> planStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
}
