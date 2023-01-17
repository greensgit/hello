package org.cts.test;

import org.tcs.test.FifthClass;
import org.tcs.test.SixthClass;


//import packagename.classname

public class FirstDay {
	
	//camel notation 
	
	//ctrl+space and double click
	public void nameOfStudent() {
		//ctrl+d ---to delete a line
		System.out.println("Student name is vignesh");
		System.out.println("Student name is Deepak");
	}

	public void trainerName() {
		System.out.println("Trainer name is Raj");
	}
	
	public static void main(String[] args) {
		
		//classname objn = new classname();
		
		FirstDay f = new FirstDay(); 
		
		//objectname.methodname
		
		f.nameOfStudent();
		f.trainerName();
		
		FirstEvening fe = new FirstEvening();
		fe.modeOfTraining();
		
		TrainingDetails t = new TrainingDetails();
		t.studentName();
		
		FourthClass fc = new FourthClass();
		fc.trainingLocation();
		
		FifthClass ft = new FifthClass();
		ft.courseDetail();
		
		SixthClass s = new SixthClass();
		s.courseFee();
		
		
		
	}
	
}
