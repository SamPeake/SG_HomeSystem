public class Device {
    private String deviceID;
    private Boolean onFlag;
    private String[] ports;
    private String role;

    public Device() {
        // TODO Auto-generated constructor stub
    }
    public Device(String deviceID, String[] ports, String role) {
        this.deviceID = deviceID;
        this.ports = ports;
        this.role = role;
    }

    /**
     * @return String return the deviceID
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * @return Boolean return the onFlag
     */
    public Boolean isOnFlag() {
        return onFlag;
    }

    /**
     * @param onFlag the onFlag to set
     */
    public void setOnFlag(Boolean onFlag) {
        this.onFlag = onFlag;
    }

    /**
     * @return String[] return the ports
     */
    public String[] getPorts() {
        return ports;
    }

    /**
     * @param ports the ports to set
     */
    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    /**
     * @return String return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

}