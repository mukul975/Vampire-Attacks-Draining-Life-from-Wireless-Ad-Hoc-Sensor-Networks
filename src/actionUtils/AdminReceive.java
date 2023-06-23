package actionUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import myDesign.Source ;
public class AdminReceive extends Thread {

	Source admin;
	private Socket soc;
	private ServerSocket serSoc;
	private ObjectInputStream ois;

	public AdminReceive(Source admin) {
		// TODO Auto-generated constructor stub
		this.admin = admin;
		start();
	}

	public void run() {
		try {
			receive();
		} catch (Exception e) {
		}
	}

	public void receive() {
		try {
			serSoc = new ServerSocket(4576);
			while (true) {
				soc = serSoc.accept();
				ois = new ObjectInputStream(soc.getInputStream());
				String str = (String) ois.readObject();
				checkStatus(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void checkStatus(String str) {
		try {
			if (str.equals("REQ")) {
				String cnme = (String) ois.readObject();
				int port = (Integer) ois.readObject();
				String bw = (String) ois.readObject();
				String file = (String) ois.readObject();
				//admin.dft.addRow(new Object[] { cnme, port, bw, file });
				//admin.jTextArea2.append(""+new Object[] { cnme, port, bw, file });
				send(cnme, port, bw, file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void send(String cnme, int port, String bw, String file) {
		// TODO Auto-generated method stub

		int bb = Integer.parseInt(bw);
		admin.jTextArea3.append("Req Peer: " + cnme + "\n");
		admin.jTextArea3.append("=======================" + "\n");
		admin.jTextArea3.append("BW: " + bw + "\n");
		admin.jTextArea3.append("File : " + file + "\n");
		File fdb = new File("ServerDB/" + file);

		
		int cnt = (int) fdb.length() / (1024 * 100);
		System.out.println(cnt);
		admin.jTextArea3.append("Encoding & Sending Starts..." + "\n");
		for (int i = 0; i < cnt; i++) {
			String mdc = "MDC :[P( " + (i + 1 + ")]");
			admin.jTextArea3.append(mdc + "\n");
			try {
				Socket soc = new Socket("localhost", port);
				ObjectOutputStream oos = new ObjectOutputStream(soc
						.getOutputStream());
				oos.writeObject("MDC");
				oos.writeObject(mdc);
				oos.writeObject(fdb.getName());
				int cc = bb / 10;
				Thread.sleep(10000 - (cc * 1000));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileInputStream fis = new FileInputStream(fdb);
			byte b[] = new byte[fis.available()];
			fis.read(b);
			Socket soc = new Socket("localhost", port);
			ObjectOutputStream oos = new ObjectOutputStream(soc
					.getOutputStream());
			oos.writeObject("M");
			oos.writeObject(b);
			oos.writeObject(fdb.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		admin.jTextArea3.append("Finished." + "\n");
		
		try {
			Socket soc = new Socket("localhost", port);
			ObjectOutputStream oos = new ObjectOutputStream(soc
					.getOutputStream());
			oos.writeObject("F");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
