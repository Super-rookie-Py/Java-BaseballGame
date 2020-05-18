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
				System.out.println("아웃!");
			}
			else if(strike==4)
			{
				System.out.println("축하드립니다! 정답입니다.");
				break;
			}
			else
			{
				System.out.println(strike+"스트라이크 "+(ball-strike)+"볼");
			}
				
		}
	}
	public static int[] user = new int[4];
	private static void input_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 네 자리를 입력하세요.(공백으로 구분)");
		for(int i=0;i<4;i++)
		{
			user[i] = sc.nextInt();
		}
	}
	public static int[] num = new int[4];
	private static void settingGame() {
		// 0~9사이 4 개의 랜덤한 값을 정한다.
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
					{	//같은 값이 있는 경우 값을 바꾸고 b값을 올린다.
						num[k]=(int) (Math.random()*10);
						b = b + 1;
					}

				}
				
			}// c==b인경우는 랜덤으로 뽑은 모든 값이 다른 경우
			if(c==b)
			{
				break;
			}
		}
	}

}
