public class VehicleFrame implements Chassis{

  String vehicleFrameType;

  public VehicleFrame(){
    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    this.vehicleFrameType = vehicleFrameType;
  }
  public String toString() {
    return "Chassis             : " + Chassis.CHASSIS + "\n"
        +  "Vehicle Frame       : " + vehicleFrameType;
  }

  public static void main(String[] args) {
    VehicleFrame testvf1 = new VehicleFrame();
    System.out.println(testvf1);


    VehicleFrame testvf2 = new VehicleFrame("Ladder Frame");
    System.out.println(testvf2);



  }
}
