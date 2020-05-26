public class zd2 
{
    public static void main(String[] args) 
    {
        System.out.println(canMove("Rook", "A8", "H8"));
    }
    public static boolean canMove(String figure,String pos, String aim){
        char pL = pos.charAt(0);
        int pN = Integer.parseInt(String.valueOf(pos.charAt(1)));
        char aL = aim.charAt(0);
        int aN = Integer.parseInt(String.valueOf(aim.charAt(1)));
        
        if (pL == aL && pN == aN) 
            return false;
        switch (figure){
            case "Pawn": 
            {     
                if (pL==aL && pN==2 && aN==4) return true;
                if (pL==aL && pN==(aN-1)) return true;
                return false;
            }
            case "Knight": 
            {  
                if ((Math.abs(pL-aL)==2 && Math.abs(pN-aN)==1)||(Math.abs(pL-aL)==1 && Math.abs(pN-aN)==2)) return true;
                return false;
            }
            case "Bishop": 
            {  
                if (Math.abs(pL-aL)==Math.abs(pN-aN))return true;
                return false;
            }
            case "Rook": 
            {    
                if ((pL==aL && pN!=aN) || (pL!=aL && pN==aN)) return true;
                return false;
            }
            case "Queen": 
            {    
                if ((pL==aL && pN!=aN) || (pL!=aL && pN==aN)) return true;
                if (Math.abs(pL-aL)==Math.abs(pN-aN))return true;
                break;
            }
            case "King": 
            {     
                if (Math.abs(pL-aL)<2 && Math.abs(pN-aN)<2) return true;
                return false;
            }
            default: return false;
        }
        return false;
    }
}