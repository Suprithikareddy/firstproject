import java.util.Scanner;
//  import java.text.ParseException;

class mainproj1{
      public static void main(String[] args) {
           System.out.println("enter a option");
           System.out.println("1.age");
           System.out.println("2.DOB");
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           switch(a){
            case 1:
            age();
            break;
            case 2:
            dob();
            break;
            default:
            System.out.println("enter a correct option");
            break;
           }
           sc.close();

        }
        static void age(){
            // Scanner sc=new Scanner(System.in);
            input i=new input();
            System.out.println("enter a param");
            String param=i.parametersString();
            System.out.println("enter current day or reference day");
            String day=i.dayString();
            // day d=new day();
             System.out.println("enter day format");
             String format=i.getFormat();
             System.out.println("enter a delimeter character");
             String dlc=i.getDlc();
            String param1=param.substring(4,param.length());
            String regex="\\"+dlc;
            String inp1[]=param1.split(regex);
            String inp2[]=day.split(regex);
           String uprFormat= format.toUpperCase();
            if(uprFormat.equals("DD"+dlc+"MM"+dlc+"YYYY"))
            {
                    int dat1=Integer.parseInt(inp1[0]);
                    int mon1=Integer.parseInt(inp1[1]);
                    int year1=Integer.parseInt(inp1[2]);
                    int dat2=Integer.parseInt(inp2[0]);
                    int mon2=Integer.parseInt(inp2[1]);
                    int year2=Integer.parseInt(inp2[2]);
                    
                    if(isValidday(dat1,mon1,year1)&&isValidday(dat2, mon2, year2))
                    {
                        int resdays=dat2-dat1;
                        int resmon=mon2-mon1;
                        int resyear=year2-year1;
                        System.out.println("age is:"+resyear+" years "+resmon+" months "+resdays+" days ");
                    }
                    else{
                        System.out.println("enter a valid day");
                    }
                    

            }
           else if(uprFormat.equals("YYYY"+dlc+"MM"+dlc+"DD"))
            {
                    int dat1=Integer.parseInt(inp1[2]);
                    int mon1=Integer.parseInt(inp1[1]);
                    int year1=Integer.parseInt(inp1[0]);
                    int dat2=Integer.parseInt(inp2[2]);
                    int mon2=Integer.parseInt(inp2[1]);
                    int year2=Integer.parseInt(inp2[0]);
                    
                    if(isValidday(dat1,mon1,year1)&&isValidday(dat2, mon2, year2))
                    {
                        int resdays=dat2-dat1;
                        int resmon=mon2-mon1;
                        int resyear=year2-year1;
                        System.out.println("age is:"+resyear+" years "+resmon+" months "+resdays+" days ");
                    }
                    else{
                        System.out.println("enter a valid day");
                    }
                }
                else if(uprFormat.equals("MM"+dlc+"DD"+dlc+"YYYY"))
                {
                        int dat1=Integer.parseInt(inp1[1]);
                        int mon1=Integer.parseInt(inp1[0]);
                        int year1=Integer.parseInt(inp1[2]);
                        int dat2=Integer.parseInt(inp2[1]);
                        int mon2=Integer.parseInt(inp2[0]);
                        int year2=Integer.parseInt(inp2[2]);
                        if(isValidday(dat1,mon1,year1)&&isValidday(dat2, mon2, year2))
                        {
                            int resdays=dat2-dat1;
                            int resmon=mon2-mon1;
                            int resyear=year2-year1;
                            System.out.println("age is:"+resyear+" years "+resmon+" months "+resdays+" days ");
                        }
                        else{
                            System.out.println("enter a valid day");
                        }
                    }
                
        }   
        static int MAX_VALID_YR = 9999; 
        static int MIN_VALID_YR = 1800; 
      
        // Returns true if  
        // given year is valid. 
        static boolean isLeap(int year) 
        { 
            // Return true if year is  
            // a multiple of 4 and not  
            // multiple of 100. 
            // OR year is multiple of 400. 
            return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
        } 
      
        // Returns true if given  
        // year is valid or not. 
        static boolean isValidday(int d,int m,int y) 
        { 
            // If year, month and day  
            // are not in given range 
            if (y > MAX_VALID_YR ||  
                y < MIN_VALID_YR) 
                return false; 
            if (m < 1 || m > 12) 
                return false; 
            if (d < 1 || d > 31) 
                return false; 
      
            // Handle February month 
            // with leap year 
            if (m == 2)  
            { 
                if (isLeap(y)) 
                    return (d <= 29); 
                else
                    return (d <= 28); 
            } 
      
            // Months of April, June,  
            // Sept and Nov must have  
            // number of days less than 
            // or equal to 30. 
            if (m == 4 || m == 6 ||m == 9 || m == 11) 
                return (d <= 30); 
      
            return true; 
        }
        static void dob(){
            //Scanner sc=new Scanner(System.in);
            input i=new input();
            System.out.println("enter a param");
            String param=i.parametersString();
            System.out.println("enter current day or reference day");
            String day=i.dayString();
            // day d=new day();
             System.out.println("enter date format");
             String format=i.getFormat();
             System.out.println("enter a delimeter character");
             String dlc=i.getDlc();
            String param1=param.substring(4,param.length());
            String regex="\\"+dlc;
            String lwrFormat= format.toUpperCase();
            String inp1[]=param1.split(regex);
            String inp2[]=day.split(regex);
             if(lwrFormat.equals("DD"+dlc+"MM"+dlc+"YYYY"))
                {   
                    int dat1=Integer.parseInt(inp1[0]);
                    int mon1=Integer.parseInt(inp1[1]);
                    int year1=Integer.parseInt(inp1[2]);
                    int dat2=Integer.parseInt(inp2[0]);
                    int mon2=Integer.parseInt(inp2[1]);
                    int year2=Integer.parseInt(inp2[2]);
                    
                    if(isValidday(dat2, mon2, year2))
                    {
                        int resdays=dat2-dat1;
                        int resmon=mon2-mon1;
                        int resyear=year2-year1;
                        if(resdays==0||resmon==0)
                        System.out.println("dob is:"+dat2+dlc+(mon2+1)+dlc+resyear);
                        else{
                            System.out.println("dob is:"+resdays+dlc+resmon+dlc+resyear);
                        }
                    }
                    else{
                        System.out.println("enter a correct day");
                    }
                }
            }
        public  static class input {
            public Scanner sc=new Scanner(System.in);
          public String  parametersString(){
                String paraString=sc.nextLine();
                return paraString;
          }
                public String dayString(){
                    String dat=sc.nextLine();
                    return  dat;
                }
                public String  getFormat(){
                    String format=sc.nextLine();
                    return format;
            }
            public String  getDlc(){
                String dlc=sc.nextLine();
                return dlc;
            }
        }
    }