package application;

import java.io.IOException;
import java.io.PrintWriter;

public class CreatingFiles {

	private static final String PATH_ASCII = "D:/Sources/Faculty/Files/testeASCII.txt";
	private static final String PATH_BINARIO = "D:/Sources/Faculty/Files/testeBinario.bin";
	private static final int N = 100;

	public static void main(String[] args) {
		// escrevendo de 0 a N no formato ASCII
		try (PrintWriter writer = new PrintWriter(PATH_ASCII, "US-ASCII")) {
			for (int i = 0; i < N; i++)
				writer.print(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// escrevendo de 0 a N em binário
		try (PrintWriter writer = new PrintWriter(PATH_BINARIO)) {
			for (int i = 0; i < N; i++)
				writer.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim!");
	}

}
