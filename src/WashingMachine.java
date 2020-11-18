public class WashingMachine {
    private void periodicMaintenance() {}
    private double WashingMachinelength;
    private double WashingMachineheight;
    private double WashingMachinedepth;
    private String WashingMachineConstructor_Name;
    private String WashingMachinePackage_Name;
    private String WashingMachinePackage_Type;
    private double WashingMachineEnergy_Consume;
    private double WashingMachineRPM; //cycles per minute//

    public WashingMachine(double WashingMachinelength,
                double WashingMachineheight,
                double WashingMachinedepth,
                String WashingMachineConstructor_Name,
                String WashingMachinePackage_Name,
                String WashingMachinePackage_Type,
                double WashingMachineEnergy_Consume,
                double WashingMachineRPM
    ){
        this.WashingMachinelength= WashingMachinelength;
        this.WashingMachineheight= WashingMachineheight;
        this.WashingMachinedepth= WashingMachinedepth;
        this.WashingMachineConstructor_Name= WashingMachineConstructor_Name;
        this.WashingMachinePackage_Type= WashingMachinePackage_Type;
        this.WashingMachinePackage_Name= WashingMachinePackage_Name;
        this.WashingMachineEnergy_Consume=WashingMachineEnergy_Consume;
    }
    public void setWashingMachinelength(double newWashingMachinelenght){
        WashingMachinelength = newWashingMachinelenght;
    }
    public void setWashingMachineheight(double newWashingMachineheight){
        WashingMachineheight= newWashingMachineheight;
    }
    public void setWashingMachinedepth(double newWashingMachinedepth){
        WashingMachinedepth= newWashingMachinedepth;
    }
    public void setWashingMachineConstructor_Name(String newWashingMachineConstructor_Name){
       WashingMachineConstructor_Name= newWashingMachineConstructor_Name;
    }

    public void setWashingMachinePackage_Type(String newWashingMachinePackage_Type) {
        WashingMachinePackage_Type = newWashingMachinePackage_Type;
    }

    public void setWashingMachinePackage_Name(String newWashingMachinePackage_Name) {
        WashingMachinePackage_Name = newWashingMachinePackage_Name;
    }

    public void setWashingMachineEnergy_Consume(double newWashingMachineEnergy_Consume) {
        WashingMachineEnergy_Consume = newWashingMachineEnergy_Consume;
    }
    public void setWashingMachineRPM(double newWashingMachineRPM){
        WashingMachineRPM = newWashingMachineRPM;
    }
}

