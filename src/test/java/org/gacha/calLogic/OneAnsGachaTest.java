package org.gacha.calLogic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OneAnsGachaTest {

	@Test
	@DisplayName("Random 계산 체크")
	void random(){
		Random random = new Random();
		double test = 0.016666d;
		int test1 = (int)(test*1000000);

		System.out.println(test1);
		System.out.println(test1);
		System.out.println(test1);
		System.out.println(test1);
		System.out.println(test1);
	}
}