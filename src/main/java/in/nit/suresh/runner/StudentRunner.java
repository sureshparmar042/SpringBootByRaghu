package in.nit.suresh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome To GitHub...");
		System.out.println("Welcome To SpringBoot GitHub...");

	}

}
