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
    return "Chassis " + Chassis.CHASSIS
        + "Vehicle Frame " + vehicleFrameType;
  }

  public static void main(String[] args) {

  }
}
