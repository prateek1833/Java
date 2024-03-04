public class LastOccurance {
        public static int LO1(int a[],int n,int i){ //To check the last occurance of any number in array
            if(i==0){
                return -1;
            }
            if(a[i]==n){
                return i;
            }
            return LO1(a,n,i-1);
            
    
        }
        public static int LO2(int a[],int n,int i){ //To check the last occurance of any number in array (Alternate)
            if(i==a.length){
                return -1;
            }
            int isfound=LO2(a,n,i+1);
            if(isfound==-1 && a[i]==n){
                return i;
            }
            return isfound;
            
    
        }
        public static void main(String[] args){
            int b[]={1,5,6,2,5,6};
            System.out.println(LO2(b,5,0));
        }
        
    } //Time complexity  O(n)
      

