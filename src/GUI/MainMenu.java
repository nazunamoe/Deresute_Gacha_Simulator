package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.*;
import Database.*;
import GachaChargeMenu.*;
import Menu.*;

public class MainMenu extends JFrame {

	JLabel fcardimage = new JLabel();
	
	String jewel ="�꿤 : ";
	String yen = "�� : ";
	
	JLabel moneystat3 = new JLabel();
	JLabel jewelstat3 = new JLabel();
	
	JPanel gacha = new JPanel();
	JPanel money = new JPanel();
	JPanel info = new JPanel();
	JPanel titlebar = new JPanel();
	JPanel statbar = new JPanel();
	
	ArrayList<Card> resulttemp = new ArrayList<Card>();
	
	JRadioButton limited = new JRadioButton("����");
	JRadioButton nojewel = new JRadioButton("���꿤");	
	
	Card resultcard = new Card();
	
	Gacha g = new Gacha();
	
	Iterator<Card> search = resulttemp.iterator();
	
	JTextArea result = new JTextArea(9,10);
    
	JTextField searchtable = new JTextField(20);
	
	JButton exit = new JButton("����");
	
	User user = new User();
	
	Container a = getContentPane();
	
	JRadioButton cute = new JRadioButton("Cute");
	JRadioButton cool = new JRadioButton("Cool");
	JRadioButton passion = new JRadioButton("Passion");
	JRadioButton alltype = new JRadioButton("All");
	
	boolean nojewelset;
	
	JComboBox jewellist = new JComboBox();
	String select="";
	
	ArrayList<String> jewels2 = new ArrayList<String>();
	String [] jewels ={"���� ����","A: �꿤 60�� - 120��","B: �꿤 360�� - 480��",
			"C: �꿤 760�� - 960��","D: �꿤 1300�� - 1600��","E: �꿤 2650�� - 3200��",
			"F: �꿤 4200�� - 5000��","G: �꿤 8400�� - 9800��"};
	
	JLabel usedjewel = new JLabel("����� �꿤 : "+user.usedjewel);
	JLabel usedyen = new JLabel("����� �� : "+user.usedyen);
	JLabel SSRInfo = new JLabel("SSR : "+user.SSRNumber);
	JLabel SRInfo = new JLabel("SR : "+user.SRNumber);
	JLabel RInfo = new JLabel("R : "+user.RNumber);
	JLabel CuteInfo = new JLabel("Cute : "+user.cute);
	JLabel CoolInfo = new JLabel("Cool : "+user.cool);
	JLabel PassionInfo = new JLabel("Passion : "+user.passion);
	
	MainMenu(){

		nojewelset=false;
		Image moneyimage =null;
		Image debugimage =null;
		
		user.limited=false;
		
		Font mainfont = new Font("���� ���",0,15);
		Font mainfont2 = new Font("���� ���",0,13);
		
		setTitle("�������� ��í �ùķ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try{File sourceimage = new File("image/moneymenu/cihiro");
		moneyimage = ImageIO.read(sourceimage);}
		catch(IOException e){}
		try{File sourceimage2 = new File("image/cardimage/asukassr-before");
		debugimage = ImageIO.read(sourceimage2);}
		catch(IOException e){}
		
		
		JLabel Title = new JLabel (" �������� ��í �ùķ����� v2.0.0 Beta 5.3");
		titlebar.setLayout(new BorderLayout(50,50));
		titlebar.add(Title,BorderLayout.WEST);
		titlebar.add(exit,BorderLayout.EAST);
		
		Title.setFont(new Font("���� ���",Font.BOLD,18));
		
		a.setLayout(new BorderLayout(5,5));
		
		a.add(titlebar,BorderLayout.NORTH);
		a.add(statbar, BorderLayout.SOUTH);
		
		exit.setFont(mainfont);
		JTabbedPane tab = new JTabbedPane();
		
		tab.add(money,"����");
		tab.add(gacha,"��í");
		tab.add(info,"����");
	
		money.setLayout(null);
		gacha.setLayout(null);
		info.setLayout(null);
		statbar.setLayout(new GridLayout(1,3,5,5));
		
		// ���¹� �׸�
		moneystat3.setText(yen+user.yen);
		jewelstat3.setText("�꿤 : "+user.jewel);
		
		statbar.add(jewelstat3);
		statbar.add(moneystat3);
		
		jewelstat3.setFont(mainfont);
		moneystat3.setFont(mainfont);
		
		// ���� �޴� �׸�
		JLabel moneyimagee = new JLabel(new ImageIcon(moneyimage));

		JButton yengacha = new JButton("��ȭ�� ����");
		JButton jewelcharge = new JButton("�꿤 ����");
		
		
		for(int i=0; i<jewels.length; i++){
			jewels2.add(jewels[i]);
		}
		
		jewellist = new JComboBox(jewels);
		
		money.add(moneyimagee);
		money.add(yengacha);
		money.add(jewelcharge);
		money.add(jewellist);
		
		moneyimagee.setLocation(5,5);
		yengacha.setLocation(260,5);
		jewelcharge.setLocation(260,75);
		jewellist.setLocation(260,40);
		
		moneyimagee.setSize(250,160);
		yengacha.setSize(225,30);
		jewelcharge.setSize(225,30);
		jewellist.setSize(225,30);

		yengacha.setFont(mainfont);
		jewelcharge.setFont(mainfont);
		jewellist.setFont(mainfont);
		
		yengacha.addActionListener(new moneylistener());
		jewelcharge.addActionListener(new moneylistener());
		jewellist.addActionListener(new listaction());
		jewelcharge.addActionListener(new jewelcharge());
		
		//��í �޴� �׸�
		JLabel typegacha = new JLabel("�Ӽ��� ��í");
		JLabel gachatitle = new JLabel("��í ���");
		
		JButton gachago = new JButton("��í");
		JButton yunchago = new JButton("��í");
		JButton yungumgo = new JButton("����");
		JButton searchbtn = new JButton("�˻�");
		JButton infinite = new JButton("����");
		JButton hawkryul = new JButton("Ȯ�� ����");
		
	    JScrollPane scrollPane = new JScrollPane(result);
		
		gacha.setLayout(null);
		gacha.add(gachago);
		gacha.add(yunchago);
		gacha.add(yungumgo);
		gacha.add(scrollPane);
		gacha.add(searchtable);
		gacha.add(searchbtn);
		gacha.add(limited);
		gacha.add(gachatitle);
		gacha.add(cute);
		gacha.add(cool);
		gacha.add(passion);
		gacha.add(alltype);
		gacha.add(typegacha);
		gacha.add(infinite);
		gacha.add(nojewel);
		gacha.add(hawkryul);
		
		gachago.setSize(64,30);
		yunchago.setSize(64,30);
		yungumgo.setSize(64,30);
		scrollPane.setSize(352,185);
		searchtable.setSize(224,20);
		searchbtn.setSize(65,18);
		limited.setSize(60,20);
		gachatitle.setSize(365,20);
		cute.setSize(60,20);
		cool.setSize(110,20);
		passion.setSize(110,20);
		typegacha.setSize(110,20);
		alltype.setSize(60,20);
		infinite.setSize(64,30);
		nojewel.setSize(65,20);
		hawkryul.setSize(130,26);
		
		gachago.setLocation(2,2);
		yunchago.setLocation(68,2);
		yungumgo.setLocation(2,34);
		scrollPane.setLocation(136,25);
		searchtable.setLocation(196,2);
		searchbtn.setLocation(420,2);
		limited.setLocation(2,95);
		gachatitle.setLocation(136,0);
		cute.setLocation(2,142);
		cool.setLocation(2,164);
		passion.setLocation(2,186);
		typegacha.setLocation(2,120);
		alltype.setLocation(62,142);
		infinite.setLocation(68,34);
		nojewel.setLocation(62,95);
		hawkryul.setLocation(2,66);
		
		gachago.setFont(mainfont2);
		yunchago.setFont(mainfont2);
		yungumgo.setFont(mainfont2);
		scrollPane.setFont(mainfont);
		searchtable.setFont(mainfont2);
		searchbtn.setFont(mainfont2);
		limited.setFont(mainfont2);
		gachatitle.setFont(mainfont2);
		cute.setFont(mainfont2);
		cool.setFont(mainfont2);
		passion.setFont(mainfont2);
		typegacha.setFont(mainfont);
		alltype.setFont(mainfont2);
		infinite.setFont(mainfont2);
		nojewel.setFont(mainfont2);
		hawkryul.setFont(mainfont2);
		
		gachago.addActionListener(new gachaaction());
		yunchago.addActionListener(new gachaaction());
		yungumgo.addActionListener(new gachaaction());
		infinite.addActionListener(new gachaaction());
		searchbtn.addActionListener(new gachaaction());
		exit.addActionListener(new gachaaction());
		limited.addItemListener(new limitedconfigbutton());
		cute.addItemListener(new typebutton());
		cool.addItemListener(new typebutton());
		passion.addItemListener(new typebutton());
		alltype.addItemListener(new typebutton());
		nojewel.addItemListener(new nojewelbutton());
		hawkryul.addActionListener(new gachaaction());
	
		alltype.setSelected(true);
		result.setEditable(false);
		
		tab.setFont(mainfont);
		a.add(tab,BorderLayout.CENTER);
		
		
		// ���� �޴� �׸�
		fcardimage = new JLabel(new ImageIcon(debugimage));

		JLabel cardinfo = new JLabel("���� ī�� ����");
		JLabel fcardtitle = new JLabel("��ȣ ���̵�");
		
		info.setLayout(null);
		
		info.add(usedjewel);
		info.add(usedyen);
		info.add(cardinfo);
		info.add(SSRInfo);
		info.add(SRInfo);
		info.add(RInfo);
		info.add(CuteInfo);
		info.add(CoolInfo);
		info.add(PassionInfo);
		info.add(fcardimage);
		info.add(fcardtitle);
		
		usedjewel.setLocation(123,3);
		usedyen.setLocation(123,25);
		cardinfo.setLocation(123,53);
		SSRInfo.setLocation(123,80);
		SRInfo.setLocation(123,100);
		RInfo.setLocation(123,120);
		CuteInfo.setLocation(123,140);
		CoolInfo.setLocation(123,160);
		PassionInfo.setLocation(123,180);
		fcardimage.setLocation(3,23);
		fcardtitle.setLocation(3,3);
		
	    usedjewel.setSize(210,18);
	    usedyen.setSize(210,18);
	    cardinfo.setSize(140,20);
	    SSRInfo.setSize(90,18);
	    SRInfo.setSize(90,18);
	    RInfo.setSize(90,18);
	    CuteInfo.setSize(980,18);
	    CoolInfo.setSize(90,18);
	    PassionInfo.setSize(90,18);
	    fcardimage.setSize(116,116);
	    fcardtitle.setSize(116,20);
		
		usedjewel.setFont(mainfont);
		usedyen.setFont(mainfont);
		cardinfo.setFont(new Font(("���� ���"),Font.BOLD,20));
		SSRInfo.setFont(mainfont);
		SRInfo.setFont(mainfont);
		RInfo.setFont(mainfont);
		CuteInfo.setFont(mainfont);
		CoolInfo.setFont(mainfont);
		PassionInfo.setFont(mainfont);
		fcardtitle.setFont(mainfont);
		
		setSize(500,345);
		setVisible(true);
		setResizable(false);
	}
	

	
	public class gachaaction implements ActionListener{
		
		public void showerror(){
			JOptionPane.showMessageDialog(a, "�꿤�� �����մϴ�"," �꿤 ����",JOptionPane.ERROR_MESSAGE);
		}
		
		public boolean checkjewel(User user, int jewel){
			if(nojewelset){return true;}else{
			if(user.jewel<jewel){
				return false;
			}else if(user.jewel>=jewel) {user.usedjewel+=jewel;return true;}
			return true;}
		}
		
		public void refresh(){
			moneystat3.setText("�� : "+user.yen);
			jewelstat3.setText("�꿤 : "+user.jewel);
			usedjewel.setText("����� �꿤 : "+user.usedjewel);
			SSRInfo.setText("SSR : "+user.SSRNumber);
			SRInfo.setText("SR : "+user.SRNumber);
			RInfo.setText("R : "+user.RNumber);
			CuteInfo.setText("Cute : "+user.cute);
			CoolInfo.setText("Cool : "+user.cool);
			PassionInfo.setText("Passion : "+user.passion);
		}
		
		public void actionPerformed(ActionEvent e){
			String menu = e.getActionCommand();
			switch(menu){
			case"��í":{
				if(this.checkjewel(user, 250)){
				resulttemp.clear();
				result.setText("");
				if(!nojewelset){user.jewel-=250;}
				StringBuffer gachatext = new StringBuffer();
				if(user.limited){
					resultcard=g.ReturnToGUIUnlimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);}
				else {
					resultcard=g.ReturnToGUILimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);}
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				this.refresh();
				break;}else{this.showerror();break;}}
			case"��í":{
				if(this.checkjewel(user, 2500)){
				resulttemp.clear();
				result.setText("");
				if(!nojewelset){user.jewel-=2500;}
				StringBuffer gachatext = new StringBuffer();
				if(user.limited){
				for(int i=0; i<9; i++){
					resultcard=g.ReturnToGUIUnlimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);
					}resultcard=g.ReturnToGUIUnlimited(user, 1);
					gachatext.append(resultcard.Valueof());
					resulttemp.add(resultcard);
				} else {for(int i=0; i<9; i++){
					resultcard=g.ReturnToGUILimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);
					}resultcard=g.ReturnToGUILimited(user, 1);
					gachatext.append(resultcard.Valueof());
					resulttemp.add(resultcard);
				}
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				this.refresh();
				break;}else{this.showerror();break;}}
			case"����":{
				if(this.checkjewel(user, 60)){
				resulttemp.clear();
				result.setText("");
				if(!nojewelset){user.jewel-=60;}
				StringBuffer gachatext = new StringBuffer();
				if(user.limited){
					resultcard=g.ReturnToGUILimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);}
				else {
					resultcard=g.ReturnToGUIUnlimited(user, 0);
					gachatext.append(resultcard.Valueof()+"\n");
					resulttemp.add(resultcard);}
				String gacharesult=gachatext.toString();
				result.setText(result.getText()+gacharesult);
				this.refresh();
				break;}else{this.showerror();break;}}
			case"�˻�":{
				int count=0;
				if(resulttemp.isEmpty()){}else{
				String searchtext = searchtable.getText();
				String searchresult = "";
				StringBuffer searchbuffer = new StringBuffer(searchresult);
				for(int i=0;i<resulttemp.size();i++){
					if(resulttemp.get(i).name.contains(searchtext)){
						count++;
						searchbuffer.append(resulttemp.get(i).Valueof()+"\n");
					}String countshow = "�˻� ��� "+count+"��\n";
					searchresult = countshow+searchbuffer.toString();
				}if(count==0){JOptionPane.showMessageDialog(a,"�˻� ����� �����ϴ�.","�˻� ���",JOptionPane.INFORMATION_MESSAGE);}else{
				JOptionPane.showMessageDialog(a,searchresult,"�˻� ���",JOptionPane.INFORMATION_MESSAGE);
				}break;}break;}
			case"����":{
				int warn=0;
				int count=0;
				resulttemp.clear();
				result.setText("");
				StringBuffer gachatext = new StringBuffer();
				if(this.checkjewel(user, 250)){
				do{
					
					if(!nojewelset){user.jewel-=250;}
					this.refresh();
					if(user.limited){
						resultcard=g.ReturnToGUIUnlimited(user, 0);
						if(resultcard.lev.equals("SSR")){gachatext.append(resultcard.Valueof());}
						else{gachatext.append(resultcard.Valueof()+"\n");}
						resulttemp.add(resultcard);
						count++;
						String gacharesult=gachatext.toString();
						if(!this.checkjewel(user, 250)){
							JOptionPane.showMessageDialog(a, "SSR�� ���� �������� �꿤�� �����մϴ�", " ����", JOptionPane.ERROR_MESSAGE);
							result.setText(result.getText()+gacharesult);
							break;
						}
						if(resultcard.lev.equals("SSR")){
							result.setText(result.getText()+gacharesult);
							JOptionPane.showMessageDialog(a,count+"�� ���� SSR�� ���Խ��ϴ�.","���� ��í",JOptionPane.INFORMATION_MESSAGE);
							break;
							}
						}
					else {
						resultcard=g.ReturnToGUILimited(user, 0);
						if(resultcard.lev.equals("SSR")){gachatext.append(resultcard.Valueof());}
						else{gachatext.append(resultcard.Valueof()+"\n");}
						resulttemp.add(resultcard);
						count++;
						String gacharesult=gachatext.toString();
						if(!this.checkjewel(user, 250)){
							JOptionPane.showMessageDialog(a, "SSR�� ���� �������� �꿤�� �����մϴ�", " ����", JOptionPane.ERROR_MESSAGE);
							result.setText(result.getText()+gacharesult);
							break;
						}
						if(resultcard.lev.equals("SSR")){				
							result.setText(result.getText()+gacharesult);
							JOptionPane.showMessageDialog(a,count+"�� ���� SSR�� ���Խ��ϴ�.","���� ��í",JOptionPane.INFORMATION_MESSAGE);
							break;
						}
					}
				}while(true);
				break;}else{this.showerror();break;}
			}
			case"Ȯ�� ����":{
				new ProbabilityInfo();
				break;
			}
			case"����":{int result =JOptionPane.showConfirmDialog(a, "�����Ͻðڽ��ϱ�?","����",JOptionPane.YES_OPTION);
			if(result ==JOptionPane.YES_OPTION){
			System.exit(0);}
			}}
		}
	}
	
	public class limitedconfigbutton implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() ==ItemEvent.DESELECTED){
				user.limited=false;
			} else {user.limited=true;}
		}
	}
	
	public class typebutton implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			AbstractButton sel = (AbstractButton)e.getItemSelectable();
			switch(sel.getText()){
			case"Cute":{
				user.TypeGachaSetting=1;
				if(e.getStateChange()==ItemEvent.SELECTED){
					cool.setEnabled(false);
					passion.setEnabled(false);
					alltype.setEnabled(false);}
				else if(e.getStateChange()==ItemEvent.DESELECTED){
					cool.setEnabled(true);
					passion.setEnabled(true);
					alltype.setEnabled(true);}
				break;}
			case"Cool":{
				user.TypeGachaSetting=2;
				if(e.getStateChange()==ItemEvent.SELECTED){
					cute.setEnabled(false);
					passion.setEnabled(false);
					alltype.setEnabled(false);}
				else if(e.getStateChange()==ItemEvent.DESELECTED){
					cute.setEnabled(true);
					passion.setEnabled(true);
					alltype.setEnabled(true);}break;}
			case"Passion":{
				user.TypeGachaSetting=3;
				if(e.getStateChange()==ItemEvent.SELECTED){
					cool.setEnabled(false);
					cute.setEnabled(false);
					alltype.setEnabled(false);}
				else if(e.getStateChange()==ItemEvent.DESELECTED){
					cool.setEnabled(true);
					cute.setEnabled(true);
					alltype.setEnabled(true);}break;}
			case"All":{
				if(e.getStateChange()==ItemEvent.SELECTED){
					user.TypeGachaSetting=0;
					cool.setEnabled(false);
					passion.setEnabled(false);
					cute.setEnabled(false);}
				else if(e.getStateChange()==ItemEvent.DESELECTED){
					cool.setEnabled(true);
					passion.setEnabled(true);
					cute.setEnabled(true);}break;}
			}
		}
	}

	public class moneylistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			switch(e.getActionCommand()){
			case"��ȭ�� ����":{
				String yen;
				int yencharge;
				do{
				yen=JOptionPane.showInputDialog(a,"������ ���� �Է��ϼ���");
				try{
					if(yen.equals("")){
						break;
					}
					else{
						try{yencharge=Integer.valueOf(yen);}
						catch(NumberFormatException i){
							JOptionPane.showMessageDialog(a,"�߸� �Է��ϼ̽��ϴ�. ������ �Է��ϼ���"," ���� �߻�",JOptionPane.ERROR_MESSAGE);
							continue;
						}
						user.yen+=yencharge;
						user.usedyen+=yencharge;
						moneystat3.setText("�� : "+user.yen);
						usedyen.setText("����� �� : "+user.usedyen);
					}
				}catch(Exception a){
					break;
				}break;
			}while(true);break;
			}
			default:{}
			}
		}
	}
	
	public class listaction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jewellist){
				select = (String)jewellist.getSelectedItem();
			}
		}
	}
	
	public class jewelcharge implements ActionListener{
		public void refresh(){
			moneystat3.setText("�� : "+user.yen);
			jewelstat3.setText("�꿤 : "+user.jewel);
		}
		
		public void checkmoney (User user, int jewel, int money){
			if(user.yen<money){
				JOptionPane.showMessageDialog(a, "���� �����մϴ�"," ���� ���",JOptionPane.ERROR_MESSAGE);
			} else{
				user.jewel+=jewel;
				user.yen-=money;
				this.refresh();
				}
		}
		public void actionPerformed(ActionEvent e){
			String jewelselect=(String)jewellist.getSelectedItem();
			if(jewelselect==jewels2.get(0)){
				JOptionPane.showMessageDialog(a, "������ �꿤�� �������ּ���"," ���ÿ�",JOptionPane.INFORMATION_MESSAGE);
			}else if(jewelselect==jewels2.get(1)){
				this.checkmoney(user, 120, 60);
			}else if(jewelselect==jewels2.get(2)){
				this.checkmoney(user, 360, 480);
			}else if(jewelselect==jewels2.get(3)){
				this.checkmoney(user, 760, 960);
			}else if(jewelselect==jewels2.get(4)){
				this.checkmoney(user, 1300, 1600);
			}else if(jewelselect==jewels2.get(5)){
				this.checkmoney(user, 2650, 3200);
			}else if(jewelselect==jewels2.get(6)){
				this.checkmoney(user, 4200, 5000);
			}else if(jewelselect==jewels2.get(7)){
				this.checkmoney(user, 8400, 9800);
			}
			
		}
	}
	
	public class nojewelbutton implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() ==ItemEvent.SELECTED){
				nojewelset=true;
			} else {nojewelset=false;}
		}
	}
	
	public class ProbabilityInfo extends JFrame{
		JTextField SSRP = new JTextField(4);
		JTextField SRP = new JTextField(4);
		JTextField RP = new JTextField(4);
		JLabel prostat = new JLabel();
		Double tempR = 100-(user.tempSSR+user.tempSR);
		JComboBox prolists = new JComboBox();
		
		public class prolistaction implements ItemListener{
			public void itemStateChanged(ItemEvent e) {
				String item=e.getItem().toString();
				switch(item){
				case"����� ����":{
					SSRP.setText("");
					SRP.setText("");
					RP.setText("");
					break;
				}
				case"�⺻ ������":{
					SSRP.setText("1.5");
					SRP.setText("10.0");
					break;
				}
				case"�ŵ��佺":{
					SSRP.setText("3.0");
					SRP.setText("10.0");
					break;
				}
				}
			}
		}
		
		ProbabilityInfo(){
			Font info2 = new Font("���� ���",0,14);
			
			Gacha g = new Gacha();
			setTitle("Ȯ�� ����");
			Container c = getContentPane();
			c.setLayout(new BorderLayout(2,2));
			JLabel title = new JLabel(" ��í Ȯ�� ���� �޴�");
			JButton exit = new JButton("����");
			
			JPanel info = new JPanel();
			JPanel titlebar = new JPanel();
			titlebar.setLayout(new BorderLayout(10,10));
			
			info.setLayout(null);
			titlebar.add(exit,BorderLayout.EAST);
			titlebar.add(title,BorderLayout.WEST);
			
			exit.setLocation(259,1);
			title.setLocation(1,1);
			
			exit.setSize(40,40);
			title.setSize(15,15);
			
			c.add(info, BorderLayout.CENTER);
			c.add(titlebar,BorderLayout.NORTH);
			
			title.setFont(new Font("���� ���",Font.BOLD,20));
			exit.setFont(new Font("���� ���",0,15));
			
			exit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			// title 
			
			prostat.setText("���� Ȯ��  SSR : "+user.tempSSR+"  SR : "+user.tempSR+"  R : "+tempR);
			JLabel warning = new JLabel("    SSR+SRȮ���� 100 �̻����� �ϰų�");
			JLabel warning2 = new JLabel("   ���� �ϳ��� 100���� �������� ������");
			
			JLabel SSR = new JLabel("SSR");
			JLabel SR = new JLabel("SR");
			JLabel R = new JLabel("R");
			
			JButton OK = new JButton("����");
			
			RP.setEditable(false);
			String [] prolist ={"����� ����","�⺻ ������","�ŵ��佺"};
			ArrayList<String> prolistarray = new ArrayList<String>();
			for(int i=0; i<prolist.length;i++){
				prolistarray.add(prolist[i]);
			}
			
			prolists = new JComboBox(prolist);
			prolists.addItemListener(new prolistaction());

			info.add(prostat);
			info.add(warning);
			info.add(warning2);
			info.add(SSR);
			info.add(SR);
			info.add(R);
			info.add(SSRP);
			info.add(SRP);
			info.add(RP);
			info.add(OK);
			info.add(prolists);
			
			prostat.setSize(300,40);
			warning.setSize(300,80);
			warning2.setSize(300,80);
			SSR.setSize(30,15);
			SR.setSize(30,15);
			R.setSize(30,15);
			SSRP.setSize(35,30);
			SRP.setSize(35,30);
			RP.setSize(35,30);
			OK.setSize(95,20);
			prolists.setSize(95,20);
			
			prostat.setLocation(20,0);
			warning.setLocation(10,2);
			warning2.setLocation(10,19);
			SSR.setLocation(14,70);
			SR.setLocation(74,70);
			R.setLocation(134,70);
			SSRP.setLocation(10,90);
			SRP.setLocation(70,90);
			RP.setLocation(130,90);
			OK.setLocation(185,100);
			prolists.setLocation(185,75);
			
			prostat.setFont(info2);
			warning.setFont(info2);
			SSR.setFont(info2);
			SR.setFont(info2);
			R.setFont(info2);
			SSRP.setFont(info2);
			SRP.setFont(info2);
			RP.setFont(info2);
			OK.setFont(info2);
			prolists.setFont(info2);
			warning2.setFont(info2);
			
			OK.addActionListener(new OKaction());
			
			setSize(300,200);
			setResizable(false);
			setVisible(true);	
		}
		
		public class OKaction implements ActionListener{
				
			public void showerror(){
				JOptionPane.showMessageDialog(a, "�߸� �Է��ϼ̽��ϴ�"," �߸� �Է�",JOptionPane.ERROR_MESSAGE);
			}
			public void actionPerformed(ActionEvent e) {
				Double ssrp=0.0;
				Double srp=0.0;
				Double rp=0.0;
				try{ssrp=Double.parseDouble(SSRP.getText());
				srp=Double.parseDouble(SRP.getText());
				if(ssrp+srp>=100){
					this.showerror();
					SSRP.setText("");
					SRP.setText("");
					RP.setText("");
				}else{
				RP.setText(String.valueOf(100-(ssrp+srp)));
				rp=Double.parseDouble(RP.getText());
				g.ProbabilityChangeGUI(user, ssrp, srp);
				prostat.setText("���� Ȯ��  SSR : "+user.tempSSR+"  SR : "+user.tempSR+"  R : "+g.ProbabilityShowGUI(user, 2));}}
				catch(NumberFormatException a){
					this.showerror();
					SSRP.setText("");
					SRP.setText("");
					RP.setText("");
				}
			}
		}
	}
	
	public static void main(String[] args){new MainMenu();}}