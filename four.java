class four {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] roomNumbers = {101, 102, 103};
        String[] roomTypes = {"Single", "Double", "Suite"};
        Double[] roomPrices = {2000.0, 3500.0, 5000.0};

        printArray(roomNumbers);
        printArray(roomTypes);
        printArray(roomPrices);
    }
}