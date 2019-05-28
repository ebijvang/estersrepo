package nl.ordina.todolist;

import nl.ordina.todolist.core.usecase.CreateTaak;
import nl.ordina.todolist.core.usecase.CreateTaakBoundary;

import java.io.Console;

public class App {
    public static void main (String[] args){
        CreateTaakBoundary createTaak = new CreateTaak();
        Console console = System.console();
        while (true){
            String command = console.readLine("todo>:");
            switch (command){
                case "exit":
                    System.exit(0);
                case "create":
                    createTaak.execute(null,null,null);
                    break;
                case "list":
                    System.out.println(command);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

}
