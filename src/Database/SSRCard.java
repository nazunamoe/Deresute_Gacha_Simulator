package Database;
public class SSRCard extends Card {
	Card[] ssrinfo = new Card [super.SSRCardnumber];
	public Card[] ssrinforeturn(){
		return ssrinfo;
	}
	public Card ssrinfo(int k){
		

		ssrinfo[0]=new Card();
		ssrinfo[0].type="cute";
		ssrinfo[0].name="[�̽�ƽ ������] ��ġ�뼼 ��Ű ";

		ssrinfo[1]=new Card();
		ssrinfo[1].type="passion";
		ssrinfo[1].name="[�׷���Ʈ ������Ʈ] ��κ��� Ű��";		

		ssrinfo[2]=new Card();
		ssrinfo[2].type="cute";
		ssrinfo[2].name="[��Ī���Ϻ�] �ڽù��� ��ġ�� ";	

		ssrinfo[3]=new Card();
		ssrinfo[3].type="cute";
		ssrinfo[3].name="[�� ���� ��Ʈ] ���� ���� ";	

		ssrinfo[4]=new Card();
		ssrinfo[4].type="cute";
		ssrinfo[4].name="[Ĺ ��Ƽ] ����ī�� ����";

		ssrinfo[5]=new Card();
		ssrinfo[5].type="cute";
		ssrinfo[5].name="[������ �ձ�] ��Ÿ�� ����";		

		ssrinfo[6]=new Card();
		ssrinfo[6].type="cute";
		ssrinfo[6].name="[�������� ���� ����] �ø����� ����Ű";

		ssrinfo[7]=new Card();
		ssrinfo[7].type="cool";
		ssrinfo[7].name="[������ �Ѷ�] ȣ�� ī�� ";

		ssrinfo[8]=new Card();
		ssrinfo[8].type="cool";
		ssrinfo[8].name="[���� �� ���κ���] ī�̾� ���� ";

		ssrinfo[9]=new Card();
		ssrinfo[9].type="cool";
		ssrinfo[9].name="[���鸮�� ����Ʈ] �Ͼ߹� ī���� ";

		ssrinfo[10]=new Card();
		ssrinfo[10].type="cool";
		ssrinfo[10].name="[�����Ʈ �޸���] ����� �Ĺ�ī ";

		ssrinfo[11]=new Card();
		ssrinfo[11].type="cool";
		ssrinfo[11].name="[��� ��ʽ�] ��Ÿ �̳��� ";

		ssrinfo[12]=new Card();
		ssrinfo[12].type="cool";
		ssrinfo[12].name="[����� ����] ĭ��Ű ����";

		ssrinfo[13]=new Card();
		ssrinfo[13].type="cool";
		ssrinfo[13].name="[�������� ���� ����] �úξ� ��";

		ssrinfo[14]=new Card();
		ssrinfo[14].type="passion";
		ssrinfo[14].name="[�Ž����ں�������] ȣ�� ����";

		ssrinfo[15]=new Card();
		ssrinfo[15].type="passion";
		ssrinfo[15].name="[������ ����� �ູ] Ÿī�� ������";

		ssrinfo[16]=new Card();
		ssrinfo[16].type="passion";
		ssrinfo[16].name="[Ǯ�����ٿ�] ����ī�� ��Ű";		

		ssrinfo[17]=new Card();
		ssrinfo[17].type="passion";
		ssrinfo[17].name="[ģ���� �ܶ�] ��ġ�϶� �ϳ�";		

		ssrinfo[18]=new Card();
		ssrinfo[18].type="passion";
		ssrinfo[18].name="[�������� ���� ����] ȥ�� �̿�";

		ssrinfo[19]=new Card();
		ssrinfo[19].type="passion";
		ssrinfo[19].name="[Ű���ڡ��۷��̵�] �Ұ���Ű ��ī";			

		ssrinfo[20]=new Card();
		ssrinfo[20].type="cute";
		ssrinfo[20].name="[���� �𳯸��� ����] �ڹپ�ī�� �翡";
		//
		
		ssrinfo[21]=new Card();
		ssrinfo[21].type="cool";
		ssrinfo[21].name="[������� �����׸�Ʈ] �ϳ�̾� �ƽ�ī ";
		
		ssrinfo[22]=new Card();
		ssrinfo[22].type="passion";
		ssrinfo[22].name="[�޲ٴ� ��������] ŰŸ ������";
		
		ssrinfo[23]=new Card();
		ssrinfo[23].type="cute";
		ssrinfo[23].name="[������ ��Ʈ] �̰���� ����";
		
		ssrinfo[24]=new Card();
		ssrinfo[24].type="cool";
		ssrinfo[24].name="[������ ��] �ö��ī �ڿ��";
		
		ssrinfo[25]=new Card();
		ssrinfo[25].type="cool";
		ssrinfo[25].name="[�ֺ� ���] �̾߸��� ��������ī";
		
		ssrinfo[26]=new Card();
		ssrinfo[26].type="passion";
		ssrinfo[26].name="[�ؽ��� �ε���] �丮Ÿ ��ó�";
		
		ssrinfo[27]=new Card();
		ssrinfo[27].type="passion";
		ssrinfo[27].name="[�߶� �Ϻ���Ʈ] ����ī�� ������ [1]";
		
		for(int i=0; i<super.SSRCardnumber; i++){
			ssrinfo[i].lev="SSR"; 
			ssrinfo[i].limited=false;
		}
		return ssrinfo[k];
	    
//	return ssrinfo[k];

	}}

/*
		case k:{
		ssrinfo[k].type="";
		ssrinfo[k].name="";
		return ssrinfo[k];		
		}
		
*/
