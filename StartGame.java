import java.util.Scanner;
public class StartGame {
	public static void main(String[] args) {
		
		int a = 1;
		settingGame();
		
		while(a==1) 
		{
			int strike = 0;
			int ball = 0;
			input_data();
			for(int i=0;i<4;i++)
			{
				if(num[i]==user[i])
				{
					strike = strike+1;
				}
			}
			for(int i =0;i<4;i++)
			{
				for(int j = 0; j<4;j++)
				{
					if(num[i]==user[j])
					{
						ball=ball+1;
					}
				}
			}
			if(ball ==0)
			{
				System.out.println("�ƿ�!");
			}
			else if(strike==4)
			{
				System.out.println("���ϵ帳�ϴ�! �����Դϴ�.");
				break;
			}
			else
			{
				System.out.println(strike+"��Ʈ����ũ "+(ball-strike)+"��");
			}
				
		}
	}
	public static int[] user = new int[4];
	private static void input_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� �ڸ��� �Է��ϼ���.(�������� ����)");
		for(int i=0;i<4;i++)
		{
			user[i] = sc.nextInt();
		}
	}
	public static int[] num = new int[4];
	private static void settingGame() {
		// 0~9���� 4 ���� ������ ���� ���Ѵ�.
		int c=0 , b=1;
		for(int i=0;i<4;i++)
		{
			num[i]=(int) (Math.random()*10);
		}
		for(;;)
		{
			c = b;
			for(int j=0;j<3;j++)
			{
				for(int k=j+1;k<4;k++)
				{
					if(num[j]==num[k])
					{	//���� ���� �ִ� ��� ���� �ٲٰ� b���� �ø���.
						num[k]=(int) (Math.random()*10);
						b = b + 1;
					}

				}
				
			}// c==b�ΰ��� �������� ���� ��� ���� �ٸ� ���
			if(c==b)
			{
				break;
			}
		}
	}

}
