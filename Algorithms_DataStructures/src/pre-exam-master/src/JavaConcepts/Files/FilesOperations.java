package JavaConcepts.Files;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FilesOperations {

    public static void main(String args[]) {
        FileSystem fileSystem = new FileSystem();
        File f = fileSystem.createFile("test.txt" , "D:");
        System.out.println(f.getAbsoluteFile());

        // write to file

        // 1- with buffer
        System.out.println(fileSystem.writeToFileWithBuffer("AHMED", f));

        // 2- with writer
        System.out.println(fileSystem.writeToFileWithWriter("KOSHARY", f));


        // read from file

        // 1- with buffer
        System.out.println(fileSystem.readFromFileWithBuffer(f));

        // 2- with Reader
        System.out.println(fileSystem.readFromFileWithReader(f));
    }


}


class FileSystem {

    boolean writeToFileWithBuffer(String buffer, File f) {
        if (!f.exists()) {
            return false;
        }
        Writer r;
        try {
            r = new FileWriter(f, true); // false for not append
            BufferedWriter writer = new BufferedWriter(r);
            buffer+= "\r\n";
            writer.append(buffer);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    boolean writeToFileWithWriter(String buffer, File f) {
        if (!f.exists()) return false;
        try {
            Writer writer = new FileWriter(f, true); //false for not append
            buffer+= "\r\n";
            writer.write(buffer);
            writer.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    String readFromFileWithBuffer(File f) {
        String res = "";
        if (!f.exists()) {
            return null;
        }
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(f));
            try {
                String cur = buffer.readLine();
                while (cur != null) {
                    res += cur;
                    cur = buffer.readLine();
                    if (cur != null) {
                        res += "\n";
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

    String readFromFileWithReader(File f) {
        String res = "";
        try {
            Reader reader = new FileReader(f);
            try {
                int c = reader.read();
                while (c > -1) {
                    res += (char) c;
                    c = reader.read();
                }
            } catch (IOException ex) {
                Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    File createFile(String fileName, String path) {
        File f = new File(path + "\\" + fileName);
        if(f.exists()) return f;
        try {
            return f.createNewFile() ? f : null;
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

