package GUI;

import java.awt.*;
import javax.swing.*;
import Database.*;
import GachaChargeMenu.*;
import Menu.*;

public class main extends JFrame {
	
	JPanel gacha = new JPanel();
	JPanel money = new JPanel();
	JPanel info = new JPanel();
	JPanel titlebar = new JPanel();
	
	JButton exit = new JButton("����");
	User user = new User();
	Container a = getContentPane();
	main(){
		
		Font mainfont = new Font("���� ���",0,15);
		setTitle("�������� ��í �ùķ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel Title = new JLabel ("�������� ��í �ùķ����� v2.0 beta1");
		titlebar.setLayout(new BorderLayout(50,50));
		titlebar.add(Title,BorderLayout.WEST);
		titlebar.add(exit,BorderLayout.EAST);
		Title.setFont(new Font("���� ���",0,18));
		a.setLayout(new BorderLayout(5,5));
		a.add(titlebar,BorderLayout.NORTH);
		exit.setFont(mainfont);

		JTabbedPane tab = new JTabbedPane();
		tab.add(money,"����");
		tab.add(gacha,"��í");
		tab.add(info,"����");
		
		money.setLayout(null);
		gacha.setLayout(null);
		info.setLayout(null);
		
		//��í �޴� �׸�
		JButton gachago = new JButton("��í");
		JButton yunchago = new JButton("��í");
		String jewel ="���� �꿤 : ";
		JLabel jewelstat = new JLabel(jewel+user.jewel);
		gacha.setLayout(null);
		gacha.add(gachago);
		gacha.add(yunchago);
		gacha.add(jewelstat);
		
		gachago.setSize(110,30);
		yunchago.setSize(110,30);
		jewelstat.setSize(110,30);
		
		gachago.setLocation(100,100);
		
		tab.setFont(mainfont);
		a.add(tab,BorderLayout.CENTER);
		
		setSize(400,250);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args){
		new main();
	}
}
