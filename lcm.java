class lcm {
    public static void main(String[] args) {
        int a = 15;
        int b = 9;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int ans = max;
        while(ans%min!=0){
            ans += max;
        }
        System.out.print(ans);
    }
}