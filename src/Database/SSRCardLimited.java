package Database;
public class SSRCardLimited extends Card {
	Card[] info=new Card [super.SSRCardLimitednumber];
	public Card[] inforeturn(){
		return info;
	}
	public Card info (int k){
		
		info[0] = new Card();
		info[0].settype("passion");
		info[0].setname("[���� ��] ��ī�� �̸��� ");

		info[1] = new Card();
		info[1].settype("cool");
		info[1].setname("[��Ʈ&��Ʈ] Ÿ�� ���̳� ");

		info[2] = new Card();
		info[2].settype("cool");
		info[2].setname("[ũ����Ż �����] �Ƴ���Ÿ��");

		info[3] = new Card();
		info[3].settype("cool");
		info[3].setname("[���Ÿ� �޸�] ī�ͽø� ����Ű ");

		info[4] = new Card();
		info[4].settype("cool");
		info[4].setname("[��ٶ��� ��Ȥ] Ÿī��Ű ī����");

		info[5] = new Card();
		info[5].settype("cute");
		info[5].setname("[ȭ��Ʈ ��ġ] �̹��� ī���� ");

		info[6] = new Card();
		info[6].settype("cute");
		info[6].setname("[�޺� Ŭ�ι�] ����Ÿ ġ���� ");

		info[7] = new Card();
		info[7].settype("cute");
		info[7].setname("[�ʱ��ʱ� ����] �ƺ� ���� ");

		info[8] = new Card();
		info[8].settype("cute");
		info[8].setname("[����Ǯ �θǽ�] ������Ÿ ��ȣ ");

		info[9] = new Card();		
		info[9].settype("passion");
		info[9].setname("[��Ʈ�ڿ����÷ο�] �Ұ���Ű ��ī");

		info[10] = new Card();
		info[10].settype("passion");
		info[10].setname("[���� ������Ʈ] ���� ��ī��");		

		info[11] = new Card();
		info[11].settype("passion");
		info[11].setname("[����Ų ��Ƽ] ����Ű ���̸�");		

		info[12] = new Card();
		info[12].settype("cute");
		info[12].setname("[���� �÷ڸ�] ������� ���ī");		

		info[13] = new Card();
		info[13].settype("passion");
		info[13].setname("[��ȭ���] ��ī�� Ÿ���");		
		
		info[14] = new Card();
		info[14].settype("cool");
		info[14].setname("[ó�� ���� ǥ��] Ÿġ�ٳ� �Ƹ���");		
		
		info[15] = new Card();
		info[15].settype("passion");
		info[15].setname("[�̸�ų� ��Ʈ] Ű���� ����Ű");	
		
		info[16] = new Card();
		info[16].settype("cool");
		info[16].setname("[��ٷ����� ����� ���] ĭ��Ű ����");

		info[17] = new Card();
		info[17].settype("cute");
		info[17].setname("[�帮�� ����̵�] ����ī�� ����");
		
		for(int i=0; i<super.SSRCardLimitednumber; i++){
			info[i].setlev("SSR"); 
			info[i].setlimited(true);
		}
		return info[k];
	}
}


