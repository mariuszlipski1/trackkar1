package com.app.trackcar1.trackkar1;

import java.util.Objects;

public class Device {

    private Long id;

    private String name;

    private String uniqueId;

    private String status;

    private boolean disabled;


    public Device() {
    }

    public Device(Long id, String name, String uniqueId, String status, boolean disabled) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.status = status;
        this.disabled = disabled;
    }

    public Device(int i, String test, int i1, String online, int i2) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return isDisabled() == device.isDisabled() &&
                getId().equals(device.getId()) &&
                getName().equals(device.getName()) &&
                getUniqueId().equals(device.getUniqueId()) &&
                getStatus().equals(device.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUniqueId(), getStatus(), isDisabled());
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                '}';
    }


}
