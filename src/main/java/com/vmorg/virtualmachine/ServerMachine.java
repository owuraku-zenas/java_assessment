package com.vmorg.virtualmachine;

public class ServerMachine extends Machine {
    private String distroName;
    private int majorNumberOfDistribution;
    private String kernelVersion;
    private String administrativeTeam;

    public ServerMachine(String hostname, String requestorName, int numberOfCPUs, int RAMSizeInGB, int hardDistSizeInGB, String distroName, int majorNumberOfDistribution, String kernelVersion, String administrativeTeam) {
        super(hostname, requestorName, numberOfCPUs, RAMSizeInGB, hardDistSizeInGB);
        this.distroName = distroName;
        this.majorNumberOfDistribution = majorNumberOfDistribution;
        this.kernelVersion = kernelVersion;
        this.administrativeTeam = administrativeTeam;
    }
}
