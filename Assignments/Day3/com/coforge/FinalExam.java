package com.coforge;
public class FinalExam extends ExamProcess
{
	FinalExam()
	{
		super("FIN404");
	}
	void conductExam(Student1 s)
	{
		System.out.println("Conducting Final Semester for " + s.name);
	}
	int evaluate(Student1 s)
	{
		System.out.println("Evaluating Final papers...");
		return 80;
	}
}