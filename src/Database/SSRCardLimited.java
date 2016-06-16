package Database;

import java.util.ArrayList;

public class SSRCardLimited extends Card {
	ArrayList<Card> info = new ArrayList<Card>();
	public SSRCardLimited() {
	}
	public SSRCardLimited(String lev, String type, String name, boolean limited) {
		super(lev,type,name,limited);
	}
	public ArrayList<Card> info(){
		info.add(new Card("SSR","Cute","[ȭ��Ʈ ��ġ] �̹��� ī����",true));
		info.add(new Card("SSR","Cute","[�޺� Ŭ�ι�] ����Ÿ ġ����",true));
		info.add(new Card("SSR","Cute","[�ʱ��ʱ� ����] �ƺ� ����",true));
		info.add(new Card("SSR","Cute","[����Ǯ �θǽ�] ������Ÿ ��ȣ",true));
		info.add(new Card("SSR","Cute","[���� �÷ڸ�] ������� ���ī",true));
		info.add(new Card("SSR","Cute","[�帮�� ����̵�] ����ī�� ����",true));
		info.add(new Card("SSR","Cool","[��Ʈ&��Ʈ] Ÿ�� ���̳�",true));
		info.add(new Card("SSR","Cool","[���Ÿ� �޸�] ī�ͽø� ����Ű",true));
		info.add(new Card("SSR","Cool","[��ٶ��� ��Ȥ] Ÿī��Ű ī����",true));
		info.add(new Card("SSR","Cool","[ũ����Ż �����] �Ƴ���Ÿ��",true));
		info.add(new Card("SSR","Cool","[ó�� ���� ǥ��] Ÿġ�ٳ� �Ƹ���",true));
		info.add(new Card("SSR","Cool","[��ٷ����� ����� ���] ĭ��Ű ����",true));
		info.add(new Card("SSR","Passion","[���� ��] ��ī�� �̸���",true));
		info.add(new Card("SSR","Passion","[��Ʈ�ڿ����÷ο�] �Ұ���Ű ��ī",true));
		info.add(new Card("SSR","Passion","[���� ������Ʈ] ���� ��ī��",true));
		info.add(new Card("SSR","Passion","[����Ų ��Ƽ] ����Ű ���̸�",true));
		info.add(new Card("SSR","Passion","[��ȭ���] ��ī�� Ÿ���",true));
		info.add(new Card("SSR","Passion","[�̸�ų� ��Ʈ] Ű���� ����Ű",true));
		return info;
	}
}