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

		JLabel Title = new JLabel (" �������� ��í �ùķ����� v2.0 beta1");
		titlebar.setLayout(new BorderLayout(50,50));
		titlebar.add(Title,BorderLayout.WEST);
		titlebar.add(exit,BorderLayout.EAST);
		Title.setFont(new Font("���� ���",Font.BOLD,18));
		a.setLayout(new BorderLayout(5,5));
		a.add(titlebar,BorderLayout.NORTH);
		exit.setFont(mainfont);

		JTabbedPane tab = new JTabbedPane();
		tab.add(money,"����");
		tab.add(gacha,"��í");
		tab.add(info,"����");
		
		String jewel ="�꿤 : ";
		JLabel jewelstat = new JLabel(jewel+user.jewel);
		
		money.setLayout(null);
		gacha.setLayout(null);
		info.setLayout(null);
		
		//��í �޴� �׸�
		JButton gachago = new JButton("��í");
		JButton yunchago = new JButton("��í");
		JButton yungumgo = new JButton("���ݴ�í");
		JTextArea result = new JTextArea(30,10);
		JButton searchbtn = new JButton("�˻�");
	    JScrollPane scrollPane = new JScrollPane(result);
	    JTextField search = new JTextField(20);
		
		gacha.setLayout(null);
		gacha.add(gachago);
		gacha.add(yunchago);
		gacha.add(jewelstat);
		gacha.add(yungumgo);
		gacha.add(scrollPane);
		gacha.add(search);
		gacha.add(searchbtn);
		
		gachago.setSize(110,30);
		yunchago.setSize(110,30);
		yungumgo.setSize(110,30);
		jewelstat.setSize(110,20);
		scrollPane.setSize(265,100);
		search.setSize(200,20);
		searchbtn.setSize(65,20);
		
		gachago.setLocation(5,5);
		yunchago.setLocation(5,40);
		yungumgo.setLocation(5,75);
		jewelstat.setLocation(5,110);
		scrollPane.setLocation(120,5);
		search.setLocation(120,110);
		searchbtn.setLocation(320,110);
		
		gachago.setFont(mainfont);
		yunchago.setFont(mainfont);
		yungumgo.setFont(mainfont);
		jewelstat.setFont(mainfont);
		scrollPane.setFont(mainfont);
		search.setFont(mainfont);
		searchbtn.setFont(mainfont);
		
		result.setEditable(false);
		
		tab.setFont(mainfont);
		a.add(tab,BorderLayout.CENTER);
		
		setSize(400,240);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args){
		new main();
	}
}
