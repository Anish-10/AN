
public class SwitchCase 
{
	public static void main(String args[])
	{
		int day;
		day = 3;
        
        switch(day)
        {
        	case 1:
        		System.out.println("Sunday");
        		break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
                break;
        }
        
        if(day==1)
        {
        	System.out.println("Sunday");
        }
        if (day==2)
        {
        	System.out.println("Monday");
        }
        if (day==3)
        {
        	System.out.println("Tuesday");
        }
        if (day==4)
        {
        	System.out.println("Wednesday");
        }
        if (day==5)
        {
        	System.out.println("Thursday");
        }
        if (day==6)
        {
        	System.out.println("Friday");
        }
        if(day==7)
        {
        	System.out.println("Saturday");
        }
	}
}
