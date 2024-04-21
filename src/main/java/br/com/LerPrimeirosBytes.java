package br.com;

import java.io.*;

public class LerPrimeirosBytes {
    public static void main(String[] args) {
        String arquivo = "arquivo.bin";
        int bytesParaLer = 100;

        try (FileInputStream inputStream = new FileInputStream(arquivo)) {
            byte[] buffer = new byte[bytesParaLer];

            // Lendo os primeiros 100 bytes do arquivo
            int bytesRead = inputStream.read(buffer, 0, bytesParaLer);

            // Exibindo os bytes lidos no console
            if (bytesRead != -1) {
                System.out.println("Primeiros " + bytesRead + " bytes do arquivo:");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            } else {
                System.out.println("O arquivo está vazio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
