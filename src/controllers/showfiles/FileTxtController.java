package controllers.showfiles;

import java.util.List;

import co.edu.uptc.servicesfiles.ProcessesFiles;

public class FileTxtController {
    
    public void testFileTxt(){
        ProcessesFiles processesFile= new ProcessesFiles();
        processesFile.setNameFile(".\\Example.txt");
        List<String> list;
        try {
            list=processesFile.extraerString();
            ConsolaController consolaController= new ConsolaController();
            consolaController.showInfo(list);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
