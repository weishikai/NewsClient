package io;
import java.io.*;
// 格式化的内容输入
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		try {
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read("./src/io/FormattedMemoryInput.java").getBytes()));
			while(true) {
				System.out.print((char)in.readByte());
			}
		} catch (IOException e) {
			System.out.println("End of stream");
		}
	}
} 
