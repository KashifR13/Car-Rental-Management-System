package com.telenorbank.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class AssessmentApplication {

	public static int priceOfBooking (String time) throws ParseException, IOException {

		int pricePerHour;

		int carEnginePowerInCC, carMileageInKMs;


		DateTimeFormatter timeFormatParser = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
		LocalTime bookingTime = LocalTime.parse(time, timeFormatParser);

		LocalTime beginRangeOne = LocalTime.parse("12:00 AM", timeFormatParser);
		LocalTime endRangeOne = LocalTime.parse("07:00 AM", timeFormatParser);
		LocalTime beginRangeTwo = LocalTime.parse("07:01 AM", timeFormatParser);
		LocalTime endRangeTwo = LocalTime.parse("10:00 AM", timeFormatParser);
		LocalTime beginRangeThree = LocalTime.parse("12:45 PM", timeFormatParser);
		LocalTime endRangeThree = LocalTime.parse("02:20 PM", timeFormatParser);
		LocalTime beginRangeFour = LocalTime.parse("05:30 PM", timeFormatParser);
		LocalTime endRangeFour = LocalTime.parse("07:30 PM", timeFormatParser);

		if (bookingTime.isAfter(beginRangeOne) && bookingTime.isBefore(endRangeOne)) { pricePerHour = 5; }
		else if (bookingTime.isAfter(beginRangeTwo) && bookingTime.isBefore(endRangeTwo)) { pricePerHour = 10; }
		else if (bookingTime.isAfter(beginRangeThree) && bookingTime.isBefore(endRangeThree)) { pricePerHour = 15; }
		else if (bookingTime.isAfter(beginRangeFour) && bookingTime.isBefore(endRangeFour)) { pricePerHour = 20; }
		else { pricePerHour = 3; }

		return pricePerHour;
	}

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

}
