package test2_codegym.services.implement;


import test2_codegym.models.Subject;
import test2_codegym.services.SubjectService;
import test2_codegym.utils.ReadAndWrite;
import test2_codegym.utils.RegexInput;
import test_job.models.Job;

import java.util.ArrayList;
import java.util.List;

import static test2_codegym.controllers.DisplayMainMenu.scanner;
import static test2_codegym.utils.ReadAndWrite.SUBJECT_PATH;
import static test2_codegym.utils.ReadAndWrite.write;
import static test2_codegym.utils.RegexInput.returnSubjectCode;

public class SubjectImpl implements SubjectService {
        List<Subject> subjectList = getSubjectList();

    @Override
    public void display() {
        subjectList = getSubjectList();
        for (Subject subjects : subjectList){
            System.out.println(subjects.toString());
        }
    }

    @Override
    public void addNew() {
        Subject subject = new Subject();
        System.out.println("Enter subject code");
        subject.setSubjectCode(returnSubjectCode());
        System.out.println("Enter subject name");
        subject.setName(scanner.nextLine());
        System.out.println("Enter subject version");
        subject.setVersion(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter subject level");
        subject.setLevel(scanner.nextLine());
        System.out.println("Enter study time");
        subject.setStudyTime(Integer.parseInt(scanner.nextLine()));
        ReadAndWrite.write(SUBJECT_PATH,subject.toFile());
        System.out.println("Add new subject successful");
    }

    @Override
    public void edit() {
        display();
        subjectList = getSubjectList();
        boolean check = true;
            System.out.println("Enter subject code you want update");
        String subjectCode = returnSubjectCode();
            for (Subject subjects : subjectList){
                if (subjects.getSubjectCode().equals(subjectCode)){
                    check = false;
                    System.out.println("1. Update subject name\n" +
                            "2. Update version\n" +
                            "3. Update level\n" +
                            "4. Update study time\n" +
                            "5. Exit");
                    switch (RegexInput.returnOnlyNumber()){
                        case 1:
                            System.out.println("Enter new subject name");
                            subjects.setName(scanner.nextLine());
                            System.out.println("Update subject name successful");
                            break;
                        case 2:
                            System.out.println("Enter new version");
                            subjects.setVersion(Double.parseDouble(scanner.nextLine()));
                            System.out.println("Update version successful");
                            break;
                        case 3:
                            System.out.println("Enter new level");
                            subjects.setLevel(scanner.nextLine());
                            System.out.println("Update level successful");
                            break;
                        case 4:
                            System.out.println("Enter new study time");
                            subjects.setStudyTime(Integer.parseInt(scanner.nextLine()));
                            System.out.println("Update study time successful");
                            break;
                        case 5:
                            break;
                        default:
                            System.err.println("Number not on the menu");
                    }
                    ReadAndWrite.reWriteToFile(subjectList);
                    break;
                }
            }
            if (check){
                System.err.println("Subject code does not exist");
            }

    }

    @Override
    public void delete() {


    }

    public static List<Subject> getSubjectList(){
        List<Subject> subjects = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(SUBJECT_PATH);
        for (String[] lists : list){
            subjects.add(new Subject(lists[0],
                    lists[1],
                    Double.parseDouble(lists[2]),
                    lists[3],Integer.parseInt(lists[4])));
        }
        return subjects;
    }
}
