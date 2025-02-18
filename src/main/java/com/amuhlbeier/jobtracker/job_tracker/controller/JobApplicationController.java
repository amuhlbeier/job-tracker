package com.amuhlbeier.jobtracker.job_tracker.controller;

import com.amuhlbeier.jobtracker.job_tracker.JobApplication;
import com.amuhlbeier.jobtracker.job_tracker.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/job-applications")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationService.getAllJobApplications();
    }

    @PostMapping
    public JobApplication saveJobApplication(@RequestBody JobApplication jobapplication) {
        return jobApplicationService.saveJobApplication(jobapplication);
    }
}
