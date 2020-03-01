package com.java8.examples;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Base64;

public class IterableDirectory {

	public static void main(String[] args) throws IOException {
		
		
		Files.list(Paths.get("."))
        .forEach(System.out::println);
		System.out.println("-------------------------------------");
		Files.list(Paths.get("."))
        .filter(Files::isRegularFile)
        .forEach(System.out::println);
		System.out.println("-------------------------------------");
		Files.newDirectoryStream(Paths.get("."),
		        path -> path.toString().endsWith(".txt"))
		        .forEach(System.out::println);
		System.out.println("-------------------------------------");
		String armisticeDate = "2016-04-04";
		 
		LocalDate aLD = LocalDate.parse(armisticeDate);
		System.out.println("Date: " + aLD);
		System.out.println("-------------------------------------");
		String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);
		System.out.println("-------------------------------------");
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = "username:password";
		String encodedString = encoder.encodeToString(
		        normalString.getBytes(StandardCharsets.UTF_8) );
		System.out.println(encodedString);
		System.out.println("-------------------------------------");
		
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(encodedString);
		//Verify the decoded string
		System.out.println(new String(decodedByteArray));
	}

}
