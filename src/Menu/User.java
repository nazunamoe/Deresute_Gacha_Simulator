package Menu;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Database.Card;
import GachaChargeMenu.TXTSave;

public class User{
	    public int jewel;
	    public int yen;
	    public int giftcard;
	    public int usedyen;
	    public int won;
	    public int usedwon;
	    public int usedjewel;
	    public int usedgiftcard;
		
	    public String name;
	    public int gameid;
		
	    public boolean limited;
	    public String limit;
	    
	    public ArrayList<Card> SSR = new ArrayList<Card>();
	    public ArrayList<Card> SR = new ArrayList<Card>();
	    public ArrayList<Card> R = new ArrayList<Card>();
	    public ArrayList<Card> LSSR = new ArrayList<Card>();
	    public ArrayList<Card> LSR = new ArrayList<Card>();
	    
	    public Card FCard=null;

		public int SSRNumber;
		public int SRNumber;
		public int RNumber;
		public int LSSRNumber;
		public int LSRNumber;
		
		public int cute=0;
		public int cool=0;
		public int passion=0;
		
		public int LSSRp=8;
		public int SSRp=14;
		public int LSRp=74;
		public int SRp=114;
		public int Rp=999;
		
		public double tempSSR=1.5;
		public double tempSR=10.0;
		
		public int Gacha=0;
		public int Yuncha=0;
		
		public int GachausedJewel=0;
		
		public int TypeGachaSetting=0;

		
		public void UserInfo(User user){
			String TypeGacha=null;
			if(TypeGachaSetting==0){TypeGacha="���Ӽ�";}
			else if(TypeGachaSetting==1){TypeGacha="ťƮ";}
			else if(TypeGachaSetting==2){TypeGacha="��";}
			else if(TypeGachaSetting==3){TypeGacha="�м�";}
			
    		System.out.println("\t");
    		
    		System.out.println("�⺻����");
    		System.out.println("���ε༭�� : "+name);
    		System.out.println("���� ID : "+gameid);
    		try{System.out.println("��ȣ ���̵� : "+FCard.Valueof());}
    		catch(NullPointerException e){System.out.println("��ȣ ���̵� : ���� ");}
    		if(limited){limit="yes";}else if(!limited){limit="no";}
    		System.out.println("���� ��í ī�� ���� ����  : "+limit);
    		System.out.println("�Ӽ���í ���� ���� : "+TypeGacha);
    		System.out.println("\t"); 
    		System.out.println("���� �꿤 �� ��");
			System.out.println("���� �꿤 : "+jewel);
			System.out.println("���� �� : "+yen);
			System.out.println("���� ����Ʈī�� : "+giftcard);
			System.out.println();
			System.out.println("���� ī��");
    		if(RNumber!=0){System.out.println("R : "+RNumber);}
    		if(SRNumber!=0){System.out.println("SR : "+SRNumber);}
    		if(SSRNumber!=0){System.out.println("SSR : "+SSRNumber);}
    		if(LSRNumber!=0){System.out.println("����SR : "+LSRNumber);}
    		if(LSSRNumber!=0){System.out.println("����SSR : "+LSSRNumber);}
			System.out.println();
    		if(cute!=0){System.out.println("ťƮ : "+cute);}
    		if(cool!=0){System.out.println("�� : "+cool);}
    		if(passion!=0){System.out.println("�м� : "+passion);}
			System.out.println();
			System.out.println("���� ����");
			System.out.println("���ݱ��� ����� ����Ʈī�� : "+usedgiftcard);
			System.out.println("���ݱ��� ������ ��(��) : "+usedyen);
			System.out.println("���ݱ��� ������ �꿤 : "+usedjewel);
			System.out.println("���ݱ��� ���� ��í�� Ƚ�� : "+Gacha);
			System.out.println("���ݱ��� ���� ��í�� Ƚ�� : "+Yuncha);
			System.out.println("���ݱ��� ���� �꿤 : "+GachausedJewel);
    		System.out.println("\t");
		}
		
    	public void noCard(User user){
			System.out.println("�����ϰ� �ִ� ī�尡 �����ϴ�");

    	}
		public void CardShow(User user){
			if(SSRNumber==0&&SRNumber==0&&RNumber==0&&LSSRNumber==0&&LSRNumber==0){
				this.noCard(user);
				System.out.println("���͸� ���� ���θ޴��� �̵��մϴ�");
				
				String temp;
				Scanner scanner = new Scanner(System.in);
				temp=scanner.nextLine();
				MainMenu.mainmenu(user);
			}
			if(!(SSRNumber==0)){
    		System.out.println("���� ī�� ��");
    		System.out.println("SSR : "+SSRNumber);
            for (int i = 0; i<user.SSR.size(); i++) {
                System.out.println("SSR : " + SSR.get(i).Valueof());
            }}
			if(!(SRNumber==0)){
    		System.out.println("\t");
    		System.out.println("SR : "+SRNumber);
            for (int i = 0; i<user.SR.size(); i++) {
                System.out.println("SR : " + SR.get(i).Valueof());
            }}
            if(!(RNumber==0)){
    		System.out.println("\t");
    		System.out.println("R : "+RNumber);
	        for (int i = 0; i<user.R.size(); i++) {
	            System.out.println("R : " + R.get(i).Valueof());
	        }}
	        if(!(LSSRNumber==0)){
    		System.out.println("\t");
    		System.out.println("����SSR : "+LSSRNumber);
            for (int i = 0; i<user.LSSR.size(); i++) {
                System.out.println("LSSR : " + LSSR.get(i).Valueof());
            }}
            if(!(LSRNumber==0)){
    		System.out.println("\t");
    		System.out.println("����SR : "+LSRNumber);
            for (int i = 0; i<user.LSR.size(); i++) {
                System.out.println("LSR : " + LSR.get(i).Valueof());
            }}
//            this.datasave(user);
		}
		
		public void datasave(User user){
			Scanner scanner = new Scanner(System.in);
			System.out.print("�� ������ txt�� �����Ͻðڽ��ϱ�? (Y/N) >> ");
    		char choose2=scanner.next().charAt(0);
    		switch(choose2){
    		case'Y': case'y':{TXTSave.UserCardSave(user);}
       		case'N': case'n':{this.dialogshow(); MainMenu.mainmenu(user);}
    		default:{System.out.println("�߸� �����̽��ϴ�.");this.datasave(user);}}
		}
		
		
		public void finalresult(User user){
			System.out.println("\t");
			    if(usedyen!=0){
			        System.out.println("���ݱ��� "+usedyen+"���� �Һ��Ͽ� "+(SSRNumber+LSSRNumber)+"���� SSR,"+(SRNumber+LSRNumber)+"���� SR, "+RNumber+"���� R�� ȹ���ϼ̽��ϴ�.");
			        if((SSRNumber+LSSRNumber)==0){
				        System.out.println("����,"+usedyen+"���� �ᵵ SSR�� ȹ������ ���߱��� �Ф�");
			        } else if((SSRNumber+LSSRNumber)>0){
				        System.out.println(usedyen+"���� ����ϰ� "+(SSRNumber+LSSRNumber)+"���� SSR�� ȹ���ϼ̳׿�. ���ϵ帳�ϴ�");
			        }
			    } else if(usedyen==0){
				    System.out.println("������ ������ �����ô°ű���. �׳� ��������.. - ��ī�� ġ����");
			}
			    this.finalquestion(user);
			    
		}
		
		public void finalquestion(User user){
			char temp;
			System.out.println("\t");
			System.out.print("�� �����ô°� ����? Y/N >> ");
			Scanner scanner = new Scanner(System.in);
    		temp=scanner.next().charAt(0);
    		switch(temp){
    		case 'Y': case'y':{
    		System.out.println("\t");System.out.println("��! �׷� �� ��������!");
    		MainMenu.mainmenu(user);
			break;
			}
    		case 'N': case'n':{	    		
    		System.out.println("\t");
    		System.out.println("May be ssrare in with you.. ");
    	    Robot tRobot = null;
			try {
				tRobot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    tRobot.delay(4500); 
    		System.exit(0);}
    	    default:{
    		    System.out.println("�߸� �Է��ϼ̽��ϴ�."); this.finalquestion(user);}
    	        }
			}

		
		
		public void thingreset(User user){
			char choose;
			char choose2;
			System.out.println("\t");
			System.out.println("������ �ʱ�ȭ�Ͻðڽ��ϱ�?");
			System.out.println("�꿤 : Q ");
			System.out.println("����Ʈī�� : W");
			System.out.println("�� : E");
			System.out.println("ī�� : R");
			System.out.println("���� �޴��� : M");
			System.out.print("�Ͻ� ���� �����ϼ��� >> ");
			int yesno=4;
			Scanner scanner = new Scanner(System.in);
    		choose=scanner.next().charAt(0);
    		String thing=null;
			switch(choose){
    		case'Q': case'q':{thing="�꿤";System.out.println(thing+"�� �ʱ�ȭ �մϴ�.");yesno=0;break;}
    		case'W': case'w':{thing="����Ʈī��";System.out.println(thing+"�� �ʱ�ȭ �մϴ�.");yesno=1;break;}
    		case'E': case'e':{thing="��";System.out.println(thing+"�� �ʱ�ȭ �մϴ�.");yesno=2;break;}
    		case'R': case'r':{thing="ī��";System.out.println(thing+"�� �ʱ�ȭ �մϴ�.");yesno=3;break;}
	    	case'M' : case'm':{user.dialogshow();MainMenu.mainmenu(user);break;}
    		default:{System.out.println("�߸� �����̽��ϴ�.");MainMenu.mainmenu(user);}}
			System.out.println("����"+thing+"�� �ʱ�ȭ�Ͻðڽ��ϱ�?(Y/N) �ٽ� �ǵ��� �� �����ϴ�.");
    		choose2=scanner.next().charAt(0);
    		switch(choose2){
    		case'Y': case'y':{
    			if(yesno==0){System.out.println(thing+"�� �ʱ�ȭ �Ǿ����ϴ�.");jewel=0;break;}
    			if(yesno==1){System.out.println(thing+"�� �ʱ�ȭ �Ǿ����ϴ�.");giftcard=0;break;}
    			if(yesno==2){System.out.println(thing+"�� �ʱ�ȭ �Ǿ����ϴ�.");won=0;yen=0;break;}
    			if(yesno==3){System.out.println(thing+"�� �ʱ�ȭ �Ǿ����ϴ�.");
    			SSR.clear();
    			R.clear();
    			SR.clear();
    			LSSR.clear();
    			LSR.clear();
    			SSRNumber=0;
    			SRNumber=0;
    			RNumber=0;
    			LSSRNumber=0;
    			LSRNumber=0;
    		    break;}}
       		case'N': case'n':{System.out.println(thing+"�� �ʱ�ȭ ���� �ʽ��ϴ�.");break;}
    		default:{System.out.println("�߸� �����̽��ϴ�.");}}
		}
		
		public void dialogshow(){
			System.out.println("���͸� ���� ���θ޴��� �̵��մϴ�");
			String temp;
			Scanner scanner = new Scanner(System.in);
			temp=scanner.nextLine();
		}
		
		public void reinput(User user){
		    Scanner scanner = new Scanner(System.in);
//		    System.out.println("���ε༭ �̸��� �ѱ۷� �� �� �ֽ��ϴ�.");
		    System.out.print("���ε༭ �̸��� �Է��ϼ��� >> ");

		    user.name=scanner.next();
			System.out.println("���ε༭ �̸��� "+user.name+"�Դϴ�.");
		    do{System.out.print("���� ID�� �Է��ϼ��� >> ");
			try {user.gameid = scanner.nextInt();}
			catch(InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				scanner.next();continue;}
			System.out.println("���� ID�� "+user.gameid+"�Դϴ�.");
			MainMenu.mainmenu(user);}while(true);
		}
		
		public void FCardSelect(User user){
			ArrayList<Card> FCardList = new ArrayList<Card>();
			
		}
		
}
