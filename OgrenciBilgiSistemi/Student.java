package OgrenciBilgiSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkQuizNote(int matQuiz, int fizikQuiz, int kimyaQuiz) {


        if (matQuiz >= 0 && matQuiz <= 100) {
            this.mat.quiz = matQuiz;
        }

        if (fizikQuiz >= 0 && fizikQuiz <= 100) {
            this.fizik.quiz = fizikQuiz;
        }

        if (kimyaQuiz >= 0 && kimyaQuiz <= 100) {
            this.kimya.quiz = kimyaQuiz;
        }
    }

    public void isPass() {
        if (this.mat.note == -1 || this.fizik.note == -1 || this.kimya.note == -1
                || this.mat.quiz == -1 || this.fizik.quiz == -1 || this.kimya.quiz == -1) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.80 + this.fizik.quiz * 0.20)
                + (this.mat.note * 0.80 + this.mat.quiz * 0.20)
                + (this.kimya.note * 0.80 + this.kimya.quiz * 0.20)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınavı : " + this.mat.note +  "  Matematik Sözlü:  " + this.mat.quiz+   " Not: " + (this.mat.note * 0.80 + this.mat.quiz * 0.20));
        System.out.println("Fizik Sınavı     : " + this.fizik.note +"  Fizik Sözlü    :  " + this.fizik.quiz+" Not: " + (this.fizik.note * 0.80 + this.fizik.quiz * 0.20));
        System.out.println("Kimya Sınavı     : " + this.kimya.note +"  Kimya Sözlü    :  " + this.kimya.quiz+" Not: " + (this.kimya.note * 0.80 + this.kimya.quiz * 0.20));
    }
}
