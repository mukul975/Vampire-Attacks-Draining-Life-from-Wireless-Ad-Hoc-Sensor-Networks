package actionUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

import myDesign.Node_A;
import myDesign.Source;

public class UserReceive extends Thread {

	//Nodes user;
	int port;
	public File lrecFile;
	private Socket soc;
	private ServerSocket serSoc;
	private ObjectInputStream ois;

	//public UserReceive(Nodes user, int port) {
//		// TODO Auto-generated constructor stub
//		this.user = user;
//		this.port = port;
//		start();
//	}
//
	public void run() {
		try {
			receive();
		} catch (Exception e) {
		}
	}

	public void receive() {
		try {
			serSoc = new ServerSocket(port);
			while (true) {
				soc = serSoc.accept();
				ois = new ObjectInputStream(soc.getInputStream());
				String str = (String) ois.readObject();
				//checkStatus(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

/*	private void checkStatus(String str) {
		try {
			if (str.equals("M")) {
				byte[] file=(byte[])ois.readObject();
				String filename=(String)ois.readObject();
				lrecFile=new File("RecFiles/"+user.source+"_"+filename);
				FileOutputStream fos=new FileOutputStream(lrecFile);
				fos.write(file);
				fos.close();
			} else if (str.equals("MDC")) {
				String mdc=(String)ois.readObject();
				String filename=(String)ois.readObject();
				//user.dft.addRow(new Object[]{mdc,filename});
			} else if (str.equals("F")) {
				JOptionPane.showMessageDialog(null, "Last Received File is: "+lrecFile.getAbsolutePath());
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
}
