package Database;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Card extends CardList{
	private String type;
	private String lev;
	private String name;
	private boolean limited;
	
	private int life;
	private int dance;
	private int vocal;
	private int visual;
	private int tlife;
	private int tdance;
	private int tvocal;
	private int tvisual;
	private String skillstr;
	private String skilltitle;
	private String centerstr;
	private String centertitle;
	public Image imageb;
	public Image imagea;
	public File patha;
	public File pathb;
	
	public void setImage(String path, Image i){
		try{InputStream is = new BufferedInputStream(new FileInputStream(path));
		i=ImageIO.read(is);}
		catch(IOException e){}
	}
	public Image getImageb(){
		return imageb;
	}
	public Image getImagea(){
		return imagea;
	}
	public void loadimages(){
		for(int i=0; i<unlimitedinfo().size(); i++){
			try{
				InputStream is = new BufferedInputStream(new FileInputStream(unlimitedinfo().get(i).patha));
				this.imagea=ImageIO.read(is);
				System.out.println(this.name);
//				System.out.println(count);
				count++;
				is = new BufferedInputStream(new FileInputStream(unlimitedinfo().get(i).pathb));
				this.imageb=ImageIO.read(is);}
				catch(IOException e){}
		}
	}
	

	public String Valueof() {return "[" + this.getlev() + "] [" + this.gettype() + "] " + this.getname() ;}
	public String getlev(){return lev;}
	public String getname(){return name;}
	public String gettype(){return type;}
	public boolean getlimited(){return limited;}
	public void setlev(String lev){this.lev=lev;}
	public void setname(String name){this.name=name;}
	public void settype(String type){this.type=type;}
	public void setlimited(boolean limited){this.limited=limited;}
	
	public void setlife(int life){this.life=life;}
	public void setvocal(int vocal){this.vocal=vocal;}
	public void setdance(int dance){this.dance=dance;}
	public void setvisual(int visual){this.visual=visual;}
	public void settlife(int life){this.tlife=life;}
	public void settvocal(int vocal){this.tvocal=vocal;}
	public void settdance(int dance){this.tdance=dance;}
	public void settvisual(int visual){this.tvisual=visual;}
	public void setskillstr(String skillstr){this.skillstr=skillstr;}
	public void setskilltitle (String skilltitle){this.skilltitle=skilltitle;}
	public void setcenter(String center){this.centerstr=center;}
	public void setcentertitle(String centertitle){this.centertitle=centertitle;}
	
	public int getlife(){return life;}
	public int getvocal(){return vocal;}
	public int getdance(){return dance;}
	public int getvisual(){return visual;}
	public int gettlife(){return tlife;}
	public int gettvocal(){return tvocal;}
	public int gettdance(){return tdance;}
	public int gettvisual(){return tvisual;}
	public String getskillstr(){return skillstr;}
	public String getskilltitle (){return skilltitle;}
	public String getcenter(){return centerstr;}
	public String getcentertitle(){return centertitle;}
	int count =0;
	
	public Card(String lev, String type, String name, boolean limited){
		this.setlev(lev);
		this.settype(type);
		this.setname(name);
		this.setlimited(limited);
	}
	public Card(String lev, String type, String name, boolean limited,int life, int vocal, 
			int dance,int visual,int tlife, int tvocal, int tdance,int tvisual,String skill,
			String skilltitle,boolean panjung,String center,int intervaltime, int pro, 
			int term, int effect, int overload,int centereffect, File patha, File pathb){
		this.setlev(lev);
		this.settype(type);
		this.setname(name);
		this.setlimited(limited);
		this.setlife(life);
		this.setvocal(vocal);
		this.setdance(dance);
		this.setvisual(visual);
		this.settlife(tlife);
		this.settvocal(tvocal);
		this.settdance(tdance);
		this.settvisual(tvisual);
		this.setskilltitle(skilltitle);
		this.patha=patha;
		this.pathb=pathb;
		switch(skill){
		case"o":{
			this.setskillstr(intervaltime+" �� ���� "+(int)pro+"% Ȯ���� ��������"+overload+"��ŭ �Ҹ��Ͽ�, \n"+term+"�� ����  PERFECT ���ھ"+effect+"% ���, \nNICE/BAD���� COMBO�� ������ ����");
			break;
		}
		case"s":{
			switch(lev){
			case"SSR":{this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+" �� ����, PERFECT/GREAT\n ���ھ "+effect+"% ���");break;}
			default:{this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+" �� ����, PERFECT ���ھ \n"+effect+"% ���");break;}
			}break;
		}
		case"c":{
			this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, COMBO ���ʽ� \n"+effect+"% ���");
			break;
			}
		case"p":{
			if(panjung){this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, NICE���� �޺��� \n������ ����");}else if(!panjung){
			switch(lev){
			case"SSR":{this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ���� , GREAT/NICE/BAD�� \nPERFECT�� ����");break;}
			case"SR":{this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, GREAT/NICE��\n PERFECT�� ����");break;}
			case"R":{this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, GREAT�� PERFECT�� ����");break;}
			}
			}
			}
			break;
		case"m":{
			this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, �������� �������� ����");
			break;
		}
		case"h":{
			this.setskillstr(intervaltime+"�� ���� "+(int)pro+"% Ȯ���� "+term+"�� ����, PERFECT�� ������ \n"+effect+" ȸ��");
			break;
		}
		}
		switch(center){
		case"a":{
			this.setcentertitle(type+" �긱����");
			this.setcenter(type+" ���̵��� ��� ���� ��ġ "+centereffect+"% ���");
			break;
		}
		case"v":{
			this.setcentertitle(type+" ���̽�");
			this.setcenter(type+" ���̵��� ���� ���� ��ġ "+centereffect+"% ���");
			break;
		}
		case"d":{
			this.setcentertitle(type+" ����");
			this.setcenter(type+" ���̵��� �� ���� ��ġ "+centereffect+"% ���");
			break;
		}
		case"i":{
			this.setcentertitle(type+" ����ũ");
			this.setcenter(type+" ���̵��� ����� ���� ��ġ "+centereffect+"% ���");
			break;
		}
		case"s":{
			this.setcentertitle(type+" �����Ƽ");
			this.setcenter(type+" ���̵��� ��ų �ߵ��� "+centereffect+"% ���");
			break;
		}
		case"l":{
			this.setcentertitle(type+" ������");
			this.setcenter(type+" ���̵��� ������ "+centereffect+"% ���");
			break;
		}
		}
	}

	public Card(){}


	public ArrayList<Card> CoolSSR = new ArrayList<Card>();
	public ArrayList<Card> CuteSSR = new ArrayList<Card>();
	public ArrayList<Card> PassionSSR = new ArrayList<Card>();
	public ArrayList<Card> CoolSSRLimited = new ArrayList<Card>();
	public ArrayList<Card> CuteSSRLimited = new ArrayList<Card>();
	public ArrayList<Card> PassionSSRLimited = new ArrayList<Card>();


	public ArrayList<Card> CuteSSRLimitedList() {
		if(!CuteSSRLimited.isEmpty()){}
		else{
		for(int i=0; i<this.UnitedLimitedCardList().size(); i++){
			if(this.UnitedLimitedCardList().get(i).gettype().equals("ťƮ")){
				if(this.UnitedLimitedCardList().get(i).getlev().equals("SSR")){
					CuteSSRLimited.add(this.UnitedLimitedCardList().get(i));}
				}
			}
		}
		return CuteSSRLimited;
	}
	
	public ArrayList<Card> CuteSSRList() {
		if(!CuteSSR.isEmpty()){}else{
		for(int i=0; i<this.UnitedCardList().size(); i++){
			if(this.UnitedCardList().get(i).gettype().equals("ťƮ")){
				if(this.UnitedCardList().get(i).getlev().equals("SSR")){
					CuteSSR.add(this.UnitedCardList().get(i));}
				}
			}
		}
		return CuteSSR;
	}
	
	public ArrayList<Card> CoolSSRLimitedList() {
		if(!CoolSSRLimited.isEmpty()){}
		else{
		for(int i=0; i<this.UnitedLimitedCardList().size(); i++){
			if(this.UnitedLimitedCardList().get(i).gettype().equals("��")){
				if(this.UnitedLimitedCardList().get(i).getlev().equals("SSR")){
					CoolSSRLimited.add(this.UnitedLimitedCardList().get(i));}
				}
			}
		}
		return CoolSSRLimited;
	}
	
	public ArrayList<Card> CoolSSRList() {
		if(!CoolSSR.isEmpty()){}else{
		for(int i=0; i<this.UnitedCardList().size(); i++){
			if(this.UnitedCardList().get(i).gettype().equals("��")){
				if(this.UnitedCardList().get(i).getlev().equals("SSR")){
					CoolSSR.add(this.UnitedCardList().get(i));}
				}
			}
		}
		return CoolSSR;
	}
	
	public ArrayList<Card> PassionSSRLimitedList() {
		if(!PassionSSRLimited.isEmpty()){}
		else{
		for(int i=0; i<this.UnitedLimitedCardList().size(); i++){
			if(this.UnitedLimitedCardList().get(i).gettype().equals("�м�")){
				if(this.UnitedLimitedCardList().get(i).getlev().equals("SSR")){
					PassionSSRLimited.add(this.UnitedLimitedCardList().get(i));}
				}
			}
		}
		return PassionSSRLimited;
	}
	
	public ArrayList<Card> PassionSSRList() {
		if(!PassionSSR.isEmpty()){}else{
		for(int i=0; i<this.UnitedCardList().size(); i++){
			if(this.UnitedCardList().get(i).gettype().equals("�м�")){
				if(this.UnitedCardList().get(i).getlev().equals("SSR")){
					PassionSSR.add(this.UnitedCardList().get(i));}
				}
			}
		}
		return PassionSSR;
	}
	
	public ArrayList<Card> UnitedCardList(){
		ArrayList<Card> UnitedCard = new ArrayList<Card>();
		if(!UnitedCard.isEmpty()){return UnitedCard;}else{
		SSRCard SSRCard = new SSRCard();
		SRCard SRCard = new SRCard();
		RCard RCard = new RCard();
		for(int i=0; i<SSRCard.info().size(); i++){UnitedCard.add(SSRCard.info.get(i));}
		for(int i=0; i<SRCard.info().size(); i++){UnitedCard.add(SRCard.info.get(i));}
		for(int i=0; i<RCard.info().size(); i++){UnitedCard.add(RCard.info.get(i));}
		return UnitedCard;}
	}
	
	public ArrayList<Card> UnitedLimitedCardList(){
		ArrayList<Card> UnitedLimitedCard = new ArrayList<Card>();
		if(!UnitedLimitedCard.isEmpty()){return UnitedLimitedCard;}else{
		SSRCard SSRCard = new SSRCard();
		SRCard SRCard = new SRCard();
		RCard RCard = new RCard();
		SSRCardLimited SSRCardLimited = new SSRCardLimited();
		SRCardLimited SRCardLimited = new SRCardLimited();
		for(int i=0; i<SSRCard.info().size(); i++){UnitedLimitedCard.add(SSRCard.info.get(i));}
		for(int i=0; i<SRCard.info().size(); i++){UnitedLimitedCard.add(SRCard.info.get(i));}
		for(int i=0; i<RCard.info().size(); i++){UnitedLimitedCard.add(RCard.info.get(i));}
		for(int i=0; i<SSRCardLimited.info().size(); i++){UnitedLimitedCard.add(SSRCardLimited.info.get(i));}
		for(int i=0; i<SRCardLimited.info().size(); i++){UnitedLimitedCard.add(SRCardLimited.info.get(i));}
		return UnitedLimitedCard;}
	}
}
	
