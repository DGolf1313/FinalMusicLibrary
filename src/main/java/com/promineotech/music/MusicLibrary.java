package com.promineotech.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class MusicLibrary {

	public static void main(String[] args) {
		SpringApplication.run(MusicLibrary.class, args);
	}

}
