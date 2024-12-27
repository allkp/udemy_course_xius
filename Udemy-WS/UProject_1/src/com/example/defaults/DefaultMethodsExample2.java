package com.example.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.studentClassFiles.Student;
import com.studentClassFiles.StudentDataBase;

public class DefaultMethodsExample2 {
	static Consumer<Student> con = (s -> System.out.println(s));
	
	static Comparator<Student> gradeComp = Comparator.comparing(Student::getGradeLevel);
	static Comparator<Student> nameComp = Comparator.comparing(Student::getName);

	
	public static void sortByName(List<Student> stdList) {
		System.out.println("After sorting by name : ");
		stdList.sort(nameComp);
		stdList.forEach(con);
	}
	
	public static  void sortByGPA(List<Student> stdList) {
		System.out.println("After sorting by gpa : ");
		stdList.sort(gradeComp);
		stdList.forEach(con);
	}
	
	public static void comparatorChaining(List<Student> stdList) {
		System.out.println("After Chaining : ");
		stdList.sort(gradeComp.thenComparing(nameComp));
		stdList.forEach(con);
	}
	
	public static void sortingWithNullValues(List<Student> stdList) {
		System.out.println("After sortingWithNullValues : ");
		Comparator<Student> stdComparator = Comparator.nullsFirst(nameComp);
		stdList.sort(stdComparator);
		stdList.forEach(con);
	}
		
	public static void main(String[] args) {
		List<Student> stdList = StudentDataBase.getAllStudents();
		System.out.println("Before sorting : ");
		//System.out.println(stdList);
		//System.out.println("After sorting : ");
		stdList.forEach(con);
		//sortByName(stdList);
		//sortByGPA(stdList);
		//comparatorChaining(stdList);
		sortingWithNullValues(stdList);
	}

}
