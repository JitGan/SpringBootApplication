package com.example.springboot;

import com.example.springboot.controller.HelloController;
import com.example.springboot.domain.Band;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }
    @Autowired
    HelloController helloController;

    @Test
    public void testGetAllBands(){
        //ResponseEntity<String> response = template.getForEntity("/", String.class);
        List<Band> allBands=helloController.getAllBands();
        System.out.println("ALl Bands:"+allBands);
    }

}
