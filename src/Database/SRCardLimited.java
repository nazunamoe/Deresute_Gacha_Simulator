package Database;


public class SRCardLimited extends Card {
	public Card srinfo(int k){
		Card[] srinfo = new Card [super.SRCardLimitednumber];
		
		srinfo[0] = new Card();
		srinfo[0].type="cool";
		srinfo[0].name="[�������� ��¦��] ���ī�� ġ��Ű";
		
		srinfo[1] = new Card();
		srinfo[1].type="cool";
		srinfo[1].name="[�ҷ��� ����Ʈ�޾�] �ö��ī �ڿ��";
		
		srinfo[2] = new Card();
		srinfo[2].type="passion";
		srinfo[2].name="[ġ���� ����] ����ī�� ������";
		
		srinfo[3] = new Card();
		srinfo[3].type="cute";
		srinfo[3].name="[����Ʈ ũ��������] �̰���� ����";
		
		srinfo[4] = new Card();
		srinfo[4].type="cute";
		srinfo[4].name="[��⸸��] ������ ī�� ";
		
		srinfo[5] = new Card();
		srinfo[5].type="cool";
		srinfo[5].name="[���� �ڽŰ�] ��Ű�߸� Ÿ����";
		
		srinfo[6] = new Card();
		srinfo[6].type="cute";
		srinfo[6].name="[����Ƽ ��Ƽ��] ��ī�� ��ī";
		
		srinfo[7] = new Card();
		srinfo[7].type="cute";
		srinfo[7].name="[�����/�����] ����ī�� ����";
		
		srinfo[8] = new Card();
		srinfo[8].type="cute";
		srinfo[8].name="[��Ī �Ϳ��] �ڽù��� ��ġ�� ";
		
		srinfo[8] = new Card();
		srinfo[8].type="passion";
		srinfo[8].name="[�˷��׷� ���] �����߸� �����  ";
		
//		srinfo[8] = new Card();
//		srinfo[8].type="passion";
//		srinfo[8].name="[�������̡ٵ�����] ����Ű ī���� ";	

		for(int i=0; i<super.SRCardLimitednumber; i++){
			srinfo[i].lev="SR";
			srinfo[i].limited=true;
		}
		
		return srinfo[k];
	}
	
}
/*
case k:{
srinfo[k].type="";
srinfo[k].name="";
return srinfo[k];		
}

*/