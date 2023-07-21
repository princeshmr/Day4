class SnakeAndLadderUC5 
{
	public static void main(String[] args) 
	{
		System.out.println("Single player start position 0");
		System.out.println("Welcome to the Snake and Ladder");
       
                //constant variable

                final int IS_START=0;
		final int IS_NO_PLAY=0;
		final int IS_LADDER=1;
		final int IS_SNAKE=2;

		int first_Player_Position=0;
		int second_Player_Position=0;
        
                while(first_Player_Position <=100 && second_Player_Position<=100)
		{

                       //check First Player Status

		       int first_Player_Status=(int)(Math.random()*100)%3;
                       int dieValue=(int)((Math.random()*100)%6)+1;
                       //System.out.println("First_Player_status "+firstPlayerStatus);

		       switch (first_Player_Status)
			{
			      case IS_NO_PLAY:
					  first_Player_Position += 0;
					  break;
			      case IS_LADDER:
					  first_Player_Position +=dieValue;
				          if (first_Player_Position>100)
				          {
						  first_Player_Position +=0;
				          }
					  break;
			      default:
				     first_Player_Position -=dieValue;
				     break;
			}
			System.out.println("First player position is "+first_Player_Position);

			if (first_Player_Position<0)
		        {
			      first_Player_Position=IS_START;
			      System.out.println("First player position is "+first_Player_Position);
			}
			if (first_Player_Position==100)
			{
			      System.out.println("First player win this game "+first_Player_Position);
			      break;
			}
			if (first_Player_Position>100)
			{
			      first_Player_Position -=dieValue;
			      System.out.println("First player position is "+first_Player_Position);
			}
                 
                         //check Second Player Status
                        
		        int second_Player_Status=(int)(Math.random()*100)%3;
                        int die2Value=(int)((Math.random()*100)%6)+1;
			//System.out.println("Second_Player_status "+secondPlayerStatus);

			switch (second_Player_Status)
			{
			       case IS_NO_PLAY:
					      second_Player_Position +=0;
				              break;
			       case IS_LADDER:
                                              second_Player_Position +=die2Value;
                                              if (second_Player_Position>100)
                                              {
                                                  second_Player_Position +=0;
                                              }
				              break;
                               default:
				      second_Player_Position -=die2Value;
				      break;

			 }
			 System.out.println("Second player position is "+second_Player_Position);

			 if (second_Player_Position<0)
			 {
				second_Player_Position=IS_START;
			        System.out.println("Second player position is "+second_Player_Position);
			 }
			 if (second_Player_Position==100)
			 {
			        System.out.println("Second Player win this game "+second_Player_Position);
				break;
			 }
                         if (second_Player_Position>100)
                         {
				second_Player_Position -=die2Value;
				System.out.println("Second Player position is "+second_Player_Position);
                         }
		  
		  
		  
		  }
	}
}


