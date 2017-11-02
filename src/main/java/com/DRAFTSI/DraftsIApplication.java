package com.DRAFTSI;

import org.bytedeco.javacpp.opencv_core.*;
import org.bytedeco.javacpp.opencv_highgui;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DraftsIApplication {

    public static StringBuffer image;
	public static void main(String[] args) {
        image = new StringBuffer();
		SpringApplication.run(DraftsIApplication.class, args);
	}
}
