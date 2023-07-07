# EdgeCloudSim
# Edge / Cloud Architecture Simulation 
Created by Yuvraj M

## Project Summary

IoT devices use **Artificial Intelligence** and **Machine Learning** to provide intelligence and autonomy to systems. The unprecedented scale and complexity of data generated by IoT devices uncover the limitations of cloud computing. As a result, **Edge Computing**, a distributed computing paradigm that brings data storage and computation resources to the network edge, is proposed to fulfil IoT requirements such as latency, location awareness, and mobility support. 

Edge computing involves more complex architecture design; hence both computational and networking resources are analysed. In this investigation, EdgeCloudSim is utilised to investigate the effect of scalability parameters in an edge environment. A technical evaluation for each significant parameter identifies if the architecture remains
effective after increasing the number of users (load condition) and resources. This project investigates the **scalability** of three edge architectures: **single-tier**, **two-tier**, and **two-tier with Edge Orchestrator (EO)** for a face recognition / augmented reality application that demands low latency and percentage of failed tasks.

## EdgeCloudSim

**EdgeCloudSim** provides a simulation environment specific to Edge Computing scenarios where it is possible to conduct experiments that considers both computational and networking resources. EdgeCloudSim is based on CloudSim but adds considerable functionality so that it can be efficiently used for Edge Computing scenarios. EdgeCloudSim is an open source tool and any contributions are welcome. If you want to contribute EdgeCloudSim, please check below feature list and the [contributing guidelines](/CONTRIBUTING.md). If you want to use EdgeCloudSim in your research work, please cite our paper [[3]](https://onlinelibrary.wiley.com/doi/abs/10.1002/ett.3493).


## Experiment Design

The following stages outline the experiment design:

1. **Initial experiment**: This is designed as an experiment base to identify parameters that require investigation across three edge architectures.

2. **Effect of edge servers**: This is designed to investigate the availability of edge servers
by evaluating an increase in edge servers on the percentage of failed tasks.

3. **Effect of WLAN bandwidth**: This is designed to investigate the effect of increasing
WLAN bandwidth on the network delay.

4. **Effect of VM processing speed**: This is designed to investigate increasing VM
processing speed on the percentage of failed tasks.

5. **Effect of WLAN bandwidth and VM processing speed**: This is designed to investigate the effect of increasing both WLAN bandwidth and VM processing speed on
performance in terms of scalability.  

## Hypthesis Confirmation

The devised hypotheses for this empirical investigation are validated with the findings of the
experiment.


✅ **Hypothesis 1** – An increase in the number of edge servers reduces the percentage of
failed tasks, service time, and VM utilisation.

✅ **Hypothesis 2** – An increase in WLAN bandwidth reduces the network delay

✅ **Hypothesis 3** – An Increase in VM processing speed reduces the percentage of failed
tasks

✅ **Hypothesis 4**– An increase in VM processing speed and WLAN bandwidth reduces the
percentage of failed tasks, service time, and VM utilisation


# Recommendations for Future Edge Architecture Design and implementation

1. **Edge Architecture scalability**  – The recommended edge architecture for a face recognition application in augmented reality is a two-tier architecture with EO. This architecture offers superior performance and scalability compared to other options. Under increased load conditions, the two-tier with EO consistently outperforms other architectures in terms of failed tasks and service time. While VM utilization is high due to other edge servers, it can be significantly reduced by adjusting scalability parameters.

2. **The link between VM processing Speed and WLAN bandwidth** – The link between VM processing speed and WLAN bandwidth was investigated in relation to edge servers. Experiments revealed that increasing WLAN bandwidth improves WLAN delay but does not significantly reduce failed tasks, especially under high load conditions. On the other hand, increasing VM processing speed leads to a notable decrease in failed tasks but does not improve network delay. Consequently, increasing both parameters results in increased WLAN bandwidth facilitating faster task request arrival, while enhanced VM processing speed ensures effective handling of all requests. The combination of these key parameters further improves scalability and overall performance.

3. **The trade-off between performance and computational resources** – Optimal edge computing configurations vary based on application demands. For latency-sensitive and real-time applications, a setup with 900 Mbps WLAN bandwidth and 4000 MIPS processing speed achieves near-zero failed tasks. A slightly lower performance, with 700 Mbps WLAN bandwidth and 3000 MIPS, suffices for certain applications. Strategic simulation-based deployment of edge resources, considering requirements and cost/energy factors, is recommended.


4. **Handling the mobility of IoT devices** – To support mobility in wireless networks, low-latency task processing is vital. Task failure due to mobility serves as a key metric, requiring dynamic resource migration across edge nodes. For IoT devices, allocating sufficient computational resources ensures timely task completion before leaving the WLAN area. Efficient handoff of processing requests is recommended for highly mobile devices like driverless vehicles.


## Results and Graphs
**Initial Experiment Results**


<p align="center">
  <img src="/doc/images/initial.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/initial2.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/initial3.jpg" width="65%">
</p>

**Final Experiment Results**

<p align="center">
  <img src="/doc/images/1.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/2.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/3.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/4.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/5.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/6.jpg" width="65%">
</p>

<p align="center">
  <img src="/doc/images/7.jpg" width="65%">
</p>

## Running Simulations in EdgeCloudSim


Operating system - Ubuntu | LINUX

To compile the application

```
./compile.sh
```

To run the default configuration singly: 

```
./runner.sh simulation_output default_config edge_devices.xml applications.xml 10
```

- simulation_output is the output file name
- default_config is the default configuration file
- 10 is the number of iterations of the simulation

Or to run the simulation in parallel

```
./run_scenarios.sh a b 
```
- /run_scenarios takes the runner .sh and runs several iterations in parallel
- a defines the number of processors
- b defines the number of iterations performed 

# My Contributions
1. The project investigated several types of edge architectures, principally single-tier, two-tier, and two-tier with Edge Orchestrator (EO) deployed in a specific domain to determine the effect of computational and networking system parameters on performance results.

2. Experiment results were formatted graphically into readable graphs for ease of interpretation.

3. Created TaskProperty Class in TaskProperty module which is a custom class used in Load Generator Model to store tasks information (EdgeTask) 

4. Fixed major bugs to allow the simulator to work in the specific Edge Environment for a Facial recognition / Augmented reality application utilised by 350 devices. Thus, identifying if the architecture remains effective after increasing the number of users (load condition) substantially.

5. Modified the EdgeCloudSim Sim logger to allow accurate and reliable simulation of two or more scalability parameters simultaneously, permitting the investigation of both WLAN bandwidth and VM processing speed at the same time on each Edge architecture.

6. Provided extensive research and evaluation of simulation results to explain Task migration among the Edge or Cloud VMs

7. Generated valid simulation data using EdgeCloudSim, backed by a literature review of leading edge computing research, to provide valuable recommendations for future IoT applications.

## Future Work
1. Conducting further experiments using a wider combination of scalability parameters.

2. Considering energy-aware edge server placement to improve scalability.

3. Performing a reliability analysis of edge scenarios to understand the exact behaviour and impact of high mobility of IoT devices on edge infrastructure.

4. A deeper analysis of simulation results for the edge servers and the cloud separately to realise instances where offloading to the cloud provides favourable performance.
For instance, finding whether local processing, edge server offloading, or remote cloud server offloading provides enhanced performance.

5. Further encompassing EdgeCloudSim to evaluate the computational cost of increasing scalability parameters.

6. Utilising different edge orchestration policies to investigate better scalability.

7. Evaluating the effect of different tasks sizes and task migration among edge nodes.

8. Real-world software deployment to confirm the validity and reliability of simulation results.


## Ease of Use
EdgeCloudSim reads parameters dynamically from the following files:
- **config.properties:** Simulation settings are managed in configuration file
- **applications.xml:** Application properties are stored in xml file
- **edge_devices.xml:** Edge devices (datacenters, hosts, VMs etc.) are defined in xml file

<p align="center">
  <img src="/doc/images/ease_of_use.png" width="60%">
</p>


## Analyzing the Results
At the end of each iteration, simulation results will be compressed in the *output/date/ite_n.tgz* files. When you extract these tgz files, you will see lots of log file in csv format. You can find matlab files which can plot graphics by using these files under *scripts/sample_application/matlab* folder. You can also write other scripts (e.g. python scripts) with the same manner of matlab plotter files.

## EdgeCloudSim Modified Source Files

**/edgecloudsim/applications/sample_app1**
MainApp.java DEFAULT
SampleScenarioFactory.java DEFAULT 

**/edgecloudsim/cloud_server **
CloudServerManager.java DEFAULT
CloudVM.java DEFAULT
CloudVmAllocationPOlicy_Custom.java DEFAULT
DefaultCloudServerManager.java DEFAULT

**/edgecloudsim/core**
Scenariofactory.java MODIFIED
SimManager.java
SimSettings.java

**/edgecloudsim/edge_client**
mobile_processing_unit DEFAULT
CpuUtilizationModelCustom.java MODIFIED
DefaultMobileDeviceManger.java MODIFIED
MobileDeviceManager.java DEFAULT
Task.java MODIFIED

**/edgecloudsim/edge_orchestrator**
BasicEdgeOrchestrator.java DEFUALT
EdgeOrchestrator.java DEFAULT

**/edgecloudsim/edge_server**
DefaultEdgeServerManager.java DEFAULT
EdgeHost.java DEFAULT
EdgeServerManager.java DEFAULT
EdgeVM.java MODIFIED
EdgeVmAllocationPolicy_Custom.java DEFAULT

**/edgecloudsim/mobility**
MobilityModel.java MODIFIED
NomadicMobility.java DEFAULT

**/edgecloudsim/network**
MM1Queue.java DEFAULT
NetworkModel.java

**/edgecloudsim/task_generator**
IdleActiveLoadGenerator.java DEFAULT
LoadGeneratorModel.java MODIFIED

**/edgecloudsim/utils**
Location.java MODIFIED
PoissonDist.java DEFAULT
SimLogger.java MODIFIED
SimUtils.java MODIFIED
TaskProperty.java MODIFIED

## EdgeCloudSim  SCRIPTS

**Sample_app1 - Project Scripts**

out_folders store the simulation experiment results in the form of ite10 SIMRESULT files and ite10.log files. Each simulation experiment is averaged over 10 iterations.

**WLAN Bandwdith simulation result scripts**
out_folderWLAN300
out_folderWLAN500
out_folderWLAN700
out_folderWLAN900

**VM Processing Speed result scripts**
out_folderVM1000
out_folderVM2000
out_folderVM3000
out_folderVM4000

**Sub_experiment for testing VM Processing Speed MIPS**
out_folder1k
out_folder2k
out_folder3k
out_folder4k

**Number of Edge Servers result scripts**
out_folder6servers_222 (6 servers 2 per attractive location)
out_folder12servers_444 (12 servers 4 per attractive location)
out_folder18servers_666 (18 servers 6 per attractive location)
out_folder24servers_888 (24 servers 8 per attractive location)

**BOTH WLAN Bandwdith and VM Processing Speed result scripts**
out_folderboth300_1000 (300 WLAN Bandwdith and 1000 MIPS)
out_folderboth500_2000 (500 WLAN Bandwdith and 2000 MIPS)
out_folderboth700_3000 (700 WLAN Bandwdith and 3000 MIPS)
out_folderboth900_4000 (900 WLAN Bandwdith and 4000 MIPS)

## Discussion Forum

The discussion forum for EdgeCloudSim can be found [here](https://groups.google.com/forum/#!forum/edgecloudsim).
We hope to meet with all interested parties in this forum.
Please feel free to join and let us discuss issues, share ideas related to EdgeCloudSim all together.

## YouTube Channel

The YouTube channel of EdgeCloudSim can be found [here](https://www.youtube.com/channel/UC2gnXTWHHN6h4bk1D5gpcIA).
You can find some videos presenting our works and tutorials on this channel.
Click [here](https://youtu.be/SmQgRANWUts) to watch the video with brief information about EdgeCloudSim.

## Needed Features

* Task migration among the Edge or Cloud VMs
* Energy consumption model for the mobile and edge devices as well as the cloud datacenters
* Adding probabilistic network failure model by considering the congestion or other parameters such as the distance between mobile device and the WiFi access point.
* Visual tool for displaying the network topology

## EdgeCloudSim: An Environment for Performance Evaluation of Edge Computing Systems

EdgeCloudSim provides a modular architecture to provide support for a variety of crucial functionalities such as network modeling specific to WLAN and WAN, device mobility model, realistic and tunable load generator. As depicted in Figure 2, the current EdgeCloudSim version has five main modules available: Core Simulation, Networking, Load Generator, Mobility and Edge Orchestrator. To ease fast prototyping efforts, each module contains a default implementation that can be easily extended.

<p align="center">
  <img src="/doc/images/edgecloudsim_diagram.png" width="55%">
  <p align="center">
    Figure 1: Relationship between EdgeCloudSim modules.
  </p>
</p>

## Mobility Module
The mobility module manages the location of edge devices and clients. Since CloudSim focuses on the conventional cloud computing principles, the mobility is not considered in the framework. In our design, each mobile device has x and y coordinates which are updated according to the dynamically managed hash table. By default, we provide a nomadic mobility model, but different mobility models can be implemented by extending abstract MobilityModel class.

<p align="center">
  <img src="/doc/images/mobility_module.png" width="55%">
</p>

## Load Generator Module
The load generator module is responsible for generating tasks for the given configuration. By default, the tasks are generated according to a Poisson distribution via active/idle task generation pattern. If other task generation patterns are required, abstract LoadGeneratorModel class should be extended.

<p align="center">
  <img src="/doc/images/task_generator_module.png" width="50%">
</p>

## Networking Module
The networking module particularly handles the transmission delay in the WLAN and WAN by considering both upload and download data. The default implementation of the networking module is based on a single server queue model. Users of EdgeCloudSim can incorporate their own network behavior models by extending abstract NetworkModel class.

<p align="center">
  <img src="/doc/images/network_module.png" width="55%">
</p>

## Edge Orchestrator Module
The edge orchestrator module is the decision maker of the system. It uses the information collected from the other modules to decide how and where to handle incoming client requests. In the first version, we simply use a probabilistic approach to decide where to handle incoming tasks, but more realistic edge orchestrator can be added by extending abstract EdgeOrchestrator class.

<p align="center">
  <img src="/doc/images/edge_orchestrator_module.png" width="65%">
</p>

## Core Simulation Module
The core simulation module is responsible for loading and running the Edge Computing scenarios from the configuration files. In addition, it offers a logging mechanism to save the simulation results into the files. The results are saved in comma-separated value (CSV) data format by default, but it can be changed to any format.

## Extensibility
EdgeCloudSim uses a factory pattern making easier to integrate new models mentioned above. As shown in Figure 2, EdgeCloudsim requires a scenario factory class which knows the creation logic of the abstract modules. If you want to use different mobility, load generator, networking and edge orchestrator module, you can use your own scenario factory which provides the concrete implementation of your custom modules.

<p align="center">
  <img src="/doc/images/class_diagram.png" width="100%">
  <p align="center">
    Figure 2: Class Diagram of Important Modules
  </p>
</p>

