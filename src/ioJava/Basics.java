package ioJava;

import java.io.*;

public class Basics {
	public static void main(String[] args) {
		File file = new File("file.txt");
		System.out.println("Absolute path :"+file.getAbsolutePath());
		System.out.println("Relative path :"+file.getPath());
		System.out.println("Exists ? :"+file.exists());
		System.out.println("Name :"+file.getName());
	}	
}
