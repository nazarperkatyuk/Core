public class ModelsPhone  {
    @MyAnnotatoin("Name jf Phone")
    String nameOfPhone;
    @MyAnnotatoin("Where Phone ")
    int age;
    String  os;

    public ModelsPhone(String nameOfPhone, int age, String os) {
        this.nameOfPhone = nameOfPhone;
        this.age = age;
        this.os = os;
    }
}
