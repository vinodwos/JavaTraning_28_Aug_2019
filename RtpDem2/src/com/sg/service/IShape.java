package com.sg.service;

import java.util.Scanner;

public interface IShape {
	Scanner scan = new Scanner(System.in);

	double calcVolume();

	void readData();
}
