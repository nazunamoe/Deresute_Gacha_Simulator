package Database;

import java.util.ArrayList;

public class SSRCard extends Card {
	ArrayList<Card> info = new ArrayList<Card>();
	public SSRCard() {
	}
	public SSRCard(String lev, String type, String name, boolean limited) {
		super(lev,type,name,limited);
	}
	public ArrayList<Card> info(){
		info.add(new Card("SSR","Cute","[�̽�ƽ ������] ��ġ�뼼 ��Ű",false));
		info.add(new Card("SSR","Cute","[��Ī���Ϻ�] �ڽù��� ��ġ��",false));
		info.add(new Card("SSR","Cute","[�� ���� ��Ʈ] ���� ����",false));
		info.add(new Card("SSR","Cute","[Ĺ ��Ƽ] ����ī�� ����",false));
		info.add(new Card("SSR","Cute","[������ �ձ�] ��Ÿ�� ����",false));
		info.add(new Card("SSR","Cute","[�������� ���� ����] �ø����� ����Ű",false));
		info.add(new Card("SSR","Cute","[���� �𳯸��� ����] �ڹپ�ī�� �翡",false));
		info.add(new Card("SSR","Cute","[������ ��Ʈ] �̰���� ����",false));
		info.add(new Card("SSR","Cute","[�ֺ� ���] �̾߸��� ��������ī",false));
		info.add(new Card("SSR","Cool","[������ �Ѷ�] ȣ�� ī��",false));
		info.add(new Card("SSR","Cool","[���� �� ���κ���] ī�̾� ����",false));
		info.add(new Card("SSR","Cool","[���鸮�� ����Ʈ] �Ͼ߹� ī����",false));
		info.add(new Card("SSR","Cool","[�����Ʈ �޸���] ����� �Ĺ�ī",false));
		info.add(new Card("SSR","Cool","[��� ��ʽ�] ��Ÿ �̳���",false));
		info.add(new Card("SSR","Cool","[����� ����] ĭ��Ű ����",false));
		info.add(new Card("SSR","Cool","[�������� ���� ����] �úξ� ��",false));
		info.add(new Card("SSR","Cool","[������� �����׸�Ʈ] �ϳ�̾� �ƽ�ī",false));
		info.add(new Card("SSR","Cool","[������ ��] �ö��ī �ڿ��",false));
		info.add(new Card("SSR","Passion","[�Ž����ں�������] ȣ�� ����",false));
		info.add(new Card("SSR","Passion","[������ ����� �ູ] Ÿī�� ������",false));
		info.add(new Card("SSR","Passion","[Ǯ�����ٿ�] ����ī�� ��Ű",false));
		info.add(new Card("SSR","Passion","[ģ���� �ܶ�] ��ġ�϶� �ϳ�",false));
		info.add(new Card("SSR","Passion","[�������� ���� ����] ȥ�� �̿�",false));
		info.add(new Card("SSR","Passion","[Ű���ڡ��۷��̵�] �Ұ���Ű ��ī",false));
		info.add(new Card("SSR","Passion","[�׷���Ʈ ������Ʈ] ��κ��� Ű��",false));
		info.add(new Card("SSR","Passion","[�޲ٴ� ��������] ŰŸ ������",false));
		info.add(new Card("SSR","Passion","[�ؽ��� �ε���] �丮Ÿ ��ó�",false));
		info.add(new Card("SSR","Passion","[�߶� �Ϻ���Ʈ] ����ī�� ������",false));
		return info;
	}
}
