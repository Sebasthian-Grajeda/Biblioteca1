import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put ("1" , 40);
        ageMap.put ("2", 60);
        ageMap.put ("3", 70);
        ageMap.put ("4", 80);
        ageMap.put ("5", 90);
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        }

}
