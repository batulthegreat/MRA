package com.hcl.test.hacker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;


import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
*
* @author HCL ADPaaS - Auto generated.
* @version 1.0
* @since 2017-07-01
*
*/

/**************************
* DO NOT MODIFY THIS CLASS
**************************/

@SpringBootApplication
@EnableSwagger2

public class MeetingRoomAvailability {

	private static final Logger LOGGER = Logger.getLogger(MeetingRoomAvailability.class.getName());
    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		SpringApplication.run(MeetingRoomAvailability.class, args);
		LOGGER.info("\n----------------------------------------------------------\n\t" +
                "Spring-boot application MeetingRoomAvailability is up and running.\n" +
                "----------------------------------------------------------");
	}

}
