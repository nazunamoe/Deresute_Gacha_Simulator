package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import Database.*;
import GachaChargeMenu.*;
import Menu.*;

public class main extends JFrame {
	
	JPanel gacha = new JPanel();
	JPanel money = new JPanel();
	JPanel info = new JPanel();
	JPanel titlebar = new JPanel();
	
	JRadioButton limited = new JRadioButton("���� ī��");
	
	Gacha g = new Gacha();
	
	JTextArea result = new JTextArea(30,10);
	
	JButton exit = new JButton("����");
	User user = new User();
	Container a = getContentPane();
	main(){
		
		Font mainfont = new Font("���� ����",0,15);
		Font mainfont2 = new Font("���� ����",0,13);
		setTitle("�������� ��í �ùķ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel Title = new JLabel (" �������� ��í �ùķ����� v2.0 beta1");
		titlebar.setLayout(new BorderLayout(50,50));
		titlebar.add(Title,BorderLayout.WEST);
		titlebar.add(exit,BorderLayout.EAST);
		Title.setFont(new Font("���� ����",Font.BOLD,18));
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
		JButton searchbtn = new JButton("�˻�");
		JLabel gachatitle = new JLabel("��í ���");
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
		gacha.add(limited);
		gacha.add(gachatitle);
		
		gachago.setSize(110,30);
		yunchago.setSize(110,30);
		yungumgo.setSize(110,30);
		jewelstat.setSize(110,20);
		scrollPane.setSize(365,120);
		search.setSize(300,20);
		searchbtn.setSize(65,20);
		limited.setSize(110,20);
		gachatitle.setSize(365,20);
		
		gachago.setLocation(5,5);
		yunchago.setLocation(5,40);
		yungumgo.setLocation(5,75);
		jewelstat.setLocation(5,115);
		scrollPane.setLocation(120,25);
		search.setLocation(120,150);
		searchbtn.setLocation(420,150);
		limited.setLocation(5,140);
		gachatitle.setLocation(120,5);
		
		gachago.setFont(mainfont);
		yunchago.setFont(mainfont);
		yungumgo.setFont(mainfont);
		jewelstat.setFont(mainfont);
		scrollPane.setFont(mainfont);
		search.setFont(mainfont);
		searchbtn.setFont(mainfont2);
		limited.setFont(mainfont);
		gachatitle.setFont(mainfont2);
		
		
		gachago.addActionListener(new gachaaction());
		yunchago.addActionListener(new gachaaction());
		yungumgo.addActionListener(new gachaaction());
		searchbtn.addActionListener(new gachaaction());
		exit.addActionListener(new gachaaction());
		
		result.setEditable(false);
		
		tab.setFont(mainfont);
		a.add(tab,BorderLayout.CENTER);
		
		setSize(500,270);
		setVisible(true);
		setResizable(false);
	}
	
	public class gachaaction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String menu = e.getActionCommand();
			switch(menu){
			case"��í":{
				result.setText("");
				user.jewel=-250;
				StringBuffer gachatext = new StringBuffer();
				gachatext.append(g.ReturnToGUILimited(user, 0).Valueof()+"\n");
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				break;}
			case"��í":{
				result.setText("");
				user.jewel=-250;
				StringBuffer gachatext = new StringBuffer();
				for(int i=0; i<9; i++){
				gachatext.append(g.ReturnToGUILimited(user, 0).Valueof()+"\n");
				}gachatext.append(g.ReturnToGUILimited(user, 1).Valueof());
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				break;}
			case"���ݴ�í":{
				result.setText("");
				user.jewel=-60;
				StringBuffer gachatext = new StringBuffer();
				gachatext.append(g.ReturnToGUILimited(user, 0).Valueof()+"\n");
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				break;}
			case"�˻�":{break;}
			case"����":{int result =JOptionPane.showConfirmDialog(a, "�����Ͻðڽ��ϱ�?","����",JOptionPane.YES_OPTION);
			if(result ==JOptionPane.YES_OPTION){
			System.exit(0);}
			}}
		}
	}
	
	public static void main(String[] args){
		new main();
	}
}
