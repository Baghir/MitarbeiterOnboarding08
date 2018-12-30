package camundaWorkflow.onboarding08;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@WebServlet("/startformServlet")
public class startformServlet extends HttpServlet implements JavaDelegate {
public String nachname;


	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("personalnummer",nachname);
		execution.setVariable("nachname",nachname);
		execution.setVariable("Vorname",nachname);
		execution.setVariable("email",nachname);
		execution.setVariable("geschlecht",nachname);
		execution.setVariable("abteilung",nachname);
		execution.setVariable("jobtitel",nachname);
		execution.setVariable("buddy",nachname);
		execution.setVariable("vorgesetzter",nachname);
		execution.setVariable("vertragsbeginn",nachname);
		execution.setVariable("ersterArbeitstag",nachname);
		execution.setVariable("Sprache",nachname);
		execution.setVariable("gewNotebook",nachname);
		execution.setVariable("visitenkarteBenoetigt",nachname);
	}
	
	
	 protected void doPost(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
	 
	       nachname = request.getParameter("Nachname");
	       
	    
	 
	}

}
