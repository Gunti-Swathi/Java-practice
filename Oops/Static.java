public class Static {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setschool("chaitanya");
        System.out.print(s1.getschool());
        Students s2 = new Students();
        //  the change in school name reflects here also as it is static variable;
        System.out.print(s2.getschool());

        
    }
    
}
class Students{
    int rollno;
    static String school;
    // we can create static method also
    // Static int marks(int a,int b,int c){
    //     return(a+b+c/3);
    // }
    void setrollno(int num){
        this.rollno=num;
    }
    int getroll(){
        return this.rollno;
    }
    void setschool(String skl){
        this.school=skl;
    }
    String getschool(){
        return this.school;
    }
}
