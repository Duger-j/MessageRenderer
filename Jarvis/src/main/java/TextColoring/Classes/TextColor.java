package TextColoring.Classes;

import TextColoring.Interfaces.ColorProvider;

public class TextColor implements ColorProvider {
    public String getColor(String message) {
        if(message.contains("Warning: ")){
            return "red color";
        }
        return "white";
    }

}
