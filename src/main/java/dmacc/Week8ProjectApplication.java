package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class Week8ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8ProjectApplication.class, args);
	}

	@Autowired
	ComputerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Creating a bean to use – not managed by Spring
		Computer comp2016 = new Computer("PARS2016", "Intel i5-6600", "AMD RX 480", 8);
		Computer pi4 = new Computer("bobpi", "Broadcom BCM2711", "Broadcom VideoCore VI", 2);
		Computer laptop = new Computer("RPARS2021", "Intel i7-1165G7", "Intel Iris Xe", 16);
		repo.save(comp2016);
		repo.save(pi4);
		repo.save(laptop);

		List<Computer> allComputers = repo.findAll();
		for(Computer pcs: allComputers) {
			System.out.println(pcs.toString());
		}

		((AbstractApplicationContext) appContext).close();
	}
}
