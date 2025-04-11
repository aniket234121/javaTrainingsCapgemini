package BasicStringMethods;

public class DetectiveBakshi {

    public static void check(String str,String strVals)
    {
        String[] words=strVals.split(":");

        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()==str.length())
            {
                for(int j=0;j<str.length();j++)
                {   if(str.charAt(j)==words[i].charAt(j) &&j==str.length()-1)
                    {
                        System.out.println(words[i]);
                    }
                    if(str.charAt(j)==words[i].charAt(j) || str.charAt(j)=='_')
                    { continue;}

                    else {
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        check("fi_er","filer:fixer:Filer:fiber:fibre:finder:figre:fitre");
    }
}
