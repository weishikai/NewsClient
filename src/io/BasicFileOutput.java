package io;
import java.io.*;
/**
 * 基本的文件输出
 * @author sa
 *
 */
public class BasicFileOutput {
	static String file = "BasicFileOutput.put";
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(
				BufferedInputFile.read("./src/io/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
