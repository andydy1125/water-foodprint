import javax.swing.*;
import java.awt.*;

public class WaterFoodprint {
    public static void main(String[] args) {
        int again;
        do {
            double randomNum = Math.random() * 100;
            String randomItem = getRandomItem(randomNum);
            String numGuessed = JOptionPane.showInputDialog(null, "Guess how many liters of water it takes to produce 1 " + randomItem + " on average.", "100");
            while (Integer.parseInt(numGuessed) != getWaterFootprint(randomItem) + 5 || Integer.parseInt(numGuessed) != getWaterFootprint(randomItem) + 5) {
                if (Integer.parseInt(numGuessed) > getWaterFootprint(randomItem)) {
                    JOptionPane.showMessageDialog(null, "Try Again! The average water footprint you guessed for 1 " + randomItem + " is too high.");
                } else if (Integer.parseInt(numGuessed) < getWaterFootprint(randomItem)) {
                    JOptionPane.showMessageDialog(null, "Try Again! The average water footprint you guessed for 1 " + randomItem + " is too low.");
                } else if (Integer.parseInt(numGuessed) <= 0) {
                    JOptionPane.showMessageDialog(null, "The average water footprint for 1 " + randomItem + " can't be less than or equal to 0.");
                }
                numGuessed = JOptionPane.showInputDialog(null, "Guess how many liters of water it takes to produce 1 " + randomItem + " on average.");
            }
            JOptionPane.showMessageDialog(null, "Nice! You closely enough guessed the average water footprint, " + getWaterFootprint(randomItem) + " liters, for 1 " + randomItem + ". " +
                    "Water is a significant factor in our lives and climate change. " +
                    "Therefore, water footprint can help us better understand the importance of reducing global water consumption and adapting to the impacts climate change has on " + "Remember to save water -- you play an important part in the climate!");
            JOptionPane.showMessageDialog(null, "Now you realized the large amount of water it takes to produce even 1 " + randomItem);
            again = JOptionPane.showConfirmDialog(null, "Guess The Water Footprint of Another Item?", "Choose Yes", JOptionPane.YES_NO_OPTION);
        } while (again == 0);
    }

    public static String getRandomItem(double i) {
        String item = "";
        String apple = "apple";
        String banana = "banana";
        String beer = "beer";
        String watermelon = "watermelon";
        String peach = "peach";
        String orange = "orange";
        String egg = "egg";
        String lemon = "lemon";
        String mango = "mango";
        String avocado = "avocado";
        if (i <= 10) {
            item = apple;
        } else if (i <= 20) {
            item = banana;
        } else if (i <= 30) {
            item = beer;
        } else if (i <= 40) {
            item = watermelon;
        } else if (i <= 50) {
            item = peach;
        } else if (i <= 60) {
            item = orange;
        } else if (i <= 70) {
            item = egg;
        } else if (i <= 80) {
            item = lemon;
        } else if (i <= 90) {
            item = mango;
        } else if (i <= 100) {
            item = avocado;
        }
        return item;
    }

    public static int getWaterFootprint(String s) {
        if (s == "apple") {
            return 125;
        } else if (s == "banana") {
            return 160;
        } else if (s == "beer") {
            return 74;
        } else if (s == "watermelon") {
            return 1175;
        } else if (s == "peach") {
            return 140;
        } else if (s == "orange") {
            return 80;
        } else if (s == "egg") {
            return 200;
        } else if (s == "lemon") {
            return 18;
        } else if (s == "mango") {
            return 310;
        } else if (s == "avocado") {
            return 161;
        }
        return 0;
    }
}
