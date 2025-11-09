# Vampire Attacks in Wireless Ad-Hoc Sensor Networks

This project provides a Java-based simulation of Vampire Attacks in Wireless Ad-Hoc Sensor Networks. It demonstrates how these attacks can drain the life of network nodes, leading to a shortened network lifetime. The simulation offers a graphical user interface (GUI) to visualize the network, the data flow, and the impact of the attacks.

## Features

*   **Network Simulation**: Simulates a wireless ad-hoc sensor network with a source, a sink, and multiple intermediate nodes.
*   **Vampire Attack Demonstration**: Illustrates how Vampire Attacks deplete the energy of nodes in the network.
*   **GUI Visualization**: Provides a visual representation of the network topology, data packet transmission, and node energy levels.
*   **Cross-Platform**: Can be run on any system with Java and NetBeans installed.
*   **Single and Multi-System Simulation**: Supports running the simulation on a single machine or across multiple systems.

## Technologies Used

*   **Java**: The core programming language used for the simulation.
*   **Java Swing**: Used for creating the graphical user interface.
*   **NetBeans**: The recommended IDE for this project.
*   **Ant**: Used for building and managing the project.

## Getting Started

### Prerequisites

*   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
*   [Apache NetBeans 7.0 or higher](https://netbeans.apache.org/download/index.html)

### Installation

1.  Clone the repository:
    ```sh
    git clone https://github.com/mukul975/Vampire-Attacks-Draining-Life-from-Wireless-Ad-Hoc-Sensor-Networks.git
    ```
2.  Open the project in NetBeans.

### Running the Simulation

To run the simulation, you must follow these steps in the correct order:

1.  **Start the Sink Node**:
    *   Navigate to `src/myDesign/` in the Projects window.
    *   Right-click on `Sink.java` and select **Run File**.

2.  **Start the Source Node**:
    *   Navigate to `src/myDesign/`.
    *   Right-click on `Source.java` and select **Run File**.

3.  **Start the Intermediate Nodes**:
    *   Run the other node files (`Node_A.java`, `Node_B.java`, etc.) in any order.

**Note**: It is crucial to start the `Sink` and `Source` nodes before the other nodes to ensure proper network initialization.

### Running on Multiple Systems

To run the simulation across multiple systems, you need to configure the IP addresses:

1.  In each `.java` file, find all occurrences of `127.0.0.1`.
2.  Replace `127.0.0.1` with the IP address of the machine running the `Sink` node.

## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
