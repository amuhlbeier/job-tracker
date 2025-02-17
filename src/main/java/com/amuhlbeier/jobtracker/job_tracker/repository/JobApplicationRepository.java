package com.amuhlbeier.jobtracker.job_tracker.repository;

import com.amuhlbeier.jobtracker.job_tracker.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
