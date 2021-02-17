package homework.java2.lesson6.client;

import java.io.*;
import java.net.Socket;



class Client {

    private static Socket clientSocket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            clientSocket = new Socket("localhost", 8082);
            System.out.println("Клиент запущен!");
            reader = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            Thread input = new Thread(() -> {
                while (true) {
                    try {

                        String word = reader.readLine();
                        out.write(word + "\n");
                        out.flush();
                        if (word.equalsIgnoreCase("finish")) {
                            System.out.println("Закончили");
                            break;
                        }
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                }

            });
            input.setDaemon(true);
            input.start();
            try {
                while (true) {
                    String serverWord = null;
                    // try {
                    serverWord = in.readLine();
                    System.out.println(serverWord);
                }

            } catch (IOException e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
