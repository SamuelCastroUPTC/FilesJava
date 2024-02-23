import controllers.showfiles.ShowFiles;

public class App {
    public static void main(String[] args) {
        ShowFiles showFiles= new ShowFiles(".\\ExampleBase64.txt");
        showFiles.showDecoder64();
    }
}
