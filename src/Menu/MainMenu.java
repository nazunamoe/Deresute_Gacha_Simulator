package Menu;

import java.util.Scanner;

import Database.Card;
import GachaChargeMenu.ChargeJewel;
import GachaChargeMenu.ChargeYen;
import GachaChargeMenu.Gacha;
public class MainMenu {

	public static void mainmenu(User user) {
//		user.limited=true;
		if(user.limited){user.limit="yes";}else if(!user.limited){user.limit="no";}
		do{
    		System.out.println();
    		System.out.println("          Main Menu           ");
    		System.out.println("���� �޴��� �̵� : M");
    		System.out.println("�꿤 ���� : C");
    		
   			System.out.println("���� ��í ���̵� ��� ���� : "+user.limit+" ���� : L");
   			System.out.println("���̵� �˻� : Z               ");
    		System.out.println("��í �޴��� �̵� : G                 ");
    		System.out.println("��í Ȯ�� ���� : J                 ");
    		System.out.println("���ε༭ ���� Ȯ�� : P                ");
    		System.out.println("�������� ī�� Ȯ�� : Q                ");
    		System.out.println("��ȣ ���̵� ���� : D                ");
    		System.out.println("���ε༭ ���� ���Է� : R               ");
    		System.out.println("�ʱ�ȭ �޴� : H                    ");
    		System.out.println("������ Ȩ������ �湮�ϱ�  : B            ");
    		System.out.println("�����ϱ�  : F            ");
    		System.out.println();
    		char choose = 0;
    		System.out.print("�Ͻ� ���� �����ϼ��� >> ");
    		Scanner scanner = new Scanner(System.in);
    		choose=scanner.next().charAt(0);
    		
    		Gacha gacha = new Gacha();
    		Card Card = new Card();
    		
    		switch(choose){

    		
    		//-------------------------------------------------------------------------
    		

    		case 'M': case'm':{
    			ChargeYen yen = new ChargeYen();
    			yen.yenchargemenu(user);
    			continue;
    		}    		
    		
    		
    		case 'C': case'c':{
    			ChargeJewel jewel = new ChargeJewel();
    			jewel.chargemenu(user);
    			gacha.dialogshow();
    			continue;
    			}

    		//-------------------------------------------------------------------------
    		
    		case 'L': case'l':{
    			user.limited=!user.limited;
    			System.out.println("\t");
    			if(user.limited){user.limit="yes";}else if(!user.limited){user.limit="no";}
    			System.out.println("���� ��í ���̵� ��� ���� : "+user.limit);
    			gacha.dialogshow();
    			continue;
    		}
    		
    		case 'G': case'g':{
    			gacha.gachamenu(user);
    			continue;
    			}
    		
    		case'z': case'Z':{Card.SearchIdol(user);user.dialogshow();continue;}
    		
	    	case 'J': case'j':{
    			gacha.Probability(user);
    			continue;
	    	}
    		//-------------------------------------------------------------------------


	    	case 'P': case'p':{
	    		user.UserInfo(user);
	    		user.dialogshow();
	    		continue;
	    	    }
    		
	    	case 'H': case'h':{
	    		user.thingreset(user);
	    		user.dialogshow();
    			continue;
    			}
	    	
	    	case 'R': case'r':{
    			user.reinput(user);
    			gacha.yunchaone(user);
    			continue;
	    	    }
	    	
	    	case 'Q':case'q':{user.CardShow(user);continue;}
    		/*
    		 * 0:�꿤 �ʱ�ȭ
    		 * 1:����Ʈī�� �ʱ�ȭ
    		 * 2:�� �ʱ�ȭ
    		 * 3:���� ī�� �ʱ�ȭ
    		 */
    		//-------------------------------------------------------------------------
	    	
	   
	    	case 'F': case'f':{
	    		user.finalresult(user);
	    		user.finalquestion(user);
	    		scanner.close();
	    		continue;
	    	    }
	    	
	    	case'B': case'b':{
	    		MainWindow m = new MainWindow();
	    		m.openBrower("https://aoskp.tistory.com");
	    		continue;
	    	}
	    	
	    	case'D':case'd':{Card.FCardSelect(user);continue;}
//	    	
//	    	case 'i':{gacha.InfiniteGacha(user);continue;}
	    	
		    default:{
			    System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;}
		        }
    		
		}while(true);
		
		
	}
}

