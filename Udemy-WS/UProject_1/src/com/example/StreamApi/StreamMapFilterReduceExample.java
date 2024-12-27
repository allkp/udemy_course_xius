package com.example.StreamApi;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class StreamMapFilterReduceExample {
	
	private static int noOfNoteBooks() {
		int noteBookCount = StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGender().equals("female"))
				.map(Student::getNoteBooks)
				.reduce(0, Integer::sum);
		
		return noteBookCount;
	}
	
	public static void main(String[] args) {
		
		System.out.println(noOfNoteBooks());
		
	}

}
