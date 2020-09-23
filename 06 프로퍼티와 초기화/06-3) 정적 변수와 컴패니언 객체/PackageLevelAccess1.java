package chap06.section3;

public class PackageLevelAccess1 {
    public static void main(String[] args) {

        // PackageLevelFunctionKt.packageLevelFunc();
        PKLevel.packageLevelFunc(); //변경된 이름으로 접근가능
    }
}
