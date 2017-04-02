package com.nearby.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nearby.app.models.User;
import com.nearby.app.repository.UserRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class NearByServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NearByServiceApiApplication.class, args);
	}

	@Bean
    CommandLineRunner init(final UserRepository accountRepository) {

		return new CommandLineRunner() {

        @Override
        public void run(String... arg0) throws Exception {
          //accountRepository.save(new User("arifali", "mondal17"));
        }

      };
	}
}
