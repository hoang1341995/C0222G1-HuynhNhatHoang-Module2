package test_job.services.implement;

import test_job.models.Job;
import test_job.services.JobService;
import test_job.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

import static test_job.controllers.DisplayMainMenu.scanner;
import static test_job.utils.ReadAndWrite.JOB_PATH;
import static test_job.utils.RegexInput.*;

public class JobImpl implements JobService {
    List<Job> jobList = getJobList();

    @Override
    public void displayByPriority() {
        jobList = getJobList();
        for (Job joblists : jobList) {
            System.out.println(joblists.toString());
        }
    }

    @Override
    public void displayByWeek() {
        jobList = getJobList();
        for (Job joblists : jobList) {
            System.out.println(joblists.toString());
        }
    }

    @Override
    public void addNew() {
        Job job = new Job();
        System.out.println("Enter day of week");
        job.setDayOfWeek(chooseDayOfWeek());
        System.out.println("Enter code job");
        job.setCodeJob(formatCodeJob());
        System.out.println("Enter name job");
        job.setName(scanner.nextLine());
        System.out.println("Enter priority");
        job.setPriority(choosePriority());
        System.out.println();
        ReadAndWrite.write(JOB_PATH, job.toFile());
        System.out.println("Add new job successful");
    }

    @Override
    public void update() {

    }
    public static List<Job> getJobList(){
        List<Job> jobs = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read(JOB_PATH);
        for (String[] lists : list){
            jobs.add(new Job(lists[0],
                    lists[1],
                    lists[2],
                    lists[3]));
        }
        return jobs;
    }

}
