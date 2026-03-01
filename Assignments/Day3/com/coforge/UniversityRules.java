package com.coforge;
public class UniversityRules
{
	static final String universityCode = "JNTU2025";
	static final int minAttendancePercent = 75;
	static int hallTicketCounter = 123456;
	static String generateHallTicket()
	{
		hallTicketCounter++;
		return universityCode + hallTicketCounter;
	}
}