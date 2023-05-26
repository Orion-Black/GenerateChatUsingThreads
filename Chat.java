package Ejericicio16;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
//Programa -- Escribir un programa que imprima una serie de mensajes
//dentro de un chat simulado con pausas de 2 segundos entre mensajes y escritura lenta
//a velocidad aleatoria
//Guardamos mensajes de cada persona en un arreglo independiente
        String[] messagesMeg = {"Hi, there!", "What are you doing?", "What are you working on?"
                , "I'm in a cafe with my friend Carmen,\nI'm having coffe, and she's talking on\n" +
                "the phone outside. How is your family?", "Where's your brother?", "OK! Bye!"};
        String[] messagesKathy = {"Hi, Meg!", "I'm sitting on my bed with my \nlaptop. I'm doing my homework."
                , "I'm writing an essay for Spanish \nclass. :) Where are you?", "They're all fine!" +
                " My father's \nwatching a baseball game with his \nfriends. My mother is out shopping"
                , "John's playing saccer in the park. Oh, \nwait. My phone is ringing. My mother's \ncalling me. " +
                "I have to go! Bye!", " "};
        for (int i = 0; i < messagesMeg.length; i++) {
//Imprimimos lentamente cada mensaje
            System.out.print("megm: ");
            for (int j = 0; j < messagesMeg[i].length(); j++) {
                System.out.print("\u001B[31m" + messagesMeg[i].charAt(j) + "\u001B[0m");
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            esperar2Segundos();
            System.out.println("\n");
            System.out.print("kathyo: ");
            for (int j = 0; j < messagesKathy[i].length(); j++) {
                System.out.print("\u001B[32m" + messagesKathy[i].charAt(j) + "\u001B[0m");
                try {
                    Thread.sleep(130);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n");
            esperar2Segundos();
        }
//apartado de preguntas
        System.out.println("Read the conversation. Who is doing these things? Complete the sentences.");
        String[] questions = {"1.____________ is writing a essay.", "2.____________ is having a coffe.", "3.____________ is talking on the phone."
                , "4.____________ is watching a baseball game", "5.____________ is shopping", "6.____________ is playing soccer"};
        Scanner leerRespuesta = new Scanner(System.in);
        String respuesta;
        int conteoRespuestas = 0;
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length(); j++) {
                System.out.print(questions[i].charAt(j));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            switch (i) {
                case 0:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("kathy")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, kathy is correct.");
                    }
                    break;
                case 1:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("meg")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, meg is correct.");
                    }
                    break;
                case 2:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("carmen")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, carmen is correct.");
                    }
                    break;
                case 3:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("father")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, father is correct.");
                    }
                    break;
                case 4:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("mother")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, mother is correct.");
                    }
                    break;
                case 5:
                    System.out.print("\nReply: ");
                    respuesta = leerRespuesta.nextLine().toLowerCase();
                    if (respuesta.equals("jhon")) {
                        conteoRespuestas++;
                        System.out.println("Correct");
                    } else {
                        System.out.println("Fail, jhon is correct.");
                    }
                    break;
            }
        }
        System.out.println("Total correct answers: " + conteoRespuestas + "/6");
    }

    static void esperar2Segundos() {
        try {
            Thread.sleep(2000); //Esperar 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
    }
}



