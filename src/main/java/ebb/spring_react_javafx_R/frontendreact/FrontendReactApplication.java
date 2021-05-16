package ebb.spring_react_javafx_R.frontendreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ebb.spring_react_javafx_R.browser.BrowserApp;

@SpringBootApplication
public class FrontendReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendReactApplication.class, args);
		BrowserApp.main(args);
	}

}
