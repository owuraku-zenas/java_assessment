package com.vmorg.requestengine;

import com.vmorg.buildrequest.VirtualMachineRequestor;
import com.vmorg.virtualmachine.Machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestEngine implements VirtualMachineRequestor {

    private static int maxBuiltMachines;
    private List<Machine> successfullyCreatedVMs = new ArrayList<>(maxBuiltMachines);
    private List<Machine> failedCreatedVMs = new ArrayList<>();


    public List<Machine> getSuccessfullyCreatedVMs() {
        return successfullyCreatedVMs;
    }

    public int getNumberOfSuccessfullyCreatedVMs() {
        return successfullyCreatedVMs.size();
    }

    public List<Machine> getFailedCreatedVMs() {
        return failedCreatedVMs;
    }



    @Override
    public void createNewRequest(Machine machine) {
        String user = machine.getRequestorName();
        //

    }

    @Override
    public Map<String, Map<String, Integer>> totalBuildsByUserForDay() {
        Map<String, Map<String, Integer>> totalBuilds = new HashMap<>();


        return totalBuilds;
    }

    @Override
    public int totalFailedBuildsForDay() {
        return failedCreatedVMs.size();
    }
}
