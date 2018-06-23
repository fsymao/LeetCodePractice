// class Solution {
//     public int[] plusOne(int[] digits) {
//     String number="";
//     for (int i=0;i<digits.length;i++)
//     {
//         number+=String.valueOf(digits[i]);
//     }
//     char[] temp= String.valueOf(Integer.parseInt(number)+1).toCharArray();
//     int[] result= new int[temp.length];
//     for (int i=0;i<temp.length;i++)
//         {
//             result[i]=Character.getNumericValue(temp[i]);
//         }
//       return result;
//     }
// }


class Solution {
    public int[] plusOne(int[] digits) {

    for (int i=digits.length-1;i>-1;i--)
    {
        if (digits[i]<9){
            digits[i]+=1;
            return digits;
        }
        else
        {
            digits[i]=0;
        }
    }
    int[] results= new int[digits.length+1];
    Arrays.fill(results,0);
    results[0]=1;
    return results;


    }
}
