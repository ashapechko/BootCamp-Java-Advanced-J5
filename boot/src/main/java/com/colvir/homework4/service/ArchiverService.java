package com.colvir.homework4.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class ArchiverService {
    public String archive(String filePath) throws IOException {
        File fileToArchive = new File(filePath);
        if (!fileToArchive.exists() || !fileToArchive.isFile()) {
            throw new IllegalArgumentException("Файл не найден или это не файл.");
        }

        String outputFilePath = fileToArchive.getParent()
                + File.separator + fileToArchive.getName() + ".zip";

        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
             ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream(fileToArchive)) {

            ZipEntry zipEntry = new ZipEntry(fileToArchive.getName());
            zipOutputStream.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }
        }
        return outputFilePath;
    }
}
