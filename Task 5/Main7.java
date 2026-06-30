
interface INetworkProtocol{

    void broadcastMessage(String msg);

}

class BluetoothMeshNetwork
implements INetworkProtocol{


    public void broadcastMessage(String msg){

        System.out.println(
        "Bluetooth " + msg
        );

    }

}

class DisasterAlertSystem{


    INetworkProtocol network;


    DisasterAlertSystem(
    INetworkProtocol network){

        this.network = network;

    }


    void triggerAlert(String msg){

        network.broadcastMessage(msg);

    }

}

public class Main7{


    public static void main(String[] args){


        DisasterAlertSystem d =
        new DisasterAlertSystem(
        new BluetoothMeshNetwork()
        );


        d.triggerAlert("Emergency");


    }

}
