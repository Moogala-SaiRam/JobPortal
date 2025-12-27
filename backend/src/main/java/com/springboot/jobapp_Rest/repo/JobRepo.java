package com.springboot.jobapp_Rest.repo;


import com.springboot.jobapp_Rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String PostProfile,String PostDesc);

}



// method to return all JobPosts
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJob(JobPost job) {
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId){
//
//    for(JobPost job : jobs){
//        if(job.getPostId() == postId){
//            return job;
//        }
//    }
//    return null;
//}
//
//
//public void updateJob(JobPost jobPost) {
//
//    for(JobPost job : jobs){
//        if(job.getPostId() == jobPost.getPostId()){
//            job.setPostProfile(jobPost.getPostProfile());
//            job.setPostDesc(jobPost.getPostDesc());
//            job.setReqExperience(jobPost.getReqExperience());
//            job.setPostTechStack(jobPost.getPostTechStack());
//
//        }
//    }
//
//}
//
//public void deleteJob(int postId) {
//
//    for(JobPost job : jobs){
//        if(job.getPostId() == postId){
//            jobs.remove(job );
//        }
//    }
//}