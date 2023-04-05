package com.vmorg.virtualmachine;

public class DesktopMachine extends Machine {
    private String microsoftWindowsVersion;
    private String buildNumber;


    public DesktopMachine(String hostname, String requestorName, int numberOfCPUs, int RAMSizeInGB, int hardDistSizeInGB, String microsoftWindowsVersion, String buildNumber) {
        super(hostname, requestorName, numberOfCPUs, RAMSizeInGB, hardDistSizeInGB);
        this.microsoftWindowsVersion = microsoftWindowsVersion;
        this.buildNumber = buildNumber;
    }
}
