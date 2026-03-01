package com.coforge;
public class LabExam extends ExamProcess
{
	LabExam()
	{
		super("LAB205");
	}
	void conductExam(Student1 s)
	{
		System.out.println("Conducting Lab Practical for " + s.name);
	}
	int evaluate(Student1 s)
	{
		System.out.println("Evaluating Midterm papers...");
		return 30;
	}
}