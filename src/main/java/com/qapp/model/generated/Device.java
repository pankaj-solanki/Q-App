package com.qapp.model.generated;

import com.qapp.model.ModelRootClass;

public class Device extends ModelRootClass {
  private Long imei;

  private String serial;

  private String mac;

  private String deviceTypeId;

  private String osId;

  private String majorVersion;

  private String minorVersion;

  public Long getImei() {
    return imei;
  }

  public void setImei(Long imei) {
    this.imei = imei;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial == null ? null : serial.trim();
  }

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac == null ? null : mac.trim();
  }

  public String getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(String deviceTypeId) {
    this.deviceTypeId = deviceTypeId == null ? null : deviceTypeId.trim();
  }

  public String getOsId() {
    return osId;
  }

  public void setOsId(String osId) {
    this.osId = osId == null ? null : osId.trim();
  }

  public String getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(String majorVersion) {
    this.majorVersion = majorVersion == null ? null : majorVersion.trim();
  }

  public String getMinorVersion() {
    return minorVersion;
  }

  public void setMinorVersion(String minorVersion) {
    this.minorVersion = minorVersion == null ? null : minorVersion.trim();
  }
}
