package com.coforge;
public class MidtermExam extends ExamProcess
{
	MidtermExam()
	{
		super("MID105");
	}
	void conductExam(Student1 s)
	{
		System.out.println("Conducting Midterm Exam for " + s.name);
	}
	int evaluate(Student1 s)
	{
		System.out.println("Evaluating Midterm papers...");
		return 20;
	}
}