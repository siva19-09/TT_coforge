package com.coforge;
abstract class ExamProcess
{
	static final int passMarks = 28;
	final String examCode;
	public ExamProcess(String examCode)
	{
		super();
		this.examCode = examCode;
	}
	final void conductExamProcess(Student1 s)
	{
		if(!validateEligibility(s))
		{
			System.out.println(s.name + " is not eligible due to low attendance");
			return;
		}
		String hallTicket = allocateHallTicket(s);
		System.out.println("Hall Ticket generated: " + hallTicket);
		conductExam(s);
		int marks = evaluate(s);
		publishResult(s, marks);
	}
	boolean validateEligibility(Student1 s)
	{
		return s.attendancePercent >= UniversityRules.minAttendancePercent;
	}
	String allocateHallTicket(Student1 s)
	{
		return UniversityRules.generateHallTicket();
	}
	abstract void conductExam(Student1 s);
	abstract int evaluate(Student1 s);
	final void publishResult(Student1 s, int marks)
	{
		if(marks >= passMarks)
		{
			System.out.println(s.name + " PASSED with marks: " + marks);
		}
		else
		{
			System.out.println(s.name + " FAILED with marks: " + marks);
		}
	}
}