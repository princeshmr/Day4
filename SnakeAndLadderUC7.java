class SnakeAndLadderUC7 
{
	public static void main(String[] args) 
	{
		System.out.println("Single player start position 0");
		System.out.println("Welcome to the Snake and Ladder");		
                
                //constant

                final int IS_START=0;
		final int IS_NO_PLAY=0;
		final int IS_LADDER=1;
		final int IS_SNAKE=2;

		int first_Player_Position=0;
		int second_Player_Position=0;
                int first_Dice_Count=0;
		int second_Dice_Count=0;

                while(first_Player_Position <=100 && second_Player_Position<=100)
		  {
				 
                            int first_Player_Status=(int)(Math.random()*100)%3;
			    int dieValue=(int)((Math.random()*100)%6)+1;
			    first_Dice_Count++;

                           //System.out.println("First_Player_status "+first_Player_Status);

			    switch (first_Player_Status)
			    {
				  case IS_NO_PLAY:
					      first_Player_Position += 0;
					      break;
				  case IS_LADDER:
					      first_Player_Position +=dieValue;
				              if (first_Player_Position>100)
				              {
						     first_Player_Position -=dieValue;
				              }
				              while (first_Player_Status==1)
				              {
						     first_Player_Status =(int)(Math.random()*100)%3;
						     if (first_Player_Status==1)
						     {
							  dieValue=(int)((Math.random()*100)%6)+1;
							  first_Player_Position +=dieValue;
							  first_Dice_Count++;
							  if (first_Player_Position>100)
							  {
								  first_Player_Position -=dieValue;
							  }
							  if (first_Player_Position==100)
							  {
								  break;
							  }

						     }
						     else if(first_Player_Status==2)
						     {
							  dieValue=(int)((Math.random()*100)%6)+1;
							  first_Player_Position -=dieValue;
							  first_Dice_Count++;
                                                          break;
						     }

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
				 System.out.println("First player dice count is "+first_Dice_Count);
				 break;
			 }
			 if (first_Player_Position>100)
			 {
				 first_Player_Position -=dieValue;
				 System.out.println("First player position is "+first_Player_Position);
			 }

                       //second player status

			int second_Player_Status=(int)(Math.random()*100)%3;
			int die2Value=(int)((Math.random()*100)%6)+1;
			second_Dice_Count++;
		      //System.out.println("Second_Player_status "+second_Player_Status);

			switch (second_Player_Status)
			{
				 case IS_NO_PLAY:
					        second_Player_Position +=0;
				                break;
				 case IS_LADDER:
                                                second_Player_Position +=die2Value;
                                                if (second_Player_Status>100)
                                                {
						      second_Player_Status -=die2Value;
                                                }
				                while (second_Player_Status==1)
				                {
                                                       second_Player_Status=(int)(Math.random()*100)%3;
						       if (second_Player_Status==1)
						       {
							      dieValue=(int)((Math.random()*100)%6)+1;
							      second_Player_Position +=die2Value;
							      second_Dice_Count++;
							      if (second_Player_Position>100)
							      {
								      second_Player_Position -=die2Value;
							      }
							      if (second_Player_Position==100)
							      {
								      break;
							      }
						       }
						       else if (second_Player_Status==2)
						       {
						              dieValue=(int)((Math.random()*100)%6)+1;
							      second_Player_Position -=die2Value;
							      second_Dice_Count++;
                                                              break;
						       }
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
				 System.out.println("Second player of dice count is "+second_Dice_Count);
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




