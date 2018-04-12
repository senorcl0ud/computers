package computers;

public class Main {

    public static void main(String[] args) {
        PC applePC = new PC( new Motherboard("BJ-2000", "Asus",4,6,"vs.44"),
                new Monitor("Macintosh","Apple", 27, new Resolution(2500,1500) ),
                new ComputerCase("zzx10","Dell","110V ", new Dimensions(20,20,5) ) );

        System.out.println(applePC + "\n" + "===============================================================");
        applePC.powerOn();
        System.out.println("=================================================================");
        applePC.getMotherboard().loadProgram("warframe");
        applePC.getMonitor().showLogo(20,40,"red");

    }
}
