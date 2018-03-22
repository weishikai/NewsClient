package io;
import java.io.*;
// 从内存输入
public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile.read("./src/io/BufferedInputFile.java"));
		int c;
		while((c = in.read()) != -1) {
			// in.read()是以int形式返回下一字节,转为char
			System.out.print((char)c);
		}
	}
}