class Singleton {
    public static void main (String[] args){
        System.out.println("Attempting to create first instance:");
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        System.out.println();

        System.out.println("Attempting to create second instance:");
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect();

        System.out.println();

        if (connection1 == connection2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }

        connection1.disconnect();
    }
}