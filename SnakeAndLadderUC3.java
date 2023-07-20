class SnakeAndLadderUC3 
{
	public static void main(String[] args) 
	{
		System.out.println("Single player start position 0");
		System.out.println("Welcome to the Snake and Ladder");

                final int start=0;
		final int IS_NO_PLAY=0;
		final int IS_LADDER=1;
		final int IS_SNAKE=2;
		int first_Player_Position=0;
		int second_Player_Position=0;
                
               //check the first player status

                int firstPlayerStatus=(int)(Math.random()*100)%3;
                int dieValue=(int)((Math.random()*100)%6)+1;
		 switch (firstPlayerStatus)
		 {
		 case IS_NO_PLAY:
			  first_Player_Position += 0;
		          break;
		 case IS_LADDER:
			  first_Player_Position +=dieValue;
		          break;
		 default:
			  first_Player_Position -=dieValue;
		          break;
		 }
		 System.out.println("First player position is "+first_Player_Position);

	}
}
