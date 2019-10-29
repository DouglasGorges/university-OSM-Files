package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingAsciiFile {

	public static void main(String[] args) throws IOException {
		String path = "D:/Sources/Faculty/Files/testeASCII.txt";

		leitor(path);

	}

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";

		linha = buffRead.readLine();

		System.out.println(linha);

		buffRead.close();
	}

}
