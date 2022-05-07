package test2_codegym.models;

public class Subject {
    private String subjectCode;
    private String name;
    private double version;
    private String level;
    private int studyTime;

    public Subject() {
    }

    public Subject(String subjectCode,
                   String name,
                   double version,
                   String level,
                   int studyTime) {
        this.subjectCode = subjectCode;
        this.name = name;
        this.version = version;
        this.level = level;
        this.studyTime = studyTime;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double isVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(int studyTime) {
        this.studyTime = studyTime;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", name='" + name + '\'' +
                ", version=" + version +
                ", level='" + level + '\'' +
                ", studyTime='" + studyTime + '\'' +
                '}';
    }
    public String toFile(){
        return subjectCode+","+
                name+","+
                version+","+
                level+","+
                studyTime;
    }
}
