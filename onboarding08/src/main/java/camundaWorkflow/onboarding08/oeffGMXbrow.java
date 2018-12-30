package camundaWorkflow.onboarding08;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class oeffGMXbrow implements JavaDelegate{

	public static void main(String[] args) {
		URL url = null;
        try {
            url = new URL("https://registrierung.gmx.net/#.pc_page.homepage.index.loginbox_1.registrierung");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
 

	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		URL url = null;
        try {
            url = new URL("https://registrierung.gmx.net/#.pc_page.homepage.index.loginbox_1.registrierung");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if(Desktop.isDesktopSupported()){
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
		
	}

}
