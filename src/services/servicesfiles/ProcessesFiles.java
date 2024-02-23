package services.servicesfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Base64;

public class ProcessesFiles {
    private File file;
    private BufferedReader bufferedReader;
    private ArrayList<String> content;

    public void createFile(String path){
        file= new File(path);
        content= new ArrayList<String>();
    }

    public void openFile() throws Exception{
        bufferedReader = new BufferedReader(new FileReader(file));
        
    }

    public String readFile() throws Exception{
        String cont="";
        while ((cont=bufferedReader.readLine())!=null) {
            content.add(cont);
        }
        return cont;
    }

    public void closedFile() throws Exception{
        bufferedReader.close();
    }

    public String changeBase64() {
        String base64="";
        for (String contentbase64 : content) {
            base64=base64+contentbase64;
        }
        byte[] bytesDecoded= Base64.getDecoder().decode(base64);
        String conteded=new String(bytesDecoded);
        return conteded;
    }


}
