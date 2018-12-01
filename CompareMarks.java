package com.sneha.ds;

public class CompareMarks {
	
	public static void main(String[] args) {
	

int S1_Marks1 = 45;
int S1_Marks2 = 50;
int S1_Marks3 = 38;

int S2_Marks1 = 46;
int S2_Marks2 = 38;
int S2_Marks3 = 40;

int S3_Marks1 = 38;
int S3_Marks2 = 40;
int S3_Marks3 = 50;

int Student1_total = S1_Marks1 + S1_Marks2 + S1_Marks3;
int Average_S1 = Student1_total/3;
System.out.println(Student1_total);
System.out.println(Average_S1);

int Student2_total = S2_Marks1 + S2_Marks2 + S2_Marks3;
int Average_S2 = Student2_total/3;

int Student3_total = S3_Marks1 + S3_Marks2 + S3_Marks3;
int Average_S3 = Student3_total/3;

int Subject1_total = S1_Marks1 + S2_Marks1 + S3_Marks1;
int SubAvg1 = Subject1_total/3;

int Subject2_total = S1_Marks2 + S2_Marks2 + S3_Marks2;
int SubAvg2 = Subject2_total/3;

int Subject3_total = S1_Marks3 + S2_Marks3 + S3_Marks3;
int SubAvg3 = Subject3_total/3;

	}
}
