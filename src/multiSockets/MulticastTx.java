package multiSockets;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastTx extends Thread {

	private InetAddress ia;
	public String cName;
	String source;

	public MulticastTx(String source) {
		try {
			this.source = source;
			cName = InetAddress.getLocalHost().getHostName();
			ia = InetAddress.getByName("228.5.6.7");
			start();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}

	
	public void run() {
		try {
			MulticastSocket ms = new MulticastSocket(4444);
			ms.joinGroup(ia);
			while (true) {
				String str = source + " , " + cName;
				byte[] b = str.getBytes();
				DatagramPacket dp = new DatagramPacket(b, b.length, ia, 4444);
				ms.send(dp);
				Thread.sleep(900);
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
}