package camundaWorkflow.onboarding08;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MailAbsageVersenden implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {

		//String email = (String) execution.getVariable("email");

		String mailtext = "du Hurensohn";
		String subject = "Ihre Bewerbung /Absage";
		sendEmail(mailtext, subject, "hrwunschfirma@gmx.de");
	}

	public void sendEmail(String mailtext, String subject, String toEmail) throws EmailException {
		//https://anleitungen.rz.htw-berlin.de/de/email/e-mail_programm/

		MultiPartEmail email = new MultiPartEmail();
		email.setCharset("utf-8");
		email.setSSL(false);
		email.setTLS(true);
		email.setSmtpPort(587);
		email.setHostName("smtp.gmx.net");
		email.setAuthentication("hrwunschfirma@gmx.de", "123456789");
		email.addTo("hrwunschfirma@gmx.de");
		email.setFrom("hrwunschfirma@gmx.de");
		email.setSubject(subject);
		email.setMsg(mailtext);
		email.send();

	}

	
}
