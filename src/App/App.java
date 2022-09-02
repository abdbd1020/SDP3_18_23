package App;

import WindowManager.WindowManager;
import ConfigManager.ConfigManager;
import factory.HighDetailedFactory;
import factory.SimplisticFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            WindowManager windowManager = new WindowManager();
            windowManager.run(args);
        });
        mainMenu(thread);
    }

    private static void mainMenu(Thread guiThread){
        while(true) {
            try {
                System.out.println("Please write the file path(must be xml or config file) :");
                System.out.println("example: src/config.txt");
                Scanner scanner = new Scanner(System.in);
                String filePath = scanner.nextLine();


                System.out.println("Please select the style");
                System.out.println("1. Simplistic");
                System.out.println("2. High Detailed");


                int styleChoice = scanner.nextInt();
                if(styleChoice != 1 && styleChoice != 2)
                    throw new InputMismatchException("Invalid number");


                File file = new File(filePath);
                if(!file.isFile())
                    throw new FileNotFoundException("\"file\" is invalid \n");

                ConfigManager.getInstance().setFileName(filePath);



                if(styleChoice == 1){
                    ConfigManager.getInstance().setFactoryType(new SimplisticFactory());
                }
                else{
                    ConfigManager.getInstance().setFactoryType(new HighDetailedFactory());
                }
                guiThread.start();

            } catch (FileNotFoundException exception){
                System.out.println(exception.getMessage());
            }
        }
    }




}
