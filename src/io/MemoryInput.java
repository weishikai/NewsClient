package io;
import java.io.*;
// ���ڴ�����
public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile.read("./src/io/BufferedInputFile.java"));
		int c;
		while((c = in.read()) != -1) {
			// in.read()����int��ʽ������һ�ֽ�,תΪchar
			System.out.print((char)c);
		}
	}
}