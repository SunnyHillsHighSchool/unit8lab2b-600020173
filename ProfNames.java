public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int c = 0;
    int l = lastName.length();
    for(int a = 0; a < nameArray.length; a++){
      for(int b = 0; b < nameArray[a].length; b++){
        if(nameArray[a][b].substring(0,l).equals(lastName)){
          c++;
        }
      }
    }
    return c;
  }
}