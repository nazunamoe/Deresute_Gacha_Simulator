package Database;
public class SRCardLimited extends Card {
	Card[] info = new Card [super.SRCardLimitednumber];
	public Card[] inforeturn(){
		return info;
	}
	public Card info(int k){
		
		info[0] = new Card();
		info[0].settype("cool");
		info[0].setname("[�������� ��¦��] ���ī�� ġ��Ű");
		
		info[1] = new Card();
		info[1].settype("cool");
		info[1].setname("[�ҷ��� ����Ʈ�޾�] �ö��ī �ڿ��");
		
		info[2] = new Card();
		info[2].settype("passion");
		info[2].setname("[ġ���� ����] ����ī�� ������");
		
		info[3] = new Card();
		info[3].settype("cute");
		info[3].setname("[����Ʈ ũ��������] �̰���� ����");
		
		info[4] = new Card();
		info[4].settype("cute");
		info[4].setname("[��⸸��] ������ ī�� ");
		
		info[5] = new Card();
		info[5].settype("cool");
		info[5].setname("[���� �ڽŰ�] ��Ű�߸� Ÿ����");
		
		info[6] = new Card();
		info[6].settype("cute");
		info[6].setname("[����Ƽ ��Ƽ��] ��ī�� ��ī");
		
		info[7] = new Card();
		info[7].settype("cute");
		info[7].setname("[�����/�����] ����ī�� ����");
		
		info[8] = new Card();
		info[8].settype("cute");
		info[8].setname("[��Ī �Ϳ��] �ڽù��� ��ġ��");
		
		info[8] = new Card();
		info[8].settype("passion");
		info[8].setname("[�˷��׷� ���] �����߸� �����");
		
		info[9] = new Card();
		info[9].settype("passion");
		info[9].setname("[���� ����̴�] ��Ż����");
		
		info[10] = new Card();
		info[10].settype("passion");
		info[10].setname("[�Ƹ��ٿ� �ź�] ������ ���");
		for(int i=0; i<super.SRCardLimitednumber; i++){
			info[i].setlev("SR");
			info[i].setlimited(true);
		}
		
		return info[k];
	}
	
}
/*
case k:{
info[k].settype("");
info[k].setname("");
return info[k];		
}

*/