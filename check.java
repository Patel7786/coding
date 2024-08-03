public class check {

    public static int findMaximumBalancedShipments(int[] weights) {
        if (weights == null || weights.length == 0) {
            return 0;
        }

        int shipments = 0;
        int currentShipmentWeight = 0;
        int previousMaxWeight = Integer.MIN_VALUE;

        for (int weight : weights) {
            currentShipmentWeight += weight;

            if (currentShipmentWeight == previousMaxWeight) {
                shipments++;
                currentShipmentWeight = 0;
                previousMaxWeight = Integer.MIN_VALUE;
            } else if (currentShipmentWeight >= previousMaxWeight) {
                previousMaxWeight = currentShipmentWeight;
                currentShipmentWeight = weight;
            }
        }

        if (currentShipmentWeight == previousMaxWeight) {
            shipments++;
        }

        return shipments;
    }

    public static void main(String[] arg) {
        int[] weight = { 1, 2, 3, 2, 6, 3 };
        System.out.println(findMaximumBalancedShipments(weight)); // Output: 2
    }
}