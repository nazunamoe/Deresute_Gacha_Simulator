package Database;
public class SSRCard extends Card {
	Card[] info = new Card [super.SSRCardnumber];
	public Card[] inforeturn(){
		return info;
	}
	public Card info(int k){

		info[0]=new Card();
		info[0].settype("cute");
		info[0].setname("[�̽�ƽ ������] ��ġ�뼼 ��Ű ");

		info[1]=new Card();
		info[1].settype("passion");
		info[1].setname("[�׷���Ʈ ������Ʈ] ��κ��� Ű��");		

		info[2]=new Card();
		info[2].settype("cute");
		info[2].setname("[��Ī���Ϻ�] �ڽù��� ��ġ�� ");	

		info[3]=new Card();
		info[3].settype("cute");
		info[3].setname("[�� ���� ��Ʈ] ���� ���� ");	

		info[4]=new Card();
		info[4].settype("cute");
		info[4].setname("[Ĺ ��Ƽ] ����ī�� ����");

		info[5]=new Card();
		info[5].settype("cute");
		info[5].setname("[������ �ձ�] ��Ÿ�� ����");		

		info[6]=new Card();
		info[6].settype("cute");
		info[6].setname("[�������� ���� ����] �ø����� ����Ű");

		info[7]=new Card();
		info[7].settype("cool");
		info[7].setname("[������ �Ѷ�] ȣ�� ī�� ");

		info[8]=new Card();
		info[8].settype("cool");
		info[8].setname("[���� �� ���κ���] ī�̾� ���� ");

		info[9]=new Card();
		info[9].settype("cool");
		info[9].setname("[���鸮�� ����Ʈ] �Ͼ߹� ī���� ");

		info[10]=new Card();
		info[10].settype("cool");
		info[10].setname("[�����Ʈ �޸���] ����� �Ĺ�ī ");

		info[11]=new Card();
		info[11].settype("cool");
		info[11].setname("[��� ��ʽ�] ��Ÿ �̳��� ");

		info[12]=new Card();
		info[12].settype("cool");
		info[12].setname("[����� ����] ĭ��Ű ����");

		info[13]=new Card();
		info[13].settype("cool");
		info[13].setname("[�������� ���� ����] �úξ� ��");

		info[14]=new Card();
		info[14].settype("passion");
		info[14].setname("[�Ž����ں�������] ȣ�� ����");

		info[15]=new Card();
		info[15].settype("passion");
		info[15].setname("[������ ����� �ູ] Ÿī�� ������");

		info[16]=new Card();
		info[16].settype("passion");
		info[16].setname("[Ǯ�����ٿ�] ����ī�� ��Ű");		

		info[17]=new Card();
		info[17].settype("passion");
		info[17].setname("[ģ���� �ܶ�] ��ġ�϶� �ϳ�");		

		info[18]=new Card();
		info[18].settype("passion");
		info[18].setname("[�������� ���� ����] ȥ�� �̿�");

		info[19]=new Card();
		info[19].settype("passion");
		info[19].setname("[Ű���ڡ��۷��̵�] �Ұ���Ű ��ī");			

		info[20]=new Card();
		info[20].settype("cute");
		info[20].setname("[���� �𳯸��� ����] �ڹپ�ī�� �翡");
		//
		
		info[21]=new Card();
		info[21].settype("cool");
		info[21].setname("[������� �����׸�Ʈ] �ϳ�̾� �ƽ�ī ");
		
		info[22]=new Card();
		info[22].settype("passion");
		info[22].setname("[�޲ٴ� ��������] ŰŸ ������");
		
		info[23]=new Card();
		info[23].settype("cute");
		info[23].setname("[������ ��Ʈ] �̰���� ����");
		
		info[24]=new Card();
		info[24].settype("cool");
		info[24].setname("[������ ��] �ö��ī �ڿ��");
		
		info[25]=new Card();
		info[25].settype("cool");
		info[25].setname("[�ֺ� ���] �̾߸��� ��������ī");
		
		info[26]=new Card();
		info[26].settype("passion");
		info[26].setname("[�ؽ��� �ε���] �丮Ÿ ��ó�");
		
		info[27]=new Card();
		info[27].settype("passion");
		info[27].setname("[�߶� �Ϻ���Ʈ] ����ī�� ������");
		
		for(int i=0; i<super.SSRCardnumber; i++){
			info[i].setlev("SSR");
			info[i].setlimited(false);
		}
		return info[k];
	    
//	return info[k];

	}}

/*
		case k:{
		info[k].settype("");
		info[k].setname("");
		return info[k];		
		}
		
*/
