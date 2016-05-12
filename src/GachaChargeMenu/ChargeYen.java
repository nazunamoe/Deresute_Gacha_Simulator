package GachaChargeMenu;

import java.util.InputMismatchException;
import java.util.Scanner;
import Menu.User;
import Menu.MainMenu;

public class ChargeYen {
	Gacha gacha = new Gacha();
	 public void chargemoney(User user){
		 System.out.println();
		System.out.println("��ȭ�� �����մϴ�.");
		System.out.println();
		System.out.print("�󸶸� �����Ͻðڽ��ϱ�? ");
	    
		Scanner scanner = new Scanner(System.in);
		int yen=0;
		try {yen= scanner.nextInt();}
		catch(InputMismatchException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("\t");
			scanner.next();
			MainMenu.mainmenu(user);
		}
		this.chargemoney(user, yen);
		gacha.dialogshow();
	}
	 
	void chargemoney(User user, int yen){
		System.out.println("\t");
		user.yen+=yen;
		
		System.out.println(yen+"���� �����Ͽ����ϴ�. �����մϴ�.");
	}
	 
	public void giftcard(User user){
		System.out.println("����Ʈī�带 �����մϴ�.");
		System.out.println("\t");
 		System.out.println("������ ����Ʈī�� ����");
 		System.out.println("A: 1500��");
 		System.out.println("B: 3000��");
 		System.out.println("C: 5000��");
 		System.out.println("D: 10000��");
		System.out.println("���� �޴��� : M");
 		System.out.print(">> ");
 		char choose=0;
 		Scanner scanner = new Scanner(System.in);
 		choose=scanner.next().charAt(0);
 		switch(choose){
 		case'A':case'a':{this.charge(user,1500);break;}
 		case'B':case'b':{this.charge(user,3000);break;}
 		case'C':case'c':{this.charge(user,5000);break;}
 		case'D':case'd':{this.charge(user,10000);break;}
 		case'M' : case'm':{user.dialogshow();MainMenu.mainmenu(user);break;}
 		default:{System.out.println("�߸� �Է��Ͽ����ϴ�.");break;}
 		}
	}
	
	void charge(User user, int yen){
		user.giftcard=user.giftcard+yen;
		
		System.out.println("\t");
		System.out.println(yen+"���� �Һ��Ͽ� "+yen+"�� ��ġ�� ����Ʈī�带 �����Ͽ����ϴ�.");
	}
	
	public void giftcardtoyen (User user){
		if (user.giftcard==0){
			System.out.println("\t");
			System.out.println("����Ʈ ī�尡 �����ϴ�.");
			gacha.dialogshow();
			MainMenu.mainmenu(user);
		}
		System.out.println("\t");
		user.yen+=user.giftcard;
		user.usedgiftcard+=user.giftcard;
		System.out.println(user.giftcard+"�� ��ŭ�� ����Ʈī�尡 ����Ǿ����ϴ�.");
		user.giftcard-=user.giftcard;
	}
	
	public void yenchargemenu(User user){
    	char temp;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println();
		System.out.println("          Charge Menu         ");
    	System.out.println("��� �����Ͻðڽ��ϱ�?");
    	System.out.println();
    	System.out.println("����Ʈī�� ���� : G");
    	System.out.println("������ ����Ʈī�� ���� : O");
    	System.out.println("��ȭ ���� : E");
    	System.out.println("���� �޴��� : M");
    	System.out.print(">> ");
    	temp=scanner.next().charAt(0);
    	switch(temp){
    	case'G': case'g':{this.giftcard(user);break;}
    	case'O': case'o':{this.charge(user, user.giftcard);break;}
    	case'E': case'e':{this.chargemoney(user);break;}
    	case'M' : case'm':{user.dialogshow();MainMenu.mainmenu(user);break;}
    	default:{System.out.println("�߸� �Է��ϼ̽��ϴ�.");this.yenchargemenu(user);break;}
	}
	
}}
	

