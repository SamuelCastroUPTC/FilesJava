package controllers.showfiles;

import java.util.List;

public class ConsolaController {
    

    public void showInfo(List<String> list){
        for (String string : list) {
            System.out.println(string);
        }
    }

    public void showInfo(byte[] bytes){
        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}
