package com.app.trackcar1.trackkar1;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TraccarApi {

    private List<Device> Devices;

    public TraccarApi(){
        Devices = new ArrayList<>();
        Devices.add(new Device());


    }





}
