package com.sip.ams;

import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sip.ams.entities.Candidate;

@SpringBootApplication
public class AmsApplication {

	public static ArrayList<Candidate> lc = new ArrayList<>();

	static {
		lc.add(new Candidate(0, "amine", "amine.mezghich@gmail.com", "tunis"));
		lc.add(new Candidate(1, "wael", "wael@gmail.com", "tunis"));
		lc.add(new Candidate(2, "faycel", "faycel@gmail.com", "tunis"));
	}

	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
		System.out.println("Hello SIP ACADEMY");
	}

}
