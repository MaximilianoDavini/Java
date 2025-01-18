package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Helpers.Math;

@SpringBootTest
class DemoApplicationTests {

	Math test = new Math().SetNumeroDos(1).SetNumeroUno(2).Build();

	@Test
	void contextLoads() {
		assertEquals(1,1);
	}

	@Test
	void SumarDosNumero(){
		assertEquals(test.Sumar(),4);
	}

}
