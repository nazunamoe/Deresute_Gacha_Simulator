package Database;
public class SSRCardLimited extends Card {
	public Card ssrinfo (int k){
		Card[] ssrinfo=new Card [super.SSRCardLimitednumber];
		
		ssrinfo[0] = new Card();
		ssrinfo[0].type="passion";
		ssrinfo[0].name="[���� ��] ��ī�� �̸��� ";

		ssrinfo[1] = new Card();
		ssrinfo[1].type="cool";
		ssrinfo[1].name="[��Ʈ&��Ʈ] Ÿ�� ���̳� ";

		ssrinfo[2] = new Card();
		ssrinfo[2].type="cool";
		ssrinfo[2].name="[ũ����Ż �����] �Ƴ���Ÿ��";

		ssrinfo[3] = new Card();
		ssrinfo[3].type="cool";
		ssrinfo[3].name="[���Ÿ� �޸�] ī�ͽø� ����Ű ";

		ssrinfo[4] = new Card();
		ssrinfo[4].type="cool";
		ssrinfo[4].name="[��ٶ��� ��Ȥ] Ÿī��Ű ī����";

		ssrinfo[5] = new Card();
		ssrinfo[5].type="cute";
		ssrinfo[5].name="[ȭ��Ʈ ��ġ] �̹��� ī���� ";

		ssrinfo[6] = new Card();
		ssrinfo[6].type="cute";
		ssrinfo[6].name="[�޺� Ŭ�ι�] ����Ÿ ġ���� ";

		ssrinfo[7] = new Card();
		ssrinfo[7].type="cute";
		ssrinfo[7].name="[�ʱ��ʱ� ����] �ƺ� ���� ";

		ssrinfo[8] = new Card();
		ssrinfo[8].type="cute";
		ssrinfo[8].name="[����Ǯ �θǽ�] ������Ÿ ��ȣ ";

		ssrinfo[9] = new Card();		
		ssrinfo[9].type="passion";
		ssrinfo[9].name="[��Ʈ�ڿ����÷ο�] �Ұ���Ű ��ī";

		ssrinfo[10] = new Card();
		ssrinfo[10].type="passion";
		ssrinfo[10].name="[���� ������Ʈ] ���� ��ī��";		

		ssrinfo[11] = new Card();
		ssrinfo[11].type="passion";
		ssrinfo[11].name="[����Ų ��Ƽ] ����Ű ���̸�";		

		ssrinfo[12] = new Card();
		ssrinfo[12].type="cute";
		ssrinfo[12].name="[���� �÷ڸ�] ������� ���ī";		

		ssrinfo[13] = new Card();
		ssrinfo[13].type="passion";
		ssrinfo[13].name="[��ȭ���] ��ī�� Ÿ���";		
		
		ssrinfo[14] = new Card();
		ssrinfo[14].type="cool";
		ssrinfo[14].name="[ó�� ���� ǥ��] Ÿġ�ٳ� �Ƹ��� ";		
		
		ssrinfo[15] = new Card();
		ssrinfo[15].type="passion";
		ssrinfo[15].name="[�̸�ų� ��Ʈ] Ű���� ����Ű ";		
		
		for(int i=0; i<super.SSRCardLimitednumber; i++){
			ssrinfo[i].lev="SSR"; 
			ssrinfo[i].limited=true;
		}
		return ssrinfo[k];
	}
}


