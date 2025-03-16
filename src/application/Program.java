package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Program {

	public static void main(String[] args) throws IOException {

		Path path = Path.of("c:\\teste\\texto.txt"); //Onde quer criar ?	
		
		/*
		if (Files.notExists(path)) { // Verificar se o arquivo não existe
			Files.createFile(path); // Criar
		}
		
		String texto = "Olá, Mundo!";
		
		Files.writeString(path, texto); // 1ª forma
		
		byte[] bytes = texto.getBytes(); // 2ª forma
		Files.write(path, bytes); 
		*/
		/*
		List <String> allLines = Files.readAllLines(path);
		for (String texto: allLines) {
			System.out.println(texto);
		}
		*/
		
		byte[] bytes = Files.readAllBytes(path);
		String texto = new String(bytes);
		System.out.println(texto);
	}

}
