package com.dice.app;

import java.util.Random;

public class Die {
	/*
	 * roll() getValue() getSides() setSides(int sides)
	 */
	private int sides;
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Random getGenerator() {
		return generator;
	}

	public void setGenerator(Random generator) {
		this.generator = generator;
	}

	private int value;
	private Random generator;

	public Die(int sides) {
		this.sides = sides;
		generator = new Random();
	}

	public Die(int sides, int seed) {
		this.sides = sides;
		this.generator = new Random(seed);
	}

	public int roll() {
		this.value = this.generator.nextInt(this.sides) + 1;
		return this.value;
	}
}
