package controllers.showfiles;

import services.servicesfiles.ProcessesFiles;

public class ShowFiles {
    
    private String path;
    private ProcessesFiles processesFile;

    public ShowFiles(String path){
        this.path=path;
        processesFile= new ProcessesFiles();
    }

    public void showContFile(){
        try {
            processesFile.createFile(path);
            processesFile.openFile();
            System.out.println(processesFile.readFile());
            processesFile.closedFile();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void showDecoder64(){
        try {
            processesFile.createFile(path);
            processesFile.openFile();
            processesFile.readFile();
            System.out.println(processesFile.changeBase64());
            processesFile.closedFile();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}