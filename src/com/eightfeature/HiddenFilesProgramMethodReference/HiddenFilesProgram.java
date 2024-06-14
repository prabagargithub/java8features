package com.eightfeature.HiddenFilesProgramMethodReference;

import java.io.File;
import java.io.FileFilter;

public class HiddenFilesProgram {

	FileFilter fileFilter;
	
	//annonyamus inner class using 
	
	public static void java8HidenFiles() {
		
		File[] file= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\FileTesting").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
		});
		for(File f:file) {
		System.out.println(f.getName());
		}
	}
	
	
	
	public static void lambdaExpression() {
		File[] file= new File("C:\\Users\\Admin\\OneDrive\\Desktop\\FileTesting").listFiles(File:: isHidden);
		
		for(File fi:file) {
			System.out.println("lambda Expression"+fi.getName());
		}
		
	}
	public static void main(String[] args) {
    
		
		java8HidenFiles();
		lambdaExpression();
	}

}
