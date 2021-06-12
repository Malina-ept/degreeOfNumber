package com.example.degreeOfNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class DegreeOfNumberApplicationTests {

	private  DegreeOfNumber degreeOfNumber;

	@BeforeEach
	public void  setUp() {
		degreeOfNumber = new DegreeOfNumber();
	}

	@Test
	@DisplayName("test square of the number")
		//квадрат числа
	void  test1() {
		Integer first = 3;
		Integer expected = 9;

		assert  degreeOfNumber.square(first).equals(expected);

	}

	@Test
	@DisplayName("test cube of a number")
		//куб числа
	void  test2() {
		Integer first = 2;
		Integer expected = 8;

		assert  degreeOfNumber.cube(first).equals(expected);

	}

	@Test
	@DisplayName("test exponentiation")
		//возведение в степень
	void  test3() {
		Integer first = 2;
		Integer second = 5;
		Integer expected = 32;

		assert Objects.equals(degreeOfNumber.exponentiation(first, second), expected);

	}



}
