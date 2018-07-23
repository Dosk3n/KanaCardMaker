/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanacardmaker;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;

/**
 *
 * @author Dean.Tearse
 */
public class Flashcard implements Serializable {
    // Class that holds the location to an image for the flashcard and the word the flashcard relates to (filename)
    private byte[] imageData;
    private String word;

    Flashcard(File f, String w) {
        word = w;
        imageData = FileToBytes(f);
    }
    
    private byte[] FileToBytes(File f) {
        // Take the file data and conver it to bytes
        byte[] fileContent = null;
        
        try {
            
            fileContent = Files.readAllBytes(f.toPath());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return fileContent;
    }
}
