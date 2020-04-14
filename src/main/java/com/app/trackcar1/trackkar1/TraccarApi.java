package com.app.trackcar1.trackkar1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/traccar")
public class TraccarApi {

    private List<Device> Devices;

    public TraccarApi(){
        Devices = new ArrayList<>();
        Devices.add(new Device(1L,"moje","386279","nowy",true));
        Devices.add(new Device(2L,"przemek","000000","nowy",true));
    }

    @GetMapping("/all")
    public List<Device> getDevicesAll() {
        return Devices;
    }

    @GetMapping
    public Device getById(@RequestParam int index) {
        Optional<Device> first = Devices.stream().filter(element ->element.getId() == index).findFirst();
        return first.get();
    }
}
