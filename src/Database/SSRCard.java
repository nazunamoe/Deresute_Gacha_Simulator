package Database;
public class SSRCard extends Card {
	Card[] ssrinfo = new Card [super.SSRCardnumber];
	public Card[] ssrinforeturn(){
		return ssrinfo;
	}
	public Card ssrinfo(int k){
		

		ssrinfo[0]=new Card();
		ssrinfo[0].settype("cute");
		ssrinfo[0].setname("[�̽�ƽ ������] ��ġ�뼼 ��Ű ");

		ssrinfo[1]=new Card();
		ssrinfo[1].settype("passion");
		ssrinfo[1].setname("[�׷���Ʈ ������Ʈ] ��κ��� Ű��");		

		ssrinfo[2]=new Card();
		ssrinfo[2].settype("cute");
		ssrinfo[2].setname("[��Ī���Ϻ�] �ڽù��� ��ġ�� ");	

		ssrinfo[3]=new Card();
		ssrinfo[3].settype("cute");
		ssrinfo[3].setname("[�� ���� ��Ʈ] ���� ���� ");	

		ssrinfo[4]=new Card();
		ssrinfo[4].settype("cute");
		ssrinfo[4].setname("[Ĺ ��Ƽ] ����ī�� ����");

		ssrinfo[5]=new Card();
		ssrinfo[5].settype("cute");
		ssrinfo[5].setname("[������ �ձ�] ��Ÿ�� ����");		

		ssrinfo[6]=new Card();
		ssrinfo[6].settype("cute");
		ssrinfo[6].setname("[�������� ���� ����] �ø����� ����Ű");

		ssrinfo[7]=new Card();
		ssrinfo[7].settype("cool");
		ssrinfo[7].setname("[������ �Ѷ�] ȣ�� ī�� ");

		ssrinfo[8]=new Card();
		ssrinfo[8].settype("cool");
		ssrinfo[8].setname("[���� �� ���κ���] ī�̾� ���� ");

		ssrinfo[9]=new Card();
		ssrinfo[9].settype("cool");
		ssrinfo[9].setname("[���鸮�� ����Ʈ] �Ͼ߹� ī���� ");

		ssrinfo[10]=new Card();
		ssrinfo[10].settype("cool");
		ssrinfo[10].setname("[�����Ʈ �޸���] ����� �Ĺ�ī ");

		ssrinfo[11]=new Card();
		ssrinfo[11].settype("cool");
		ssrinfo[11].setname("[��� ��ʽ�] ��Ÿ �̳��� ");

		ssrinfo[12]=new Card();
		ssrinfo[12].settype("cool");
		ssrinfo[12].setname("[����� ����] ĭ��Ű ����");

		ssrinfo[13]=new Card();
		ssrinfo[13].settype("cool");
		ssrinfo[13].setname("[�������� ���� ����] �úξ� ��");

		ssrinfo[14]=new Card();
		ssrinfo[14].settype("passion");
		ssrinfo[14].setname("[�Ž����ں�������] ȣ�� ����");

		ssrinfo[15]=new Card();
		ssrinfo[15].settype("passion");
		ssrinfo[15].setname("[������ ����� �ູ] Ÿī�� ������");

		ssrinfo[16]=new Card();
		ssrinfo[16].settype("passion");
		ssrinfo[16].setname("[Ǯ�����ٿ�] ����ī�� ��Ű");		

		ssrinfo[17]=new Card();
		ssrinfo[17].settype("passion");
		ssrinfo[17].setname("[ģ���� �ܶ�] ��ġ�϶� �ϳ�");		

		ssrinfo[18]=new Card();
		ssrinfo[18].settype("passion");
		ssrinfo[18].setname("[�������� ���� ����] ȥ�� �̿�");

		ssrinfo[19]=new Card();
		ssrinfo[19].settype("passion");
		ssrinfo[19].setname("[Ű���ڡ��۷��̵�] �Ұ���Ű ��ī");			

		ssrinfo[20]=new Card();
		ssrinfo[20].settype("cute");
		ssrinfo[20].setname("[���� �𳯸��� ����] �ڹپ�ī�� �翡");
		//
		
		ssrinfo[21]=new Card();
		ssrinfo[21].settype("cool");
		ssrinfo[21].setname("[������� �����׸�Ʈ] �ϳ�̾� �ƽ�ī ");
		
		ssrinfo[22]=new Card();
		ssrinfo[22].settype("passion");
		ssrinfo[22].setname("[�޲ٴ� ��������] ŰŸ ������");
		
		ssrinfo[23]=new Card();
		ssrinfo[23].settype("cute");
		ssrinfo[23].setname("[������ ��Ʈ] �̰���� ����");
		
		ssrinfo[24]=new Card();
		ssrinfo[24].settype("cool");
		ssrinfo[24].setname("[������ ��] �ö��ī �ڿ��");
		
		ssrinfo[25]=new Card();
		ssrinfo[25].settype("cool");
		ssrinfo[25].setname("[�ֺ� ���] �̾߸��� ��������ī");
		
		ssrinfo[26]=new Card();
		ssrinfo[26].settype("passion");
		ssrinfo[26].setname("[�ؽ��� �ε���] �丮Ÿ ��ó�");
		
		ssrinfo[27]=new Card();
		ssrinfo[27].settype("passion");
		ssrinfo[27].setname("[�߶� �Ϻ���Ʈ] ����ī�� ������");
		
		for(int i=0; i<super.SSRCardnumber; i++){
			ssrinfo[i].setlev("SSR");
			ssrinfo[i].setlimited(false);
		}
		return ssrinfo[k];
	    
//	return ssrinfo[k];

	}}

/*
		case k:{
		ssrinfo[k].settype("");
		ssrinfo[k].setname("");
		return ssrinfo[k];		
		}
		
*/
