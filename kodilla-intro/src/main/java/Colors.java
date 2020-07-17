import java.util.Scanner;
public class Colors {
        public static void main(String[] args) {
            Colors cp = new Colors();
            String colour = cp.getColour();
            System.out.println("Colour selected by code : " + colour);
        }

        public String getColour(){
            String colourCode = UserDialogs.askForColour();
            String colour = "Sorry, but personally I don't know colour like that.";
            switch(colourCode){
                case "A" : colour =  "Aubergine"; break;
                case "B" : colour = "Blue"; break;
                case "W" : colour = "White"; break;
                case "Y" : colour = "Yellow"; break;
                case "R" : colour = "Red"; break;
                case "G" : colour = "Green"; break;
            }
            return colour;
        }
    }
