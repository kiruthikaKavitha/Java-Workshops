public class sum {
    public static void main(String[]args){
        int sums=0;
        int[] marks = {90, 80, 70, 60, 50};
    for (int mark : marks) {
        sums+=mark;
        
        System.out.println(mark);
    }
        System.out.println("total marks:"+sums);
}
}

