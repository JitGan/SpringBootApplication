package com.example.springboot.controller;

import com.example.springboot.domain.Band;
import com.example.springboot.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

	@Autowired
	BandService bandService;

	@GetMapping("/")
	public String index() {
		return "Greetings from Jitesh, Spring Boot!";
	}

	@GetMapping("/getAllBands")
	public ArrayList<Band> getAllBands() {
		ArrayList<Band> bands= null;
		try {
			bands = (ArrayList<Band>) bandService.getBands();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return bands;
	}
}
