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
		info.add(new Card("SR","ťƮ","[����Ƽ ��Ƽ��] ��ī�� ��ī",true));
		info.add(new Card("SR","ťƮ","[�����/�����] ����ī�� ����",true));
		info.add(new Card("SR","ťƮ","[��Ī �Ϳ��] �ڽù��� ��ġ��",true));
		info.add(new Card("SR","ťƮ","[����Ʈ ũ��������] �̰���� ����",true));
		info.add(new Card("SR","ťƮ","[��⸸��] ������ ī��",true));
		info.add(new Card("SR","��","[�������� ��¦��] ���ī�� ġ��Ű",true));
		info.add(new Card("SR","��","[�ҷ��� ����Ʈ�޾�] �ö��ī �ڿ��",true));
		info.add(new Card("SR","��","[���� �ڽŰ�] ��Ű�߸� Ÿ����",true));
		info.add(new Card("SR","�м�","[ġ���� ����] ����ī�� ������",true));
		info.add(new Card("SR","�м�","[�˷��׷� ���] �����߸� �����",true));
		info.add(new Card("SR","�м�","[���� ����̴�] ��Ż����",true));
		info.add(new Card("SR","�м�","[�Ƹ��ٿ� �ź�] ������ ���",true));
		return info;
	}
}