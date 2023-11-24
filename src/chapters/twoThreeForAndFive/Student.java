package chapters.twoThreeForAndFive;

public class Student {
    private String name;
    private double note;

    public Student(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public void getLetterGrade() {
        if(note >= 90) {
            System.out.println("A");
        } else if(note >= 80) { // Já sei que a condição acima foi false, logo a nota é menor que 90
            System.out.println("B");
        } else if(note >= 70) { // Já sei que a condição acima foi false, logo a nota é menor que 80
            System.out.println("C");
        } else if(note >= 60) { // Já sei que a condição acima foi false, logo a nota é menor que 70
            System.out.println("D");
        } else { // Já sei que as condições acima foram false, logo a nota é menor que 90, 80, 70 e 60
            System.out.println("F");
        }

        /*
         * if(note >= 90) {
         *             System.out.println("A");
         *         } else {
         *             if(note >= 80) {
         *                 System.out.println("B");
         *             } else {
         *                 if(note >= 70) {
         *                     System.out.println("C");
         *                 } else {
         *                     if(note >= 60) {
         *                         System.out.println("D");
         *                     } else {
         *                         System.out.println("F");
         *                     }
         *                 }
         *             }
         *         }
         */
    }
}
