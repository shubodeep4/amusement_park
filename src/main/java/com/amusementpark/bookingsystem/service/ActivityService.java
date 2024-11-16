package com.amusementpark.bookingsystem.service;

import com.amusementpark.bookingsystem.entity.Activity;
import com.amusementpark.bookingsystem.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }
}
