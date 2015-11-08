package com.home.h0001_fifth;

import java.util.Random;

import android.util.Log;

public class Randomizer {
	private final int SIZE = 16;
	private int mas_unical_numbers[];

	Randomizer() {
		iniciate();
	}

	private void iniciate() {
		mas_unical_numbers = new int[SIZE];
		mas_unical_numbers = predinit(mas_unical_numbers);
		mas_unical_numbers = generatorNotRepidNumbers(mas_unical_numbers);
		mas_unical_numbers = checkChaosParameter(mas_unical_numbers);
		if(mas_unical_numbers==null){
			iniciate();
		}
	}

	private int[] predinit(int[] mas_unical_numbers) {
		for (int i = 0; i < mas_unical_numbers.length; i++) {
			mas_unical_numbers[i] = -1;
		}
		return mas_unical_numbers;
	}

	private int[] generatorNotRepidNumbers(int[] mas_unical_numbers) {
		boolean is_unical_number;
		Random random = new Random();
		int counter_unical_numbers = 0, rundom_number = 0;
		for (int i = counter_unical_numbers; i < mas_unical_numbers.length;) {
			rundom_number = random.nextInt(mas_unical_numbers.length);
			is_unical_number = compareMasWithNumber(mas_unical_numbers,
					rundom_number);
			if (is_unical_number) {
				mas_unical_numbers[i] = rundom_number;
				i = ++counter_unical_numbers;
			}

		}
		return mas_unical_numbers;
	}

	private boolean compareMasWithNumber(int[] mas_unical_numbers, int number) {
		boolean is_unical_number = true;
		for (int i = 0; i < mas_unical_numbers.length; i++) {
			if (mas_unical_numbers[i] == number && number != -1) {
				is_unical_number = false;
				break;
			}
		}
		return is_unical_number;
	}

	private int[] checkChaosParameter(int[] mas_unical_numbers) {
		int counter = 0;
		int coef = 0;
		for (int i = 0; i < SIZE; i++) {
			for (int y = i; y < SIZE; y++) {
				if (mas_unical_numbers[i] > mas_unical_numbers[y]
						&& mas_unical_numbers[i] != 0
						&& mas_unical_numbers[y] != 0) {
					counter++;

				}
			}
			if (mas_unical_numbers[i] == 0) {
				if (i < 4) {
					coef = 1;
				} else if (i < 8) {
					coef = 2;
				} else if (i < 12) {
					coef = 3;
				} else {
					coef = 4;

				}
			}

		}
		counter = counter + coef;
		Log.d("CHAOS",counter+"");
		if (counter % 2 == 0) {
			return mas_unical_numbers;
		}else{
			return null;
		}
	}

	public int getElement(int i) {
		return mas_unical_numbers[i];
	}
}
