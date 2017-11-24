package com.poseidon.di2;

import java.util.ArrayList;

public class Info {
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BMICalc bmiCalc;
	
	public void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println("취미 : "+hobby);
	}
	
	public void bmiCalculation() {
		bmiCalc.bmiCalculation(weight, height);
	}
	// get/set.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public BMICalc getBmiCalc() {
		return bmiCalc;
	}

	public void setBmiCalc(BMICalc bmiCalc) {
		this.bmiCalc = bmiCalc;
	}
}
