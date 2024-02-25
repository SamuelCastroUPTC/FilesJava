package controllers.showfiles;

import co.edu.uptc.servicesfiles.ProcessesFiles;

public class FileTxtController {
    
    public void testFileTxt(){
        ProcessesFiles processesFile= new ProcessesFiles();
        processesFile.setNameFile(".\\Example.txt");
        byte[] bytes;
        try {
            bytes=processesFile.extraerStringByte();
            ConsolaController consolaController= new ConsolaController();
            consolaController.showInfo(bytes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
