package twoarrays;

import java.util.Scanner;

public class ManageHeight {
	int [][] gradeHeights;

	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		for (int classNo = 1; classNo <= 5; classNo++) {
//			sample.printHeight(classNo);
			sample.printAverage(classNo);
		}
		
	}
	
	public void setData() {
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeights[1] = new int[] { 160, 165, 167, 186 };
		gradeHeights[2] = new int[] { 158, 177, 187, 176 };
		gradeHeights[3] = new int[] { 173, 182, 181 };
		gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
		
		for(int i=0;i<=4;i++) {
			if(i==0 || i==4)
			{
			for(int j=0;j<5;j++) {
				System.out.println((i+1)+"반"+(j+1)+"번 키는"+gradeHeights[i][j]);
			}
			}
			else if(i==1||i==2){
				for(int j=0;j<4;j++) {
					System.out.println((i+1)+"반"+(j+1)+"번 키는"+gradeHeights[i][j]);
				}
			}
			else if(i==3) {
				for(int j=0;j<3;j++) {
					System.out.println((i+1)+"반"+(j+1)+"번 키는"+gradeHeights[i][j]);
			}
			}
		}
	}
	public void printHeight(int classNo) {
		System.out.println("ClassNo." + classNo);
		for (int data : gradeHeights[classNo - 1]) {
			System.out.println(data);
		}
		
	}

	public void printAverage(int classNo) {
		System.out.println("ClassNo." + classNo);
		double sum=0;
		int studentCount=gradeHeights[classNo - 1].length;
		for (int data : gradeHeights[classNo - 1]) {
			sum+=data;
		}
		System.out.println(sum/studentCount);
	}

}
