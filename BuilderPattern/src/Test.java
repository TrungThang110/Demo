public class Test {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop.LaptopBuilder("16 GB", "240 GB", "2.56 HZ").build();
        System.out.println("Thông tin của laptop 1 là :"+laptop1);
        Laptop laptop2 = new Laptop.LaptopBuilder("32 GB", "1024 GB", "2.56 HZ").setBluetoothEnable(true).setGraphicsEnable(false).build();
        System.out.println("Thông tin của laptop 2 là :"+laptop2);
        Laptop laptop3 = new Laptop.LaptopBuilder("32 GB", "240 GB", "2.56 HZ").setBluetoothEnable(true).build();
        System.out.println("Thông tin của laptop 3 là :"+laptop3);

    }
}
