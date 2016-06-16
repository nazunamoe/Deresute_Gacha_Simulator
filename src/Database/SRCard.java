package Database;

import java.util.ArrayList;

public class SRCard extends Card {
	ArrayList<Card> info = new ArrayList<Card>();
	public SRCard() {
	}
	public SRCard(String lev, String type, String name, boolean limited) {
		super(lev,type,name,limited);
	}
	public ArrayList<Card> info(){
		info.add(new Card("SR","Cute","[���� Ĺ] ����ī�� ����",false));
		info.add(new Card("SR","Cute","[������ ������] �̹��� ī����",false));
		info.add(new Card("SR","Cute","[������ �ҳ�] ������Ÿ ��ȣ",false));
		info.add(new Card("SR","Cute","[�ҾǸ� ���̵�] �̾߸��� ��������ī",false));
		info.add(new Card("SR","Cute","[ǻ� ��] ����߸� �����",false));
		info.add(new Card("SR","Cute","[�ܿ��� ��ε�] ����Ÿ ġ����",false));
		info.add(new Card("SR","Cute","[��Ʋ ��������] ����߸� ����",false));
		info.add(new Card("SR","Cool","[�ź��� ����] Ÿī��Ű ī����",false));
		info.add(new Card("SR","Cool","[��¦�̴� �ҳ�] ȣ�� ī��",false));
		info.add(new Card("SR","Cool","[�̼��� ����] ��Ÿ �̳���",false));
		info.add(new Card("SR","Cool","[���� ��Ŀ] Ÿ�� ���̳�",false));
		info.add(new Card("SR","Cool","[��Ÿ�� ��ġ] �Ƴ���Ÿ��",false));
		info.add(new Card("SR","Cool","[�ڶ� ��������] ���� ��Ű��",false));
		info.add(new Card("SR","Cool","[��� �÷�Ʈ ��Ƽ] �ƶ�Ű ����",false));
		info.add(new Card("SR","Passion","[����Ʈ �߷�Ÿ��] ����Ű ���̸�",false));
		info.add(new Card("SR","Cute","[�������� ����] ��ī�� �̸���",false));
		info.add(new Card("SR","Passion","[ī������ GAL] �Ұ���Ű ��ī",false));
		info.add(new Card("SR","Passion","[ī������ �̴� GAL] �Ұ���Ű ��ī",false));
		info.add(new Card("SR","Passion","[���� ġ���] ����ī�� ��Ű",false));
		info.add(new Card("SR","Cool","[��ŷ ����] Ű���� ����Ű",false));
		info.add(new Card("SR","Passion","[���ö�� ����] ����Ű ī����",false));
		info.add(new Card("SR","Passion","[�ε巯�� �ҳ�] Ÿī�� ������",false));
		info.add(new Card("SR","Cute","[�Ȱ� ��������] ī���� �Ϸ糪",false));
		info.add(new Card("SR","Passion","[������ ġ���] ��ī�پ߽� ���ī",false));
		info.add(new Card("SR","Cute","[��Ǿ Ʈ����] ��ġ�뼼 ��Ű",false));
		info.add(new Card("SR","Passion","[������Ʈ �ö��] ���̹� ����",false));
		info.add(new Card("SR","Cool","[�����Ʈ �޸���] ����� �Ĺ�ī",false));
		info.add(new Card("SR","Cool","[��ŷ ���ø���Ʈ] �������� ��",false));
		info.add(new Card("SR","Cute","[������ ġ��] ��ī�� ��ī",false));
		info.add(new Card("SR","Cool","[����Ʈ ��������] ����ī�� ġ����",false));
		info.add(new Card("SR","Passion","[���������� ���Ƽ] īŸ�⸮ �糪��",false));
		info.add(new Card("SR","Cute","[�����á�����Ƽ ��Ʈ] ���ھ߸� ġī",false));
		info.add(new Card("SR","Cool","[������ ���ִ�] ī�ͽø� ����Ű",false));
		info.add(new Card("SR","Passion","[���� �ҳ�] ��ī�� Ÿ���",false));
		info.add(new Card("SR","Cute","[���� ������] �� �ó��",false));
		info.add(new Card("SR","Passion","[�ҳ��� ����] �޾ ��ũ��",false));
		info.add(new Card("SR","Cool","[���ݶ� �߷�Ÿ��] ���� ���",false));
		info.add(new Card("SR","Passion","[���Ͽ��� ȭ���� �ư���] ���� ����",false));
		info.add(new Card("SR","Cute","[��Ժ� ���ִ�] ������� ���ī",false));
		info.add(new Card("SR","Cool","[ġ���� ����] ���ĳ� ����",false));
		info.add(new Card("SR","Passion","[õ�Ͼ�ȭ ����] ��Ż����",false));
		info.add(new Card("SR","Passion","[ȭ���� �����ġ] �ϸ���ġ �ƾ߸�",false));
		info.add(new Card("SR","Cute","[�ҽ� ��] �̸��� ī��",false));
		info.add(new Card("SR","Cool","[��ǳ�� ��Ʈ����Ŀ] ����Ű �Ϸ�",false));
		info.add(new Card("SR","Cool","[�αٵα١�ç����] �ƾ߼� ȣ��ī",false));
		info.add(new Card("SR","Passion","[������ ǫ��ǫ��] ��ġ�϶� �ϳ�",false));
		info.add(new Card("SR","Cute","[û���� �ư���] ������� ��ī��",false));
		info.add(new Card("SR","Cool","[���� ��������] ��Ű�߸� Ÿ����",false));
		info.add(new Card("SR","Cute","[�ɹ��� ���ٶ�] ���̿��� ����ī",false));
		info.add(new Card("SR","Passion","[����� ����] �߱�ġ �̿�",false));
		info.add(new Card("SR","Cool","[���� ��Ƽ] �������� �縮��",false));
		info.add(new Card("SR","Cute","[��ġ ���̺�] ������ �����",false));
		return info;
	}
}