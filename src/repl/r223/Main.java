package repl.r223;

public class Main {
    public static void main(String[] args) {
        LawSchool ls=new LawSchool();
        System.out.println(ls.graduationRequirements());
    }

}
class EducationalInstitution{
    int duration;

    public EducationalInstitution(int duration) {
        this.duration = duration;
    }

    String graduationRequirements(){
        return duration+" years of study";
    }
}

class LawSchool extends EducationalInstitution{

    public LawSchool() {
        super(3);
    }

    @Override
    String graduationRequirements() {
        return super.graduationRequirements() +" and passing the bar";

    }
}
