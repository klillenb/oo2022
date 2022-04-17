package com.transport.internshiptest;

import com.transport.internshiptest.model.Bus;
import com.transport.internshiptest.model.BusLine;
import com.transport.internshiptest.repository.BusLineRepository;
import com.transport.internshiptest.repository.BusRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class InternshipTestApplication {

/*	public static void main(String[] args) {
				SpringApplication.run(InternshipTestApplication.class, args);
	}*/
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(InternshipTestApplication.class, args);
		BusRepository busRepository = configurableApplicationContext.getBean(BusRepository.class);
		BusLineRepository busLineRepository = configurableApplicationContext.getBean((BusLineRepository.class));

		BusLine busLine = new BusLine("Priisle-Maneeži");
		busLineRepository.save(busLine);
		Bus bus = new Bus("999BBB");
		bus.setServingLine(busLine);
		busRepository.save(bus);


	}

}
