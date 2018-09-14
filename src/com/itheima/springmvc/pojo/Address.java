package com.itheima.springmvc.pojo;

public class Address {
    private Integer hostId;

    private String hostName;

    private String hostAddress;

    private String hostType;

    private Float longitude;

    private Float latitude;

    public boolean messageFull(){
    	if(hostId!=null&&hostAddress!=null&&!hostType.equals("")&&longitude!=null&&latitude!=null){
    		return true;
    	}
    	else
    		return false;
    }
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress == null ? null : hostAddress.trim();
    }

    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType == null ? null : hostType.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
}