public class BonusMilesService {
    public int calculate(int price) {
        int minimumAmount = 20;
        int miles;
        if (price >= 20) {
            miles = price / minimumAmount;
        } else {
            miles = 0;
        }
        return miles;

    }
}
