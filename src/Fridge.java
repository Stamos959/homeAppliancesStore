public class Fridge {

    private void periodicMaintenance() {}

    private double Fridgelength;
    private double Fridgeheight;
    private double Fridgedepth;
    private String FridgeConstructor_Name;
    private String FridgePackage_Name;
    private String FridgePackage_Type;
    private double FridgeEnergy_Consume;

    public Fridge(double Fridgelength,
                  double Fridgeheight,
                  double Fridgedepth,
                  String FridgeConstructor_Name,
                  String FridgePackage_Name,
                  String FridgePackage_Type,
                  double FridgeEnergy_Consume
    ) {
        this.Fridgelength= Fridgelength;
        this.Fridgeheight= Fridgeheight;
        this.Fridgedepth= Fridgedepth;
        this.FridgeConstructor_Name= FridgeConstructor_Name;
        this.FridgePackage_Type= FridgePackage_Type;
        this.FridgePackage_Name= FridgePackage_Name;
        this.FridgeEnergy_Consume=FridgeEnergy_Consume;
    }
  public void setFridgelength(double newFridgelenght){
        Fridgelength = newFridgelenght;
  }
  public void setFridgeheight(double newFridgeheight){
        Fridgeheight= newFridgeheight;
  }
  public void setFridgedepth(double newFridgedepth){
        Fridgedepth= newFridgedepth;
  }
  public void setFridgeConstructor_Name(String newFridgeConstructor_Name){
        FridgeConstructor_Name= newFridgeConstructor_Name;
  }

    public void setFridgePackage_Type(String newFridgePackage_Type) {
        FridgePackage_Type = newFridgePackage_Type;
    }

    public void setFridgePackage_Name(String newFridgePackage_Name) {
        FridgePackage_Name = newFridgePackage_Name;
    }

    public void setFridgeEnergy_Consume(double newFridgeEnergy_Consume) {
        FridgeEnergy_Consume = newFridgeEnergy_Consume;
    }
}
