package io;
import java.io.*;
/**
 * 文本文件输入的快捷方式
 * @author sa
 * @Date 2018/01/27
 */

public class FileOutputShortcut {
	static String file = "FileOutputShortcut.out";
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(
				BufferedInputFile.read("./src/io/FileOutputShortcut.java")));
		PrintWriter out = new PrintWriter(file);// 快捷方式
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
    }
}
