public class LadderMain {
    public static void main(String[] args) {
        int steps = 5;
        Ladder.climb(steps);
        
        boolean isFolded = true;
        Ladder.fold(isFolded);
        
        double height = 2.5;
        Ladder.height(height);
        
        String materialType = "Aluminum";
        Ladder.material(materialType);
        
        int weightLimit = 150;
        Ladder.weightCapacity(weightLimit);
        
        String color = "Silver";
        Ladder.color(color);
        
        String manufacturerName = "ABC Ladders";
        Ladder.manufacturer(manufacturerName);
    }
}
