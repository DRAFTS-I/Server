package com.DRAFTSI;

import org.bytedeco.javacpp.opencv_core.*;
import org.bytedeco.javacpp.opencv_highgui;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DraftsIApplication {

	public static void main(String[] args) {
		SpringApplication.run(DraftsIApplication.class, args);
	}
}
