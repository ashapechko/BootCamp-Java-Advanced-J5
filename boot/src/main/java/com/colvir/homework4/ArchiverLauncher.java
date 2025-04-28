package com.colvir.homework4;

import com.colvir.homework4.service.ArchiverService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class ArchiverLauncher {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ArchiverLauncher.class, args)) {
            ArchiverService archiverService = applicationContext.getBean(ArchiverService.class);

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введите путь к файлу для архивирования: ");
                String filePath = scanner.nextLine();

                try {
                    String zipFilePath = archiverService.archive(filePath);
                    System.out.println("Файл успешно заархивирован: " + zipFilePath);
                } catch (Exception ex) {
                    System.err.println("Ошибка архивирования: " + ex.getMessage());
                }
            }
        }
    }
}
