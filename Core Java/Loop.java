class Loop {
    public static void main(String[] args) {
        // WHILE

        int i = 1;

        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }

        System.out.println("Bye " + i);

        // DO WHILE
        int k = 1;
        do {
            System.out.println("Hi " + k);
            k++;
        } while (k <= 4);


        // FOR
        for(int l=5;l>0;l--){
            System.out.println("Yo "+l);
        }
        
    } 
}
