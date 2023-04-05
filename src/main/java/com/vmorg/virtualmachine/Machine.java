package com.vmorg.virtualmachine;

public abstract class Machine {
    private String hostname;
    private String requestorName;
    private int numberOfCPUs;
    private int RAMSizeInGB;
    private int hardDistSizeInGB;

    public String getHostname() {
        return hostname;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public int getRAMSizeInGB() {
        return RAMSizeInGB;
    }

    public int getHardDistSizeInGB() {
        return hardDistSizeInGB;
    }

    public Machine(String hostname, String requestorName, int numberOfCPUs, int RAMSizeInGB, int hardDistSizeInGB) {
        this.hostname = hostname;
        this.requestorName = requestorName;
        this.numberOfCPUs = numberOfCPUs;
        this.RAMSizeInGB = RAMSizeInGB;
        this.hardDistSizeInGB = hardDistSizeInGB;
    }
}
