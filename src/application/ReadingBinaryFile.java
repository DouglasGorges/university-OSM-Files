package application;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBinaryFile {

	public static void main(String[] args) throws IOException {
		String path = "D:/Sources/Faculty/Files/testeBinario.bin";

		leitor(path);

	}

	public static void leitor(String path) throws IOException {
		try {

			FileInputStream fileInput = new FileInputStream(path);
			DataInputStream dataInput = new DataInputStream(fileInput);

			int x = 0;
			while ((x = dataInput.read()) != -1) {
				System.out.println(x);
			}
			dataInput.close();

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
		}
	}

}
