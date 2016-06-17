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
		info.add(new Card("SSR","ťƮ","[ȭ��Ʈ ��ġ] �̹��� ī����",true));
		info.add(new Card("SSR","ťƮ","[�޺� Ŭ�ι�] ����Ÿ ġ����",true));
		info.add(new Card("SSR","ťƮ","[�ʱ��ʱ� ����] �ƺ� ����",true));
		info.add(new Card("SSR","ťƮ","[����Ǯ �θǽ�] ������Ÿ ��ȣ",true));
		info.add(new Card("SSR","ťƮ","[���� �÷ڸ�] ������� ���ī",true));
		info.add(new Card("SSR","ťƮ","[�帮�� ����̵�] ����ī�� ����",true));
		info.add(new Card("SSR","��","[��Ʈ&��Ʈ] Ÿ�� ���̳�",true));
		info.add(new Card("SSR","��","[���Ÿ� �޸�] ī�ͽø� ����Ű",true));
		info.add(new Card("SSR","��","[��ٶ��� ��Ȥ] Ÿī��Ű ī����",true));
		info.add(new Card("SSR","��","[ũ����Ż �����] �Ƴ���Ÿ��",true));
		info.add(new Card("SSR","��","[ó�� ���� ǥ��] Ÿġ�ٳ� �Ƹ���",true));
		info.add(new Card("SSR","��","[��ٷ����� ����� ���] ĭ��Ű ����",true));
		info.add(new Card("SSR","�м�","[���� ��] ��ī�� �̸���",true));
		info.add(new Card("SSR","�м�","[��Ʈ�ڿ����÷ο�] �Ұ���Ű ��ī",true));
		info.add(new Card("SSR","�м�","[���� ������Ʈ] ���� ��ī��",true));
		info.add(new Card("SSR","�м�","[����Ų ��Ƽ] ����Ű ���̸�",true));
		info.add(new Card("SSR","�м�","[��ȭ���] ��ī�� Ÿ���",true));
		info.add(new Card("SSR","�м�","[�̸�ų� ��Ʈ] Ű���� ����Ű",true));
		return info;
	}
}