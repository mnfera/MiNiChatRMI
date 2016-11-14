import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Conecta {

	public static void main(String[] args) {
 
		try {
			 
			ChatClient conecta = (ChatClient)
			Naming.lookup("//localhost/chat");
			conecta.nome();
			conecta.servidor().conectar(conecta, conecta.nickname());
			//conecta.servidor().falar(conecta.nickname(), "Ola");
			conecta.disse(conecta.nickname(), "Oi");
			//conecta.servidor().usuariosRegistrados();
 
			
		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (RemoteException e) {

			e.printStackTrace();
 
		} catch (NotBoundException e) {

			e.printStackTrace();
		}
	}
}
