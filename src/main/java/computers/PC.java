package computers;



public class PC {
   private Motherboard motherboard;
   private Monitor monitor;
   private ComputerCase computerCase;

   public PC(Motherboard motherboard, Monitor monitor, ComputerCase computerCase){
       this.motherboard = motherboard;
       this.monitor = monitor;
       this.computerCase = computerCase;
   }


   private void drawLogo(){
       monitor.showLogo(1200,50,"silver");
   }

   public void powerOn(){
        computerCase.pressPowerButton();
        this.drawLogo();
   }

    public Motherboard getMotherboard() {
        return motherboard;
    }


    public Monitor getMonitor() {
        return monitor;
    }



    public ComputerCase getComputerCase() {
        return computerCase;
    }


    @Override
    public String toString() {
        return "PC{" +
                "motherboard=" + motherboard + "\n" +
                ", monitor=" + monitor + "\n" +
                ", computerCase=" + computerCase +
                '}';
    }
}

