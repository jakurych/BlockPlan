package com.jakurych.blockplan.blockplan;

import com.jakurych.blockplan.blockplan.service.UserService;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Builder
public class BlockPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockPlanApplication.class, args);
	}

	UserService userService = UserService.builder().build();

}
