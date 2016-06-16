package Database;

import java.util.ArrayList;

public class SRCardLimited extends Card {
	ArrayList<Card> info = new ArrayList<Card>();
	public SRCardLimited() {
	}
	public SRCardLimited(String lev, String type, String name, boolean limited) {
		super(lev,type,name,limited);
	}
	public ArrayList<Card> info(){
		info.add(new Card("SR","Cool","[�������� ��¦��] ���ī�� ġ��Ű",true));
		info.add(new Card("SR","Cool","[�ҷ��� ����Ʈ�޾�] �ö��ī �ڿ��",true));
		info.add(new Card("SR","Passion","[ġ���� ����] ����ī�� ������",true));
		info.add(new Card("SR","Cute","[����Ʈ ũ��������] �̰���� ����",true));
		info.add(new Card("SR","Cute","[��⸸��] ������ ī��",true));
		info.add(new Card("SR","Cool","[���� �ڽŰ�] ��Ű�߸� Ÿ����",true));
		info.add(new Card("SR","Cute","[����Ƽ ��Ƽ��] ��ī�� ��ī",true));
		info.add(new Card("SR","Cute","[�����/�����] ����ī�� ����",true));
		info.add(new Card("SR","Cute","[��Ī �Ϳ��] �ڽù��� ��ġ��",true));
		info.add(new Card("SR","Passion","[�˷��׷� ���] �����߸� �����",true));
		info.add(new Card("SR","Passion","[���� ����̴�] ��Ż����",true));
		info.add(new Card("SR","Passion","[�Ƹ��ٿ� �ź�] ������ ���",true));
		return info;
	}
}