package Menu;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainWindow {
	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println("                              ");
		System.out.println("Deresute Gacha Simulator v1.62");
		System.out.println("                       ");
		System.out.println("==============================");
		System.out.println("������ : nazunamoe (Ʈ���� @nazunamoe)");
		System.out.println("���װ� �߰ߵǸ� Ʈ���� ���� @nazunamoe�� �����ּ���.");
		System.out.println("==============================");
		System.out.println("                       ");
		User user = new User();
	    Scanner scanner = new Scanner(System.in);
//	    System.out.println("���ε༭ �̸��� �ѱ۷� �� �� �ֽ��ϴ�.");
	    System.out.print("���ε༭ �̸��� �Է��ϼ��� >> ");
	    user.name=scanner.next();
	    do{System.out.print("���� ID�� �Է��ϼ��� >> ");
		try {user.gameid = scanner.nextInt();}
		catch(InputMismatchException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			scanner.next();continue;}
		MainMenu.mainmenu(user);}while(true);
	    
	}
	
	 public void openBrower(String url)  {
	        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
	        if( !desktop.isSupported( java.awt.Desktop.Action.BROWSE ) ) {
	            System.err.println( "Desktop doesn't support web browser action" );
	        }
	        try {
	            java.net.URI uri = new java.net.URI( url );
	            desktop.browse( uri );
	        }        
	        catch (IOException _e) {
	            System.err.println( _e.getMessage() );
	        } 
	        catch (URISyntaxException _e) {
	            System.err.println( _e.getMessage() );
	        }
	    }
	}


