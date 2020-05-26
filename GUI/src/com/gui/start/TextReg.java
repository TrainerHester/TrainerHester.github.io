package com.gui.start;

import java.io.*;
import java.util.regex.*;

public class TextReg {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("CallocIndex = (\\d*),CallocTime = (\\d*)");
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("resource/data.txt"); //路径注意一下
			br = new BufferedReader(fr);
			fw = new FileWriter("resource/output.csv");
			bw = new BufferedWriter(fw);
			String temp;
			while((temp = br.readLine()) != null) {
				//System.out.println(temp);
				Matcher matcher = p.matcher(temp);
				if(matcher.find()) {
					//System.out.println(matcher.group(1));
					//System.out.println(matcher.group(2));
					String line = matcher.group(1) + "," + matcher.group(2) + "\n";
					bw.write(line);
				} else {
					System.out.println("Not found!");
				}
				
			}
			br.close();
			bw.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		} catch(IOException e) {
			e.printStackTrace();
		} 		
	}

}
