package Database;
public class SRCardLimited extends Card {
	Card[] srinfo = new Card [super.SRCardLimitednumber];
	public Card[] srinforeturn(){
		return srinfo;
	}
	public Card srinfo(int k){
		
		srinfo[0] = new Card();
		srinfo[0].settype("cool");
		srinfo[0].setname("[�������� ��¦��] ���ī�� ġ��Ű");
		
		srinfo[1] = new Card();
		srinfo[1].settype("cool");
		srinfo[1].setname("[�ҷ��� ����Ʈ�޾�] �ö��ī �ڿ��");
		
		srinfo[2] = new Card();
		srinfo[2].settype("passion");
		srinfo[2].setname("[ġ���� ����] ����ī�� ������");
		
		srinfo[3] = new Card();
		srinfo[3].settype("cute");
		srinfo[3].setname("[����Ʈ ũ��������] �̰���� ����");
		
		srinfo[4] = new Card();
		srinfo[4].settype("cute");
		srinfo[4].setname("[��⸸��] ������ ī�� ");
		
		srinfo[5] = new Card();
		srinfo[5].settype("cool");
		srinfo[5].setname("[���� �ڽŰ�] ��Ű�߸� Ÿ����");
		
		srinfo[6] = new Card();
		srinfo[6].settype("cute");
		srinfo[6].setname("[����Ƽ ��Ƽ��] ��ī�� ��ī");
		
		srinfo[7] = new Card();
		srinfo[7].settype("cute");
		srinfo[7].setname("[�����/�����] ����ī�� ����");
		
		srinfo[8] = new Card();
		srinfo[8].settype("cute");
		srinfo[8].setname("[��Ī �Ϳ��] �ڽù��� ��ġ��");
		
		srinfo[8] = new Card();
		srinfo[8].settype("passion");
		srinfo[8].setname("[�˷��׷� ���] �����߸� �����");
		
		srinfo[9] = new Card();
		srinfo[9].settype("passion");
		srinfo[9].setname("[���� ����̴�] ��Ż����");
		
		srinfo[10] = new Card();
		srinfo[10].settype("passion");
		srinfo[10].setname("[�Ƹ��ٿ� �ź�] ������ ���");
		for(int i=0; i<super.SRCardLimitednumber; i++){
			srinfo[i].setlev("SR");
			srinfo[i].setlimited(true);
		}
		
		return srinfo[k];
	}
	
}
/*
case k:{
srinfo[k].settype("");
srinfo[k].setname("");
return srinfo[k];		
}

*/