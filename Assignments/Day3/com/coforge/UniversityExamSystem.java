package com.coforge;
public class UniversityExamSystem
{
	public static void main(String[] args)
	{
		Student1 s1 = new Student1("S105", "Siva", 70);
		Student1 s2 = new Student1("S205", "Mani", 90);
		ExamProcess midterm = new MidtermExam();
		ExamProcess lab = new LabExam();
		ExamProcess finalExam = new FinalExam();
		System.out.println("\n-- Midterm Exam ---");
		midterm.conductExamProcess(s1);
		System.out.println("\n-- Lab Exam ---");
		lab.conductExamProcess(s2);
		System.out.println("\n-- Final Exam ---");
		finalExam.conductExamProcess(s1);
	}
}