class Prime{
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=Integer.parseInt(args[i+1]);
        }
        for(int i=0;i<n;i++){
            boolean x=checkPrime(numbers[i]);
            System.out.println(x);
        }
    }
    private static boolean checkPrime(int num){
        if(num<2)return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        return true;
    }
}
