package Database;
public class SSRCardLimited extends Card {
	Card[] ssrinfo=new Card [super.SSRCardLimitednumber];
	public Card[] ssrinforeturn(){
		return ssrinfo;
	}
	public Card ssrinfo (int k){
		
		ssrinfo[0] = new Card();
		ssrinfo[0].settype("passion");
		ssrinfo[0].setname("[���� ��] ��ī�� �̸��� ");

		ssrinfo[1] = new Card();
		ssrinfo[1].settype("cool");
		ssrinfo[1].setname("[��Ʈ&��Ʈ] Ÿ�� ���̳� ");

		ssrinfo[2] = new Card();
		ssrinfo[2].settype("cool");
		ssrinfo[2].setname("[ũ����Ż �����] �Ƴ���Ÿ��");

		ssrinfo[3] = new Card();
		ssrinfo[3].settype("cool");
		ssrinfo[3].setname("[���Ÿ� �޸�] ī�ͽø� ����Ű ");

		ssrinfo[4] = new Card();
		ssrinfo[4].settype("cool");
		ssrinfo[4].setname("[��ٶ��� ��Ȥ] Ÿī��Ű ī����");

		ssrinfo[5] = new Card();
		ssrinfo[5].settype("cute");
		ssrinfo[5].setname("[ȭ��Ʈ ��ġ] �̹��� ī���� ");

		ssrinfo[6] = new Card();
		ssrinfo[6].settype("cute");
		ssrinfo[6].setname("[�޺� Ŭ�ι�] ����Ÿ ġ���� ");

		ssrinfo[7] = new Card();
		ssrinfo[7].settype("cute");
		ssrinfo[7].setname("[�ʱ��ʱ� ����] �ƺ� ���� ");

		ssrinfo[8] = new Card();
		ssrinfo[8].settype("cute");
		ssrinfo[8].setname("[����Ǯ �θǽ�] ������Ÿ ��ȣ ");

		ssrinfo[9] = new Card();		
		ssrinfo[9].settype("passion");
		ssrinfo[9].setname("[��Ʈ�ڿ����÷ο�] �Ұ���Ű ��ī");

		ssrinfo[10] = new Card();
		ssrinfo[10].settype("passion");
		ssrinfo[10].setname("[���� ������Ʈ] ���� ��ī��");		

		ssrinfo[11] = new Card();
		ssrinfo[11].settype("passion");
		ssrinfo[11].setname("[����Ų ��Ƽ] ����Ű ���̸�");		

		ssrinfo[12] = new Card();
		ssrinfo[12].settype("cute");
		ssrinfo[12].setname("[���� �÷ڸ�] ������� ���ī");		

		ssrinfo[13] = new Card();
		ssrinfo[13].settype("passion");
		ssrinfo[13].setname("[��ȭ���] ��ī�� Ÿ���");		
		
		ssrinfo[14] = new Card();
		ssrinfo[14].settype("cool");
		ssrinfo[14].setname("[ó�� ���� ǥ��] Ÿġ�ٳ� �Ƹ���");		
		
		ssrinfo[15] = new Card();
		ssrinfo[15].settype("passion");
		ssrinfo[15].setname("[�̸�ų� ��Ʈ] Ű���� ����Ű");	
		
		ssrinfo[16] = new Card();
		ssrinfo[16].settype("cool");
		ssrinfo[16].setname("[��ٷ����� ����� ���] ĭ��Ű ����");

		ssrinfo[17] = new Card();
		ssrinfo[17].settype("cute");
		ssrinfo[17].setname("[�帮�� ����̵�] ����ī�� ����");
		
		for(int i=0; i<super.SSRCardLimitednumber; i++){
			ssrinfo[i].setlev("SSR"); 
			ssrinfo[i].setlimited(true);
		}
		return ssrinfo[k];
	}
}


