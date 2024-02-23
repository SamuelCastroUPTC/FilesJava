package controllers.showfiles;

import java.util.List;

public class ConsolaController {
    

    public void showInfo(List<String> list){
        for (String string : list) {
            System.out.println(string);
        }
    }
}
