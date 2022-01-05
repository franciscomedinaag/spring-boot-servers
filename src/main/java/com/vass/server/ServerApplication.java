package com.vass.server;

import com.vass.server.enumeration.Status;
import com.vass.server.model.Server;
import com.vass.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.161", "Debian", "5 GB", "Webservice","http://localhost:8080/server/image/server2.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.162", "Windows", "200 GB", ".NET Server","http://localhost:8080/server/image/server3.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.163", "MS 2008", "64 GB", "Testing","http://localhost:8080/server/image/server4.png", Status.SERVER_UP));

		};
	}
}
