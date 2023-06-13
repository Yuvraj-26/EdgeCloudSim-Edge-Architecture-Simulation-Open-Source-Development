/*
 * Title:        EdgeCloudSim - CloudServerManager
 *
 * Description:
 * CloudServerManager is responsible for creating and terminating
 * the cloud datacenters which operates the hosts and VMs.
 * It also provides the list of VMs running on the hosts and
 * the average utilization of all VMs.
 *
 * Please note that, EdgeCloudSim is built on top of CloudSim
 * Therefore, all the computational units are handled by CloudSim
 *
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.cloud_server;

//Import required libraries
import java.util.ArrayList;
import java.util.List;

import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.VmAllocationPolicy;

//Public class for CloudServerManager
public abstract class CloudServerManager {
	protected Datacenter localDatacenter;
	protected List<List<CloudVM>> vmList;
	//Initilaise CloudServerManager
	public CloudServerManager() {
		vmList = new ArrayList<List<CloudVM>>();
	}
	//initialize Cloud VM
	public List<CloudVM> getVmList(int hostId){
		return vmList.get(hostId);
	}
	//Initialise Datacenter
	public Datacenter getDatacenter(){
		return localDatacenter;
	}

	/*
	 *Initialize edge server manager if required
	 */
	public abstract void initialize();

	/*
	 *Provides abstract Vm Allocation Policy for Cloud Datacenters
	 */
	public abstract VmAllocationPolicy getVmAllocationPolicy(List<? extends Host> list, int dataCenterIndex);

	/*
	 *Starts Datacenters
	 */
	public abstract void startDatacenters() throws Exception;

	/*
	 *Terminates Datacenters
	 */
	public abstract void terminateDatacenters();
	/*
	 *Creates VM List
	 */
	public abstract void createVmList(int brokerId);

	/*
	 *Returns average utilization of all VMs
	 */
	public abstract double getAvgUtilization();
}
